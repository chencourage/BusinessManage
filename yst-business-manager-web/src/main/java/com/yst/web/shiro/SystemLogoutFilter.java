package com.yst.web.shiro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yst.support.enums.ResponseEnum;
import com.yst.support.model.Response;
import com.yst.support.util.GoogleJsonUtils;

public class SystemLogoutFilter extends LogoutFilter {
	
	private static final Logger logger = LoggerFactory.getLogger(SystemLogoutFilter.class);
	 
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        Subject subject = getSubject(request, response);
        try {
            subject.logout();
        } catch (Exception ex) {
            logger.error("退出登录错误",ex);
        }
        this.writeResult(response);
        //不执行后续的过滤器
        return false;
    }
 
    private void writeResult(ServletResponse response){
        //响应Json结果
        PrintWriter out = null;
        try {
        	response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            out = response.getWriter();
            Response<String> resp = new Response<String>(ResponseEnum.SUCCESS);
            out.append(GoogleJsonUtils.toJson(resp));
        } catch (IOException e) {
            logger.error("返回Response信息出现IOException异常:" + e.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
