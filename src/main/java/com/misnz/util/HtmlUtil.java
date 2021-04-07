package com.misnz.util;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HtmlUtil {

    /**
     * <br>
     * <b>功能：</b>输出json格式<br>
     *
     * @param response
     * @param jsonStr
     * @throws Exception
     */
    public static void writerJson(HttpServletResponse response, String jsonStr) {
        writer(response, jsonStr);
    }

    public static void writerJson(HttpServletResponse response, Object object) {
        try {
            response.setContentType("application/json");
            writer(response, JSON.toJSONString(object, false));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * <br>
     * <b>功能：</b>输出HTML代码<br>
     * <b>作者：</b>罗泽军<br>
     * <b>日期：</b> Dec 14, 2011 <br>
     *
     * @param response
     * @param htmlStr
     * @throws Exception
     */
    public static void writerHtml(HttpServletResponse response, String htmlStr) {
        writer(response, htmlStr);
    }

    private static void writer(HttpServletResponse response, String str) {
        try {
            StringBuffer result = new StringBuffer();
            //设置页面不缓存
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-type", "application/Json;charset=UTF-8");
            // response.setContentType("text/xml;charset=utf-8");
            // response.setHeader("Cache-Control", "no-cache");
            PrintWriter out = null;
            out = response.getWriter();
            out.print(str);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
