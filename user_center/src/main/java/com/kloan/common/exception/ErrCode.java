package com.kloan.common.exception;

/**
 * Author:  AsyncGo
 * Date:    2018/7/18 20:05
 * Description: 业务异常码
 **/
public enum ErrCode {

    //业务异常

    // 非业务异常
    BAD_PARAM(4000, "参数错误"),
    SYS_ERROR(6000, "系统错误");

    private int code;
    private String message;

    ErrCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
}
