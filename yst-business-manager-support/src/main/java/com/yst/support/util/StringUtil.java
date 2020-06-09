package com.yst.support.util;

import java.io.File;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 */
public class StringUtil {
	
	/**大写字母模式*/
	public static final Pattern PATTERN_UPPER_LETTER = Pattern.compile("[A-Z]");
	/**数字、字母模式*/
	public static final Pattern PATTERN_LETTER_NUM = Pattern.compile("[A-Za-z0-9]");
	 /**金额为分的格式 */  
    public static final String CURRENCY_FEN_REGEX = "\\-?[0-9]+";  
	
	/**
	 * 通过报名获取路径,com.cg.model -> com/cg/model 或 com\cg\model
	 * @param packageName
	 * @return
	 */
	public static String getPathByPackage(String packageName) {
		String[] pkgFragment = packageName.split("\\.");
		return StringUtils.join(pkgFragment, File.separator);
	}
	
	/**
	 * 把单词首字母转成大写
	 * @param word
	 * @return
	 */
	public static String convertFirstLetter2Upper(String word) {
		return (word.charAt(0) + "").toUpperCase() + word.substring(1);
	}
	
	/**
	 * 下划线命名->Camel命名，如：last_update_time -> lastUpdateTime
	 * @return
	 */
	public static String underline2CamelNaming(String source) {
		String[] words = source.split("_");
		words[0] = words[0].toLowerCase();
		if (words.length == 1) {
			return words[0];
		}
		
		String word = null;
		for (int i = 1, len = words.length; i < len; i++) {
			word = convertFirstLetter2Upper(words[i]);
			words[i] = word;
		}
		return StringUtils.join(words);
	}
	
	/**
	 * 下划线命名->Pascal命名，如：last_update_time -> LastUpdateTime
	 * @param source
	 * @return
	 */
	public static String underline2PascalNaming(String source) {
		String[] words = source.split("_");
		String word = null;
		for (int i = 0, len = words.length; i < len; i++) {
			word = convertFirstLetter2Upper(words[i]);
			words[i] = word;
		}
		return StringUtils.join(words);
	}
	
	/**
	 * Camel命名->下划线命名，如：lastUpdateTime -> last_update_time 
	 * @param source
	 * @return
	 */
	public static String camelNaming2Underline(String source) {
		StringBuffer buffer = new StringBuffer();
		
		Matcher matcher = PATTERN_UPPER_LETTER.matcher(source);
		String upperLetter = null;
		while (matcher.find()) {
			upperLetter = matcher.group(0);
			matcher.appendReplacement(buffer, "_" + upperLetter.toLowerCase());
		}
		matcher.appendTail(buffer);
		return buffer.toString();
	}
	
	/**
	 * Pascal命名->Camel命名
	 * @param source
	 * @return
	 */
	public static String pascalNaming2Camel(String source) {
		return (source.charAt(0) + "").toLowerCase() + source.substring(1);
	}
	
	/**
	 * 判断字符串是否为
	 * 
	 * @param str 目标字符
	 */
	public static boolean isEmpty(String str) {
		return str == null || str.trim().isEmpty();
	}
	
	/**
	 * 判断字符串是否为
	 * 
	 * @param value 目标字符
	 */
	public static boolean isStrEmpty(Object value) {
		return (value==null||"null".equals(value.toString()) || value.toString().isEmpty());
	}
	
	/**
	 * 判断字符是否非空
	 * @param str 目标字符
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	/**
	 * 判断字符串是否属于数据的子元素
	* @Title: isBelongArray 
	* @Description: 
	* @param array
	* @param str
	* @return    
	* boolean
	* @throws
	 */
	public static boolean isBelongArray(String[] array,String str){
		if(null==array || array.length==0 || isEmpty(str)){
			return false;
		}
		for(int i=0;i<array.length;i++){
			//循环查找字符串数组中的每个字符串中是否包含所有查找的内容
		   if(equalsIgnoreCase(array[i], str)){
			 //查找到了就返回真，不在继续查询
			   return true;
		   }
		}
		//没找到返回false
		return false;
	}
	
