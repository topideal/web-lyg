package com.misnz.lyc.controller;

import com.misnz.framework.annotation.Auth;
import com.misnz.lyc.model.MessageVo;
import com.misnz.lyc.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * Created by david on 2015/3/1.
 */

@Controller
@RequestMapping(value = "common")
public class CommonController extends BaseController {

    @Autowired
    private CommonService service;

    /**
     * 获取上传Token
     *
     * @return
     */
   @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "getUploadTokenByQN.do")
    @ResponseBody
    public MessageVo<String> getUploadTokenByQN() {
        try {
            return sendData(200, service.getUploadTokenByQN(), "数据获取成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sendData(204, "", "数据获取失败!");
    }
    /**
     * 获取上传Token
     *
     * @return
     */
   @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "getMp4UploadTokenByQN.do")
    @ResponseBody
    public MessageVo<String> getMp4UploadTokenByQN() {
        try {
            return sendData(200, service.getMp4UploadTokenByQN(), "数据获取成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sendData(204, "", "数据获取失败!");
    }


    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "getServerTime.do")
    @ResponseBody
    public MessageVo getServerTime() {
        try {

            return sendData(200, service.getServerTime(), "获取信息成功!");

        } catch (Exception e) {
            e.printStackTrace();
            // return sendData(204, "{}", e.getMessage());

        }
        return sendData(204, 0L, "获取信息失败!");
    }


    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "getSysConstant.do")
    @ResponseBody
    public MessageVo getSysConstant(Integer key) {
        try {

            return sendData(200, service.getSysConstant(key), "获取信息成功!");

        } catch (Exception e) {
            e.printStackTrace();

            return sendData(204, "", e.getMessage());
        }

    }


    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "getEncryptUrl.do")
    @ResponseBody
    public MessageVo getEncryptUrl(String str) {
        try {

            return sendData(200, service.getEncryptUrl(str), "获取信息成功!");

        } catch (Exception e) {
            e.printStackTrace();

            return sendData(204,"", e.getMessage());
        }

    }
}

