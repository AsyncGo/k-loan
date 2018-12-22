package com.kloan.common.exception;

import com.kloan.tool.StringTool;

/**
 * Author:  AsyncGo
 * Date:    2018/7/18 20:05
 * Description: 业务异常
 **/
public class BussException extends RuntimeException {

    private ErrCode errCode;

    public BussException(ErrCode errCode) {
        super(errCode.message());
        this.errCode = errCode;
    }

    public BussException(ErrCode errCode, String message) {
        super(message);
        this.errCode = errCode;
    }

    public BussException(ErrCode errCode, String format, Object... args) {
        super(StringTool.formatStr(format, args));
        this.errCode = errCode;
    }

    public int getCode() {
        return errCode.code();
    }
}