	/**
	 * 判断字符串是否为数字可包含小数点
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str){ 
		Pattern pattern = Pattern.compile("^\\d+(\\.\\d+)?$"); 
		Matcher isNum = pattern.matcher(str);
		if( !isNum.matches() ){
		   return false; 
		} 
		return true; 
	}
	
	/**
	 * 转换成字符串,空字符串返回""
	 * @param value
	 * @return
	 */
	public static String toString(Object value){
		return toString(value, false);
	}
	
	/**
	 * 转换成字符串
	 * @param value
	 * @param ifEmptyRetrunNull 是否为空字符串时返回null
	 * @return
	 */
	public static String toString(Object value, boolean ifEmptyRetrunNull){
		return isStrEmpty(value)?"":value.toString().trim(); 
	}
	
	
	/**
	 * 去除空字符串
	 * @param value
	 * @return
	 */
	public static String trimEmptyToNull(String value){
		return isStrEmpty(value)?null:value;
	}
	
	public static float toFloat(Object value){
		return isStrEmpty(value)?0:Float.parseFloat(value.toString().trim()); 
	}
	public static Double toDouble(Object value){
		return isStrEmpty(value)?0:Double.parseDouble(value.toString().trim()); 
	}
	public static long toLong(Object value){
		return isStrEmpty(value)?0:Long.parseLong(value.toString().trim()); 
	}
	public static long toShort(Object value){
		return isStrEmpty(value)?0:Short.parseShort(value.toString().trim()); 
	}
	public static long toByte(Object value){
		return isStrEmpty(value)?0:Byte.parseByte(value.toString().trim()); 
	}
	public static int toInt(Object value){
		return isStrEmpty(value)?0:Integer.parseInt(value.toString().trim()); 
	}
	public static boolean equalsIgnoreCase(String val1,String val2){
		if(isStrEmpty(val1)) return false;
		if(isStrEmpty(val2)) return false;
		return val1.equalsIgnoreCase(val2);
	}
	public static boolean equals(String val1,String val2){
		if(isStrEmpty(val1)) return false;
		if(isStrEmpty(val2)) return false;
		return val1.equals(val2);
	}
	
	
	/**
	 * 格式化金额
	 * @param amount 金额
	 * @return
	 */
	public static String formatAmount(Double amount) {
		if (amount == null) {
			return "";
		}
		return new DecimalFormat("0.00").format(amount);
	}
	
	/**
	 * 格式化百分数小数
	 * @param percent
	 * @return
	 */
	public static String formatPercent(Double percent) {
		if (percent == null) {
			return "";
		}
		return new DecimalFormat("0.00##").format(percent);
	}

