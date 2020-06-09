package com.yst.support.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;

public class DateUtils {
	
	public static final String YYYY_MM_DD = "yyyy-MM-dd";
	public static final String HH_MM_SS = "HH:mm:ss";
	public static final String YYYY_MM_DD_HH_MM_SS  = "yyyy-MM-dd HH:mm:ss";
	public static final String YYYY_MM_DD_HHMMSS  = "yyyy-MM-dd HHmmss";
	public static final SimpleDateFormat FORMAT_YYYY_MM_DD = new SimpleDateFormat("yyyy-MM-dd");
	public static final String YYYYMMDDHHMMSS  = "yyyyMMddHHmmss";
	public static final String YYYY_MM = "yyyy-MM";
	public static final String YYYY_DOT_MM_DOT_DD = "yyyy.MM.dd";
	
	/**
	 * 年月格式化时间
	 * @param date
	 * @return
	 */
	public static String formatDateWithYm(Date date) {
		SimpleDateFormat FORMAT_YYYY_MM = new SimpleDateFormat("yyyy-MM");
		return FORMAT_YYYY_MM.format(date);
	}
	
	
	public static Date getDateByStr(String str) throws ParseException{
		Date date;
		DateFormat fmt = new SimpleDateFormat(YYYY_MM_DD);
		date=fmt.parse(str);
		return date;
	}
	public static Date getTimeByStr(String str) throws ParseException{
		Date date;
		DateFormat fmt = new SimpleDateFormat(YYYY_MM_DD_HHMMSS);
		date=fmt.parse(str);
		return date;
	}
	
	public static Date getDateByStr(String str, String pattern)
			throws ParseException {
		Date date;
		DateFormat fmt = new SimpleDateFormat(pattern);
		date = fmt.parse(str);
		return date;
	}
	
	public static String getStatDate() {
		DateFormat fmt = new SimpleDateFormat(YYYY_MM_DD);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, -1);
		
