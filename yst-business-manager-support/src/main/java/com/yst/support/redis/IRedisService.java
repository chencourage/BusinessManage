package com.yst.support.redis;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public interface IRedisService {
    void set(String key, String value);  
    
    String get(String key);
    
    void del(String key);
    
    Long ttl(String key);
      
    boolean expire(String key,long expire,TimeUnit tu);  
      
    <T>void setList(String key ,List<T> list);  
      
    <T> List<T> getList(String key,Class<T> clz);  
      
    long lpush(String key,Object obj);  
      
    long rpush(String key,Object obj);  
      
    String lpop(String key);

	long incr(String key);
	
	long incr(String key,int value);

	boolean setNx(String key, String value);
	
	void sadd(String key,String value);
	
	Set<String> smembers(String key);
	
	boolean exists(String key);
}