	/**
	 * 将字符串形式表示元转换为字符串表示的分
	 * @param decimalText 字符串元
     * @return decimalText不是数字，返回空；其余情况返回截取两位小数转换后的元<br />
	 * 如，'1.2',返回 '120'<br />
	 * '1.267', 返回 '126'<br />
	 * '1.2ade', 返回 ''<br />
     */
	public static String yuanToFen(String decimalText) {
		if(isEmpty(decimalText)) {
			return "";
		}
		BigDecimal bd;
		try {
			 bd = new BigDecimal(decimalText);
		} catch (NumberFormatException ne) {
			return "";
		}
		return bd.multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_DOWN).toPlainString();
	}

	/** 
     * 将分为单位的转换为元 （除100） 
     *  
     * @param amount 
     * @return 
     * @throws Exception  
     */  
    public static String fenToYuan(String amount) throws Exception{  
    	if(isEmpty(amount)) {
			return "";
		}
        /*if(!amount.matches(CURRENCY_FEN_REGEX)) {  
            throw new Exception("金额格式有误,amount:"+amount);  
        }  */
        return BigDecimal.valueOf(Double.valueOf(amount)).divide(new BigDecimal(100)).toString();  
    }
    
    /** 
     * 将分为单位的转换为元 （除100） 
     *  
     * @param amount 
     * @return 
     * @throws Exception  
     */  
    public static String fenToYuanF(String amount) throws Exception{  
    	if(isEmpty(amount)) {
			return "";
		}
        /*if(!amount.matches(CURRENCY_FEN_REGEX)) {  
            throw new Exception("金额格式有误,amount:"+amount);  
        }  */
    	return new DecimalFormat("#0.00##").format(BigDecimal.valueOf(Double.valueOf(amount)).divide(new BigDecimal(100)));  
    }
    
    /** 
     * 将分为单位的转换为元 （除100） 
     *  
     * @param amount 
     * @return 
     * @throws Exception  
     */
    public static String fenToYuanForce(String amount) throws Exception{
    	if(isEmpty(amount)){
    		return "0.00";
    	}
    	return new DecimalFormat("#0.00##").format(BigDecimal.valueOf(Double.valueOf(amount)).divide(new BigDecimal(100)));
    }
    
    /**
     * @param amount
     * @return
     * @throws Exception
     */
    public static String formatAmount(String amount) throws Exception {
    	if(isEmpty(amount)){
    		return "0.00";
    	}
    	return new DecimalFormat("#0.0##").format(Double.valueOf(amount));
    }
	/**
	 * 将字符串形式表示分转换为字符串表示的元
	 * @param decimalText 字符串分
	 * @return decimalText不是数字，返回空；<br />
	 * 如，'120',返回 '1.20'<br />
	 * '1.2ade', 返回 ''<br />
	 */
	public static String dividedByOneHundred(String decimalText) {
		if(isEmpty(decimalText)) {
			return "";
		}
		BigDecimal bd;
		try {
			bd = new BigDecimal(decimalText);
		} catch (NumberFormatException ne) {
			return "";
		}
		return bd.divide(new BigDecimal(100)).toPlainString();
	}

	/**
	 * 设置字符串形式表示的浮点数的精度
	 * @param decimalText 字符串浮点数
	 * @param scale 精度
     * @return 成功返回-要求精度的字符串浮点数；失败返回-空字符串
     */
	public static String setStrFloatScale(String decimalText, int scale) {
		if(isEmpty(decimalText)) {
			return "";
		}
		try {
			BigDecimal bd = new BigDecimal(decimalText);
			return bd.setScale(scale, BigDecimal.ROUND_DOWN).toPlainString();
		}catch (NumberFormatException ne) {
			return "";
		}
	}
	
    /**
     * unicode转中文
     * @param str
     * @return
     */
	private static Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
	public static String unicodeToString(String str) {
        Matcher matcher = pattern.matcher(str);
        char ch;
        while (matcher.find()) {
            ch = (char) Integer.parseInt(matcher.group(2), 16);
            str = str.replace(matcher.group(1), ch+"" );
        }
        return str;
    }
	
	public static String genSign(Map<String,Object> signBody) throws Exception{
		TreeMap<String, Object> tempMap = new TreeMap<String, Object>();
        for (Map.Entry<String, Object> param : signBody.entrySet()) {
            if (null!=param.getValue()) {
            	if(param.getValue() instanceof Double){
            		tempMap.put(param.getKey(), ((Double)param.getValue()).intValue());
            	}else{
            		tempMap.put(param.getKey(), param.getValue());
            	}
            }
        }
        StringBuffer buf = new StringBuffer();
        for (String key : tempMap.keySet()) {
            buf.append(key).append("=").append(StringUtil.toString(tempMap.get(key))).append("&");
        }
        String signatureStr = buf.substring(0, buf.length() - 1);
        return signatureStr;
	}
	
	/**
	 * 替换字符串中指定的最后一个字符串
	 * @param text
	 * @param regex
	 * @param replacement
	 * @return
	 */
	public static String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)"+regex+"(?!.*?"+regex+")", replacement);
    }
	
	/**
	 * 替换两个字符串之间的内容包含
	 * @param text
	 * @param startText
	 * @param endText
	 * @param replacement
	 * @return
	 */
	public static String replaceBetweenIn(String text,String startText,String endText,String replacement) {
		return text.replaceAll("("+startText+")[^&]*("+endText+")", replacement);
	}
	
	/**
	 * 替换两个字符串之间的内容不包含
	 * @param text
	 * @param startText
	 * @param endText
	 * @param replacement
	 * @return
	 */
	public static String replaceBetweenOut(String text,String startText,String endText,String replacement) {
		return text.replaceAll("(?<="+startText+")[^&]*(?="+endText+")", replacement);
	}
	
	public static void main(String[] args) {
		System.out.println(replaceBetweenIn("1122335566","22","55","aaaaa"));
		System.out.println(replaceBetweenOut("112233555566","22","55","aaaaa"));
		System.out.println(replaceLast("1122335566","5","aaaaa"));
		System.out.println(unicodeToString("\\u5174\\u4e1a\\u94f6\\u884c"));
	}
}
