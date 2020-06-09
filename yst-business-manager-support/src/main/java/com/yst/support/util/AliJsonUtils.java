package com.yst.support.util;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class AliJsonUtils {
	
    /**
     * 把对象转换成json字符串
     * @param object 待转换的对象
     * @return json格式的字符串
     */
    public static String toJson(Object object) {
    	return JSON.toJSONString(object);
    }
    
    /**
     * 把对象转换成json字符串,包含空值
     * @param object
     * @return
     */
    public static String toJsonContainsNull(Object object) {
    	return JSON.toJSONString(object,SerializerFeature.WriteMapNullValue);
    }

    /**
     * json字符串转换成对象
     * @param jsonStr json格式的字符串
     * @param clz 目标对象的Class对象
     * @return 目标对象
     */
    public static <T> T fromJson(String jsonStr, Class<T> clz) {
    	return JSON.parseObject(jsonStr, clz);
    }

	@SuppressWarnings("rawtypes")
	public static <T> T mapToObject(Map map,Class<T> tclass){
		String jsonStr = AliJsonUtils.toJson(map);
		T instance = AliJsonUtils.fromJson(jsonStr,tclass);
		return instance;
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String,Object> objectToMap(Object obj){
		String jsonStr = AliJsonUtils.toJson(obj);
		return AliJsonUtils.fromJson(jsonStr,Map.class);
	}
	
	/**
	 * jsonToArray(json字符串转成集合对象)
	 * @param type
	 * @param json
	 * @return List<T>
	*/
	public static <T> List<T> jsonToArray(String json,Class<T> type) {
		return JSON.parseArray(json, type);
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String, Object> jsonToMap(String json) throws Exception {
		if(null == json)
			return null;
		return JSON.parseObject(json, Map.class);
	}

}
