package com.yst.support.redis;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.JSON;

import redis.clients.jedis.JedisCluster;
@Configuration
@ConditionalOnProperty(name="redis.mode",havingValue="cluster")
public class ClusterRedisService implements IRedisService {
	@Autowired
	private JedisCluster jedis;

	@Override
	public void set(String key, String value) {
		jedis.set(key, value);
	}

	@Override
	public String get(String key) {
		return jedis.get(key);
	}

	@Override
	public void del(String key) {
		jedis.del(key);
	}

	@Override
	public boolean expire(String key, long expire, TimeUnit tu) {
		int seconds = 0;
		if(tu.equals(TimeUnit.MINUTES)) {
			seconds = (int) TimeUnit.MINUTES.toSeconds(expire);
		}else if(tu.equals(TimeUnit.HOURS)) {
			seconds = (int) TimeUnit.HOURS.toSeconds(expire);
		}else if(tu.equals(TimeUnit.DAYS)) {
			seconds = (int) TimeUnit.DAYS.toSeconds(expire);
		}else if(tu.equals(TimeUnit.MILLISECONDS)) {
			return jedis.pexpireAt(key, expire)>0;
		}
		return jedis.expire(key, seconds)>0;
	}

	@Override
	public <T> void setList(String key, List<T> list) {
		 String value = JSON.toJSONString(list);  
	     set(key,value);
	}

	@Override
	public <T> List<T> getList(String key, Class<T> clz) {
		String json = get(key);  
        if(json!=null){  
            List<T> list = JSON.parseArray(json, clz);  
            return list;  
        }  
        return null;
	}

	@Override
	public long lpush(String key, Object obj) {
		return jedis.lpush(key, JSON.toJSONString(obj));
	}

	@Override
	public long rpush(String key, Object obj) {
		return jedis.rpush(key, JSON.toJSONString(obj));
	}

	@Override
	public String lpop(String key) {
		return jedis.lpop(key);
	}

	@Override
	public long incr(String key) {
		return jedis.incr(key);
	}

	@Override
	public boolean setNx(String key, String value) {
		return jedis.setnx(key, value)>0;
	}

	@Override
	public long incr(String key, int value) {
		return jedis.incrBy(key,value);
	}

	@Override
	public Long ttl(String key) {
		return jedis.ttl(key);
	}

	@Override
	public void sadd(String key, String value) {
		jedis.sadd(key, value);
	}

	@Override
	public Set<String> smembers(String key) {
		return jedis.smembers(key);
	}

	@Override
	public boolean exists(String key) {
		return jedis.exists(key.getBytes());
	}

}
