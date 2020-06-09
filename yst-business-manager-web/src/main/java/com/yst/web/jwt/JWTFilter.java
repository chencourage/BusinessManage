package com.yst.web.jwt;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yst.support.enums.ResponseEnum;
import com.yst.support.model.Response;
import com.yst.support.util.GoogleJsonUtils;
import com.yst.web.util.UserDto;

public class JWTFilter extends BasicHttpAuthenticationFilter {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//30分钟后刷新token
    private static final int tokenRefreshInterval = 60 * 10 * 3;
	
    /**
     *
     */
    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String bearerToken = httpServletRequest.getHeader(AUTHORIZATION_HEADER);
        bearerToken = resolveToken(bearerToken);
        if(StringUtils.isEmpty(bearerToken)) {
        	return false;
        }
        JWTToken token = new JWTToken(bearerToken);
        try {
	        // 提交给realm进行登入，如果错误他会抛出异常并被捕获
        	Subject subject = getSubject(request, response);
        	subject.login(token);
	        return onLoginSuccess(token, subject, request, response);//登录成功验证token有效性
	    } catch (AuthenticationException e) {
	    	logger.error(e.getMessage(),e);
	        return onLoginFailure(token, e, request, response);
	    } catch (Exception e) {
	    	logger.error(e.getMessage(),e);
			return false;
		}
    }
    
    @Override
	protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
			ServletResponse response) throws Exception {
		HttpServletResponse httpResponse = WebUtils.toHttp(response);
		if(token instanceof JWTToken){//自动刷新token
			JWTToken jwtToken = (JWTToken) token;
	        boolean shouldRefresh = shouldTokenRefresh(Objects.requireNonNull(JWTUtil.getIssuedAt((String)jwtToken.getPrincipal())));
	        if (shouldRefresh) {
	            //生成新的TOKEN
	        	UserDto user = (UserDto) subject.getPrincipal();
	            String newToken = JWTUtil.sign(user.getUsername(),user.getEncryptPwd());
	            httpResponse.setHeader(AUTHORIZATION_HEADER, newToken);
	        }
		}
		return true;
	}
    
    /**
     * @param bearerToken
     * @return
     */
    private String resolveToken(String bearerToken){
        if (StringUtils.isNotEmpty(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7, bearerToken.length());
        }
        return null;
    }
 
    /**
     * 
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
    	if(this.isLoginRequest(request, response))
            return true;
        boolean allowed = false;
        try {
            allowed = executeLogin(request, response);
        } catch(IllegalStateException e){ //not found any token
        	logger.error("Not found any token");
        }catch (Exception e) {
        	logger.error("Error occurs when login", e);
        }
        return allowed || super.isPermissive(mappedValue);
    }
    
    /**
     * 这里重写了父类的方法，使用我们自己定义的Token类，提交给shiro。这个方法返回null的话会直接抛出异常，进入isAccessAllowed（）的异常处理逻辑。
     */
    /*@Override
    protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse servletResponse) {
        String jwtToken = getAuthzHeader(servletRequest);
        if(StringUtils.isNotBlank(jwtToken)&&!JWTUtil.isTokenExpired(jwtToken))
            return new JWTToken(jwtToken);
        return null;
    }*/
    
    @Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        if (logger.isTraceEnabled()) {
        	logger.trace("Attempting to access a path which requires authentication.  Forwarding to the Authentication url [" + this.getLoginUrl() + "]");
        }
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        Response<String> resp = new Response<String>(ResponseEnum.UNAUTHORIZED.getCode(), ResponseEnum.UNAUTHORIZED.getMsg());
        out.println(GoogleJsonUtils.toJson(resp));
        out.flush();
        out.close();
        return false;
	}

	/**
     * 判断是否需要刷新TOKEN
     * @param issueAt token签发日期
     * @return 是否需要刷新TOKEN
     */
    private boolean shouldTokenRefresh(Date issueAt) {
        LocalDateTime issueTime = LocalDateTime.ofInstant(issueAt.toInstant(), ZoneId.systemDefault());
        return LocalDateTime.now().minusSeconds(tokenRefreshInterval).isAfter(issueTime);
    }

	/**
     * 对跨域提供支持
     */
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
        // 跨域时会首先发送一个option请求，这里我们给option请求直接返回正常状态
        if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
            httpServletResponse.setStatus(HttpStatus.OK.value());
            return false;
        }
        return super.preHandle(request, response);
    }
}
