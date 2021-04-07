package com.misnz.lyc.model;

import java.io.Serializable;

/**
 * Created by david on 2017/9/22.
 */


public class MessageVo<T> implements Serializable {

    private Integer code;

    private T data;

    private String msg;
    public MessageVo(Integer code, T data, String msg){
        this.code=code;
        this.data= data;
        this.msg=msg;

    }
    public MessageVo(){


    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
