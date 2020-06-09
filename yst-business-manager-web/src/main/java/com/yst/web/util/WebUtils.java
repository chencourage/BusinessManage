package com.yst.web.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yst.support.Constants;

public class WebUtils {
	protected static Logger log = LoggerFactory.getLogger(WebUtils.class);
	
	/**
	 * 将一些数据放到ShiroSession中,以便于其它地方使用
	 * 
	 * @see 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
	 */
	public static final void setSession(Object key, Object value) {
		Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			Session session = currentUser.getSession();
			if (null != session) {
				session.setAttribute(key, value);
			}
		}
	}
	
	public static final void saveCurrentUser(Object user) {
		setSession(Constants.CURRENT_USER, user);
	}

	/** 保存当前用户 */
	public static final void saveCurrentUser(HttpServletRequest request, Object user) {
		setSession(request, Constants.CURRENT_USER, user);
	}
	/**
	 * 将一些数据放到ShiroSession中,以便于其它地方使用
	 * 
	 * @see 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
	 */
	public static final void setSession(HttpServletRequest request, String key, Object value) {
		HttpSession session = request.getSession();
		if (null != session) {
			session.setAttribute(key, value);
		}
	}

	/** 移除当前用户 */
	public static final void removeCurrentUser(HttpServletRequest request) {
		request.getSession().removeAttribute(Constants.CURRENT_USER);
	}
	/** 获取当前用户 */
	public static final Object getCurrentUser() {
		Subject currentUser = SecurityUtils.getSubject();
		if (null != currentUser) {
			try {
				Session session = currentUser.getSession();
				if (null != session) {
					return session.getAttribute(Constants.CURRENT_USER);
				}
			} catch (InvalidSessionException e) {
				log.error(e.getMessage());
			}
		}
		return null;
	}

	/** 获取当前用户 */
	public static final Object getCurrentUser(HttpServletRequest request) {
		try {
			HttpSession session = request.getSession();
			if (null != session) {
				return session.getAttribute(Constants.CURRENT_USER);
			}
		} catch (InvalidSessionException e) {
			log.error(e.getMessage(),e);
		}
		return null;
	}
}
