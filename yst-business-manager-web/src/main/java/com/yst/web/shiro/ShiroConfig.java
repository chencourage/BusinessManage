package com.yst.web.shiro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.crazycake.shiro.IRedisManager;
import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisClusterManager;
import org.crazycake.shiro.RedisManager;
import org.crazycake.shiro.RedisSentinelManager;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yst.support.Constants;
import com.yst.web.jwt.JWTFilter;

@Configuration
public class ShiroConfig {
	
	@Value("${redis.hosts}")
	private String redisHosts;
	
	@Value("${redis.mode}")
	private String mode;
	
	//@Value("${spring.redis.sentinel.master}")
	private String master;
	
	@Bean
    public static LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public static DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator=new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setUsePrefix(true);
        return defaultAdvisorAutoProxyCreator;
    }
    
    @Bean("securityManager")
    public DefaultWebSecurityManager getManager() {
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        manager.setRealms(Arrays.asList(authorizingRealm(), userRealm()));
        manager.setCacheManager(redisCacheManager());
        manager.setSessionManager(sessionManager());
        return manager;
    }
    
    @Bean("sessionManager")
    public DefaultWebSessionManager sessionManager() {
    	DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
    	sessionManager.setGlobalSessionTimeout(18000);
    	sessionManager.setDeleteInvalidSessions(true);
    	sessionManager.setSessionDAO(redisSessionDAO());
    	return sessionManager;
    }
    
    @Bean("shiroFilter")
    public ShiroFilterFactoryBean factory(DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        // 添加自己的过滤器并且取名为jwt
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("jwt", new JWTFilter());
        filterMap.put("logout", new SystemLogoutFilter());
        factoryBean.setFilters(filterMap);
        factoryBean.setSecurityManager(securityManager);
        factoryBean.setLoginUrl("/login");
        factoryBean.setUnauthorizedUrl("/forbidden");
        
        Map<String, String> filterRuleMap = new HashMap<>(2);
        filterRuleMap.put("/assets/**", "anon");
        filterRuleMap.put("/index.jsp", "anon");
        filterRuleMap.put("/login", "anon");
        filterRuleMap.put("/logout", "logout");
        filterRuleMap.put("/*.ico", "anon");
        filterRuleMap.put("/unauthorized", "anon");
        filterRuleMap.put("/test/qrcode", "anon");
        filterRuleMap.put("/forbidden", "anon");
        filterRuleMap.put("/webjars/**", "anon");
        filterRuleMap.put("/h5demo/**", "anon");
        //filterRuleMap.put("/**", "authc,user");
        filterRuleMap.put("/**", "jwt");
        factoryBean.setFilterChainDefinitionMap(filterRuleMap);
        return factoryBean;
    }
    
    @Bean("realm")
	public WebAuthorizingRealm authorizingRealm() {
    	WebAuthorizingRealm authorizingRealm = new WebAuthorizingRealm();
    	authorizingRealm.setCredentialsMatcher(hashedCredentialsMatcher());
		return authorizingRealm;
	}
    
    @Bean("credentialsMatcher")
    public WebCredentialsMatcher hashedCredentialsMatcher() {
    	return new WebCredentialsMatcher();
    }
    
    @Bean("userRealm")
	public UserRealm userRealm() {
    	UserRealm userRealm = new UserRealm();
    	userRealm.setCredentialsMatcher(userCredentialsMatcher());
		return userRealm;
	}
    
    @Bean("userCredentialsMatcher")
    public UserCredentialsMatcher userCredentialsMatcher() {
    	return new UserCredentialsMatcher();
    }
    
    public MemoryConstrainedCacheManager cacheManager() {
    	return new MemoryConstrainedCacheManager();
    }
    
    /**
     * cacheManager 缓存 redis实现
     * 使用的是shiro-redis开源插件
     *
     * @return
     */
    public RedisCacheManager redisCacheManager() {
        RedisCacheManager redisCacheManager = new RedisCacheManager();
        redisCacheManager.setRedisManager(redisManager());
        return redisCacheManager;
    }

    /**
     * 配置shiro redisManager
     * 使用的是shiro-redis开源插件
     *
     * @return
     */
    public IRedisManager redisManager() {
    	if("cluster".equals(mode)) {
    		RedisClusterManager redisClusterManager = new RedisClusterManager();
    		redisClusterManager.setHost(redisHosts);
    		redisClusterManager.setTimeout(60);
    		return redisClusterManager;
    	}else if("sentinel".equals(mode)){
    		RedisSentinelManager sentinelManager = new RedisSentinelManager();
    		sentinelManager.setHost(redisHosts);
    		sentinelManager.setMasterName(master);
    		sentinelManager.setTimeout(60);
    		return sentinelManager;
    	}else {
    		RedisManager redisManager = new RedisManager();
    		redisManager.setHost(redisHosts);
    		redisManager.setTimeout(60);//连接超时时间
    		return redisManager;
    	}
    }
    
    /**
     * RedisSessionDAO shiro sessionDao层的实现 通过redis
     * 使用的是shiro-redis开源插件
     */
    @Bean
    public RedisSessionDAO redisSessionDAO() {
        RedisSessionDAO redisSessionDAO = new RedisSessionDAO();
        redisSessionDAO.setRedisManager(redisManager());
        redisSessionDAO.setKeyPrefix(Constants.BUSINESS_MANAGER);
        redisSessionDAO.setExpire(Constants.DEFAULT_REDIS_EXPIRE);
        return redisSessionDAO;
    }
    
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }
}
