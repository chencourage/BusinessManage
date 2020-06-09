package com.yst.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.ShiroException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.yst.support.enums.ResponseEnum;
import com.yst.support.model.Response;

/**
 * 异常代理类
 * @author chenk	
 *
 */
@RestControllerAdvice
public class ExceptionController {
	
    // 捕捉shiro的异常
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(ShiroException.class)
    public Response<String> handle401(ShiroException e) {
        return new Response<String>(ResponseEnum.UNAUTHORIZED.getCode(), e.getMessage());
    }
 
    // 捕捉UnauthorizedException
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthorizedException.class)
    public Response<String> handle401() {
    	return new Response<String>(ResponseEnum.UNAUTHORIZED.getCode(), ResponseEnum.UNAUTHORIZED.getMsg());
    }
 
    // 捕捉其他所有异常
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Response<String> globalException(HttpServletRequest request, Throwable ex) {
        return new Response<String>(getStatus(request).value()+"", ex.getMessage(), null);
    }
 
    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
