package com.yst.support.redis;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.JSON;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Configuration
@ConditionalOnProperty(name = "redis.mode", havingValue = "master-slave")
public class MasterSlaveRedisService implements IRedisService {
	protected Logger log = LoggerFactory.getLogger(getClass());
	@Autowired
	@Qualifier("slaveJedis")
	private JedisPool slaveJedis;
	@Autowired
	@Qualifier("masterJedis")
	private JedisPool masterJedis;

	@Override
	public void set(String key, String value) {
		Jedis jedis = null;
		try {
			jedis = masterJedis.getResource();
			jedis.set(key, value);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public String get(String key) {
		Jedis jedis = null;
		try {
			jedis = slaveJedis.getResource();
			String value = jedis.get(key);
			return value;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return null;
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public void del(String key) {
		Jedis jedis = null;
		try {
			jedis = masterJedis.getResource();
			jedis.del(key);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public boolean expire(String key, long expire, TimeUnit tu) {
		Jedis jedis = null;
		try {
			jedis = masterJedis.getResource();
			int seconds = 0;
			if (tu.equals(TimeUnit.MINUTES)) {
				seconds = (int) TimeUnit.MINUTES.toSeconds(expire);
			} else if (tu.equals(TimeUnit.HOURS)) {
				seconds = (int) TimeUnit.HOURS.toSeconds(expire);
			} else if (tu.equals(TimeUnit.DAYS)) {
				seconds = (int) TimeUnit.DAYS.toSeconds(expire);
			} else if (tu.equals(TimeUnit.MILLISECONDS)) {
				return jedis.pexpireAt(key, expire) > 0;
			}
			return jedis.expire(key, seconds) > 0;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public <T> void setList(String key, List<T> list) {
		String value = JSON.toJSONString(list);
		set(key, value);
	}

	@Override
	public <T> List<T> getList(String key, Class<T> clz) {
		String json = get(key);
		if (json != null) {
			List<T> list = JSON.parseArray(json, clz);
			return list;
		}
		return null;
	}

	@Override
	public long lpush(String key, Object obj) {
		Jedis jedis = null;
		try {
			jedis = masterJedis.getResource();
			return jedis.lpush(key, JSON.toJSONString(obj));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return 0;
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public long rpush(String key, Object obj) {
		Jedis jedis = null;
		try {
			jedis = masterJedis.getResource();
			return jedis.rpush(key, JSON.toJSONString(obj));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return 0;
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public String lpop(String key) {
		Jedis jedis = null;
		try {
			jedis = masterJedis.getResource();
			return jedis.lpop(key);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return null;
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public long incr(String key) {
		Jedis jedis = null;
		try {
			jedis = masterJedis.getResource();
			return jedis.incr(key);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return 0;
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public long incr(String key, int value) {
		Jedis jedis = null;
		try {
			jedis = masterJedis.getResource();
			return jedis.incrBy(key, value);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return 0;
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public boolean setNx(String key, String value) {
		Jedis jedis = null;
		try {
			jedis = masterJedis.getResource();
			return jedis.setnx(key, value) > 0;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public Long ttl(String key) {
		Jedis jedis = null;
		try {
			jedis = masterJedis.getResource();
			return jedis.ttl(key);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return -1L;
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public void sadd(String key, String value) {
		Jedis jedis = null;
		try {
			jedis = masterJedis.getResource();
			jedis.sadd(key, value);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public Set<String> smembers(String key) {
		Jedis jedis = null;
		try {
			jedis = slaveJedis.getResource();
			return jedis.smembers(key);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return null;
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

	@Override
	public boolean exists(String key) {
		Jedis jedis = null;
		try {
			jedis = slaveJedis.getResource();
			return jedis.exists(key);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		} finally {
			if (jedis != null)
				jedis.close();
		}
	}

}
