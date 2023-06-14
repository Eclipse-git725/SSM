package com.gxy.controller;

import com.gxy.exception.BussinessException;
import com.gxy.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //记录日志
        // 发送消息给运维
        // 发送消息给开发人员
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    @ExceptionHandler(BussinessException.class)
    public Result doBussinessException(BussinessException ex){
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        return new Result(Code.SYSTEM_UNKNOW_ERR, null, "系统繁忙，请稍后重试");
    }
}
