package com.misnz.framework.interceptor;

import com.misnz.framework.annotation.Auth;
import com.misnz.framework.utils.SessionUtils;
import com.misnz.util.HtmlUtil;
import com.misnz.util.VarUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceResolver;
import org.springframework.mobile.device.DeviceResolverHandlerInterceptor;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


/**
 * 权限拦截器
 *
 * @author lu
 */
public class AuthInterceptor extends DeviceResolverHandlerInterceptor {
    private final DeviceResolver deviceResolver;


    public AuthInterceptor(DeviceResolver deviceResolver) {
        this.deviceResolver = deviceResolver;
    }
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        Device device = this.deviceResolver.resolveDevice(request);
        request.setAttribute("currentDevice", device);

        HandlerMethod method = (HandlerMethod) handler;
        Auth auth = method.getMethod().getAnnotation(Auth.class);
        ////验证登陆超时问题  auth = null，默认验证
        if (auth != null && auth.verifyLogin()) {
            String baseUri = request.getContextPath();
            if("".equals(baseUri)){
                baseUri="/";
            }
            String path = request.getServletPath();
            Object user = SessionUtils.getUser(request);

            //  System.out.println("path====" + path);
            if (user == null) {
                if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) { //如果是ajax请求响应头会有，x-requested-with
                    response.setHeader("sessionstatus", "timeout");//在响应头设置session状态
                    return false;
                } else if (path.endsWith(".do")) {
                    response.setStatus(response.SC_GATEWAY_TIMEOUT);
                    response.sendRedirect(baseUri);
                    return false;
                } else {
                    response.setStatus(response.SC_GATEWAY_TIMEOUT);
                    Map<String, Object> result = new HashMap<String, Object>();
                    result.put(VarUtil.SUCCESS, false);
                    result.put(VarUtil.LOGOUT_FLAG, true);//登录标记 true 退出
                    result.put(VarUtil.MSG, "登录超时.");
                    HtmlUtil.writerJson(response, result);
                    return false;
                }
            }
        }
        //验证URL权限
        if (auth != null && auth.verifyURL()) {
            //判断是否超级管理员
            if (!SessionUtils.isAdmin(request)) {
                String menuUrl = StringUtils.remove(request.getRequestURI(), request.getContextPath());
                if (!SessionUtils.isAccessUrl(request, StringUtils.trim(menuUrl))) {
                    //日志记录
                   // String userName = ((TMgUser)SessionUtils.getUser(request)).getLoginId();
                   /* String msg = "URL权限验证不通过:[url=" + menuUrl + "][userName =" + userName + "]";
                    log.error(msg);*/

                    response.setStatus(response.SC_FORBIDDEN);
                    Map<String, Object> result = new HashMap<String, Object>();
                    result.put(VarUtil.SUCCESS, false);
                    result.put(VarUtil.MSG, "没有权限访问,请联系管理员.");
                    HtmlUtil.writerJson(response, result);
                    return false;
                }
            }
        }
        return super.preHandle(request, response, handler);
    }


}
