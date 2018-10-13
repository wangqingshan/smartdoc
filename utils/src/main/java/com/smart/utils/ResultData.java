package com.smart.utils;
import java.io.Serializable;
/**
 * R
 *
 * @Title: R.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2018/10/12 10:04
 * @Author 90
 */

public class ResultData<T> implements Serializable {

    private static final int OK = 0;
    private static final int FAIL = 1;
    private static final int UNAUTHORIZED = 2;
    private static final long serialVersionUID = -6373402751616512206L;

    private T data; //服务端数据
    private int status = OK; //状态码
    private String msg = ""; //描述信息

    public static ResultData isOk() {
        return new ResultData();
    }

    public static ResultData isFail() {
        return new ResultData().status(FAIL);
    }

    public static ResultData isFail(Throwable e) {
        return isFail().msg(e);
    }

    public ResultData msg(Throwable e) {
        this.setMsg(e.toString());
        return this;
    }

    public ResultData data(T data) {
        this.setData(data);
        return this;
    }

    public ResultData status(int status) {
        this.setStatus(status);
        return this;
    }
    //Constructors
    public ResultData() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
