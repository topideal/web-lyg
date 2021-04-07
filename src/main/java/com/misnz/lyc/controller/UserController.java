package com.misnz.lyc.controller;


import com.github.pagehelper.PageInfo;
import com.misnz.framework.annotation.Auth;
import com.misnz.framework.utils.SessionUtils;
import com.misnz.lyc.model.MessageVo;
import com.misnz.lyc.model.TUser;
import com.misnz.lyc.service.UserService;
import com.misnz.util.datatables.DataTable;
import com.misnz.util.datatables.DataTableParameter;
import com.misnz.util.datatables.DataTablesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by david on 2015/3/1.
 */

@Controller
@RequestMapping("/web/user")
public class UserController {
    @Autowired
    private UserService service;


    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "userLogin.do")
    @ResponseBody
    public ModelAndView userLogin(String loginId, String pwd, HttpServletRequest request) {
        try {

            TUser user = service.processUserLogin(loginId, pwd);
            if (user != null) {
                SessionUtils.setUser(request, user);
                return new ModelAndView("platform/index");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView("redirect:/");
    }


    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getUsersListByPaginator.do")
    @ResponseBody
    public DataTable getUsersListByPaginator(String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PageInfo<TUser> pageObj = service.getUsersListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<TUser> dt = new DataTable<TUser>();
            int sEcho = dataTableParam.getsEcho() + 1;
            dt.setAaData(pageObj.getList());
            dt.setsEcho(sEcho);
            dt.setiTotalDisplayRecords(Integer.parseInt(pageObj.getTotal() + ""));
            dt.setiTotalRecords(Integer.parseInt(pageObj.getTotal() + ""));

            return dt;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new DataTable();
    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delUsers.do")
    @ResponseBody
    public MessageVo delUsers(String userId) {
        try {
            service.delUsers(userId);

            return new MessageVo(200, null, "删除信息成功!");

        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }


}

