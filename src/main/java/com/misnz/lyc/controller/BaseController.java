package com.misnz.lyc.controller;

import com.misnz.lyc.model.MessageVo;

/**
 * Created by Administrator on 2015/12/31.
 */


public class BaseController {
    public final static String CODE = "code";
    public final static String MSG = "msg";
    public final static String DATA = "data";
    public MessageVo sendData(int code, Object data, String message) {
        return new MessageVo(code,data,message);
    }

}