		String stat_day = fmt.format(cal.getTime());
		return stat_day;
	}
	
	public static String getNowDate() {
		DateFormat fmt = new SimpleDateFormat(YYYY_MM_DD);
		Calendar cal = Calendar.getInstance();
		String stat_day = fmt.format(cal.getTime());
		return stat_day;
	}
	
	public static String getStatDate(Calendar calendar) {
		DateFormat fmt = new SimpleDateFormat(YYYY_MM_DD);
		
		String stat_day = fmt.format(calendar.getTime());
		return stat_day;
	}
	
	
	public static Calendar getCalendar(String dateStr, String pattern) {
		DateFormat fmt = new SimpleDateFormat(pattern);
		Date date = null;
		Calendar calendar = null;
		try {
			date = fmt.parse(dateStr);
			calendar = Calendar.getInstance();
			calendar.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return calendar;
	}
	
	/**
	 * long型时间转换成String格式
	 * @param dateTime 需要转换的时间
	 * @param pattern 需要转换时间的格式
	 * @return
	 */
	public static String getFormatDateString(long dateTime, String pattern) {
		DateFormat fmt = new SimpleDateFormat(pattern);
		Date date = new Date(dateTime);
		return fmt.format(date);
	}
	
	/**
	 * long型时间转换成String格式
	 * @param dateTime 需要转换的时间
	 *    默认转换成"yyyy-MM-dd HH:mm:ss"格式
	 * @return
	 */
	public static String getFormatDateString(long dateTime) {
		DateFormat fmt = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
		Date date = new Date(dateTime);
		return fmt.format(date);
	}
	
	/**
	 * 获取long型时间
	 * @param dateStr 需要转换的时间
	 * @param pattern 需要转换时间的格式
	 * @return
	 */
	public static long getDateLong(String dateStr, String pattern) {
		DateFormat fmt = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = fmt.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date.getTime();
	}
	
	/**
	 * YYYY_MM_DD_HH_MM_SS时间转换成long型时间
	 * @param dateStr 需要转换的时间
	 * @param pattern 需要转换时间的格式
	 * @return
	 */
	public static long getDateLong(String dateStr) {
		return getDateLong(dateStr, YYYY_MM_DD_HH_MM_SS);
	}
	
	public static long getHourMillis(int hour, int min, int seconds, int millis) {
		
		return hour*60*60*1000 + min*60*1000 + seconds*1000 + millis;
	}
	
	public static long getHourMillis(Calendar calendar) {
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int min = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		int millis = calendar.get(Calendar.MILLISECOND);
		return getHourMillis(hour, min, seconds, millis);
	}
	
	/**
	 * 根据毫秒数获取日期时间HH-mm-ss
	 * 使用时请注意一天的最大毫秒数
	 * @param millis
	 * @return
	 */
	public static String getStr4HourByMil(long millis) {
		String bResult = "";
		int iRemainder = 0;
		int iHour  = (int)millis/(60*60*1000);
		iRemainder = (int)millis%(60*60*1000);
		int iMinute = (int)iRemainder/(60*1000);
		iRemainder = (int)millis%(60*1000);
		int iSecond = (int)iRemainder/(1000);
		bResult = addZero(iHour)+":"+addZero(iMinute)+":"+addZero(iSecond);
		return bResult;
	}
	
	private static String addZero(int i){
		i = Math.abs(i);
		return i<10?"0"+i:i+"";
	}
	
	/**
	 * 获取上一个周日 yyyyMMdd
	 */
	public static String getPreSunday(String statDay) {
		return getPreSunday(statDay, FORMAT_YYYY_MM_DD);
	}
	
	/**
	 * 获取上一个周日 yyyyMMdd
	 */
	public static String getPreSunday(String statDay, SimpleDateFormat dateFormat) {
		try {
			Date date = dateFormat.parse(statDay);
			Calendar calendar = Calendar.getInstance();	
			calendar.setTime(date);		
			
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			int md;
			if(dayOfWeek==Calendar.SUNDAY) {
				md = -7;
			} else {
				md = 1 - dayOfWeek;
			}
			calendar.add(Calendar.DAY_OF_MONTH, md);
			
			Date d = calendar.getTime();
			return dateFormat.format(d);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
		
	}
	
	/**
	 * 获取weeks周之前的的周一
	 */
	public static String getPreWeeksMonday(String statDay, int weeks) {
		return getPreWeeksMonday(statDay, weeks, FORMAT_YYYY_MM_DD);
	}
	
	/**
	 * 获取weeks周之前的的周一
	 */
	public static String getPreWeeksMonday(String statDay, int weeks, SimpleDateFormat dateFormat) {
		try {
			String preSunday = getPreSunday(statDay);
			Date date = dateFormat.parse(preSunday);
			
			Calendar calendar = Calendar.getInstance();	
			calendar.setTime(date);		// statDay时间
			
			calendar.add(Calendar.DAY_OF_MONTH, 1-7*weeks);
			Date d = calendar.getTime();
			return dateFormat.format(d);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获取当天的开始的时间long值.
	 */
	public static long getStartLong(String yyyy_mm_dd) {
		Date d = null;
		try {
			d = FORMAT_YYYY_MM_DD.parse(yyyy_mm_dd);			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return d.getTime();
	}
	
	/**
	 * 获取当天的结束的时间long值.
	 */
	public static long getEndLong(String yyyy_mm_dd) {
		Calendar cal = Calendar.getInstance();	
		try {
			Date d = FORMAT_YYYY_MM_DD.parse(yyyy_mm_dd);			
			cal.setTime(d);	
			
			cal.add(Calendar.DAY_OF_YEAR, 1);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return cal.getTimeInMillis()-1;
	}
	
	
	public static String afterNDay(int n){   
		Calendar c=Calendar.getInstance();   
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");   
		c.setTime(new Date());   
		c.add(Calendar.DATE,n);   
		Date d2=c.getTime();   
		String s=df.format(d2);   
		return s;   
		}  
	
	/**
	 * 获取2个日期的天数间隔
	 * @return
	 */
	public static long getDaysBetween(Date startDate, Date endDate){
		if(startDate==null || endDate==null) 
			return 0L;
		long startDay = startDate.getTime()/(24*60*60*1000);
		long endDay = endDate.getTime()/(24*60*60*1000);
		return endDay-startDay;
	}
	
	/**
	 * 年月日格式化时间
	 * @param date
	 * @return
	 */
	public static String formatDateWithoutTime(Date date){
		return FORMAT_YYYY_MM_DD.format(date);
	}
	
	/**
	 * 根据Date来获取当天日期。
	 * 返回Date日期。
	 * @throws ParseException 
	 * 
	 */
	public static Date getDate(Date date){
		Date newDate = null;
		try{
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String dates = dateFormat.format(date);
			newDate = dateFormat.parse(dates);
		}catch(Exception e){
			e.printStackTrace();
		}
		return newDate;
	}

	/**
	 * 获取当月开始时间
	 * @return
	 */
	public static Date getCurrentMonthStartDate(){
		Date result = null;
		String start = getMonthFirstDay() + " 00:00:00";
		DateFormat dateFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
		try {
			result = dateFormat.parse(start);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	/**
	 * 获取当月的结束时间
	 * @return
	 */
	public static Date getCurrentMonthEndDate(){
		Date result = null;
		String end = getMonthLastDay() + " 23:59:59";
		DateFormat dateFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
		try {
			result = dateFormat.parse(end);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * 获取当月第一天的日期
	 * @return
	 */
	public static String getMonthFirstDay() {     
	    Calendar calendar = Calendar.getInstance();     
	    calendar.set(Calendar.DAY_OF_MONTH, calendar
	            .getActualMinimum(Calendar.DAY_OF_MONTH));     
	    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    return dateFormat.format(calendar.getTime());     
	}  
	/**
	 * 获取当月最后一天日期
	 * @return
	 */
	public static String getMonthLastDay(){
		Calendar calendar = Calendar.getInstance();  
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    return dateFormat.format(calendar.getTime());     
	}
	

	/**
	 * 获取指定日期下n个月的第一天
	 * @param date
	 * @return
	 */
	public static Date getNextNMonthFirstTimeByDate(Date date,int n) {
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    calendar.add(Calendar.MONTH, n);
	    calendar.set(Calendar.DAY_OF_MONTH,1);
	    calendar.set(Calendar.HOUR_OF_DAY, 0);
	    calendar.set(Calendar.MINUTE, 0);
	    calendar.set(Calendar.SECOND, 0);
	    calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}	
	
	/**
	 * 获取指定日期下n个月的最后一天
	 * @param date
	 * @return
	 */
	public static Date getNextNMonthLastTimeByDate(Date date,int n) {
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    calendar.add(Calendar.MONTH, n+1);
	    calendar.set(Calendar.DAY_OF_MONTH,0);
	    calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMaximum(Calendar.HOUR_OF_DAY));
	    calendar.set(Calendar.MINUTE, calendar.getActualMaximum(Calendar.MINUTE));
	    calendar.set(Calendar.SECOND, calendar.getActualMaximum(Calendar.SECOND));
	    calendar.set(Calendar.MILLISECOND, calendar.getActualMaximum(Calendar.MILLISECOND));
		return calendar.getTime();
	}
	
	/**
	 * 获得在指定日期上加上特定月数的日期
	 * @param date
	 * @param month
	 * @return
	 */
	public static Date getDateByMonth(Date date,int month) {
	    Calendar calendar = Calendar.getInstance();   
	    calendar.setTime(date);
	    calendar.add(Calendar.MONTH, month);
		return calendar.getTime();
	}
	
	
	
	/**
	 * 获取下一个月最开始时刻
	 * @return
	 */
	public static Date getNextMonthFirstTime() {
		return getNextNMonthFirstTime(1);
	}
	
	/**
	 * 获取下n个月最开始时刻
	 * @param n
	 * @return
	 */
	public static Date getNextNMonthFirstTime(int n) {
		return getNextNMonthFirstTime(n, new Date());
	}
	
	/**
	 * 获取下n个月最开始时刻
	 * @param n
	 * @param date
	 * @return
	 */
	public static Date getNextNMonthFirstTime(int n, Date dependDate) {
		Calendar c = Calendar.getInstance();
		c.setTime(dependDate);
		c.add(Calendar.MONTH, n);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}
	
	/**
	 * 获取下一个月的最后时刻
	 * @return
	 */
	public static Date getNextMonthLastTime() {
		return getNextNMonthLastTime(1);
	}
	
	/**
	 * 获取下n个月的最后时刻
	 * @param n
	 * @return
	 */
	public static Date getNextNMonthLastTime(int n) {
		return getNextNMonthLastTime(n, new Date());
	}
	
	/**
	 * 获取下n个月的最后时刻
	 * @param n
	 * @param dependDate
	 * @return
	 */
	public static Date getNextNMonthLastTime(int n, Date dependDate) {
		Calendar c = Calendar.getInstance();
		c.setTime(dependDate);
		c.add(Calendar.MONTH, n);
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c.set(Calendar.HOUR_OF_DAY, c.getActualMaximum(Calendar.HOUR_OF_DAY));
		c.set(Calendar.MINUTE, c.getActualMaximum(Calendar.MINUTE));
		c.set(Calendar.SECOND, c.getActualMaximum(Calendar.SECOND));
		c.set(Calendar.MILLISECOND, c.getActualMaximum(Calendar.MILLISECOND));
		return c.getTime();
	}
	
	
	/**
	 * 获取两个日期相差月份 date1 - date2
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int getMonthSpace(Date date1, Date date2) {
		Calendar c1 = Calendar.getInstance();
		c1.setTime(date1);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(date2);
		
		return Math.abs((c1.get(Calendar.YEAR) - c2.get(Calendar.YEAR))*12 + (c1.get(Calendar.MONTH) - c2.get(Calendar.MONTH)));
	}
	
	 /**
     * 获取传入时间的下N天
     * @param date
     * @return
     */
    public static Date getNextNDay(Date date, int n) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        calendar.add(Calendar.DATE, n);  
        date = calendar.getTime();  
        return date;  
    }  
	
	
	/** 
     * 获取当前时间的后一天时间 
     * @param cl 
     * @return 
     */  
    public static Calendar getAfterDay(Calendar cl){  
        int day = cl.get(Calendar.DATE);  
        cl.set(Calendar.DATE, day+1);  
        return cl;  
    }  
	
    /**
     * 获取前一天日期
     * @param date
     * @return
     */
    public static Date getPreviousDay(Date date) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        calendar.add(Calendar.DAY_OF_MONTH, -1);  
        date = calendar.getTime();  
        return date;  
    }  
    
	/**
	 * 获取参数date月份下N的最后一天，时分秒为00:00:00
	 * @param n
	 * @param dependDate
	 * @return
	 */
	public static Date getNextNMonthLastDate(int n, Date dependDate) {
		Calendar c = Calendar.getInstance();
		c.setTime(dependDate);
		c.add(Calendar.MONTH, n);
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c.set(Calendar.HOUR_OF_DAY, c.getActualMaximum(Calendar.HOUR_OF_DAY));
		c.set(Calendar.HOUR, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}
	
	/**
	 * 判断日期字符串是否是符合指定格式的日期
	 * @param dateStr 日期字符串
	 * @param pattern 日期格式
	 * @return true/false
	 */
	public static boolean isDate(String dateStr, String pattern) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			sdf.parse(dateStr);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * 获取按照时间升序的 Map
	 * @param startDay 
	 * @param endDay
	 * @return
	 * @throws ParseException 
	 */
	public static Map<String,Object> getOrderdayMap(String startDay,String endDay) throws ParseException{
		
		if(StringUtils.isBlank(startDay) || StringUtils.isBlank(endDay)){
			throw new ParseException("时间参数为空", 0);
		}
		
		Map<String,Object> map = new TreeMap<>();
		List<String> orderdayList = getOrderdayList(startDay, endDay);
		for (String day : orderdayList) {
			map.put(day, null);
		}
		
		return map;
	}
	/**
	 * 获取按照时间升序的 Map
	 * @param startDay
	 * @param endDay
	 * @return
	 * @throws ParseException 
	 */
	public static List<String> getOrderdayList(String startDay, String endDay) throws ParseException{

		if(StringUtils.isBlank(startDay) || StringUtils.isBlank(endDay)){
			throw new ParseException("时间参数为空", 0);
		}
		
		List<String> lDate = new ArrayList<>(); 
		Calendar cal = Calendar.getInstance(); //使用给定的 Date 设置此 Calendar 的时间 
		cal.setTime(getDateByStr(startDay)); 
		lDate.add(formatDateWithoutTime(cal.getTime()));
		 Date endTime = getDateByStr(endDay);
		while (true) { //根据日历的规则，为给定的日历字段添加或减去指定的时间量 
			cal.add(Calendar.DAY_OF_MONTH, 1); // 测试此日期是否在指定日期之后 
			if (endTime.after(cal.getTime())) { 
				lDate.add(formatDateWithoutTime(cal.getTime())); 
				continue;
			} 
			break;
		}
		lDate.add(formatDateWithoutTime(cal.getTime()));
		return lDate; 
	}

}
