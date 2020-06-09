package com.yst.service.dict.constants;

public class PageConstants {
	
	public static final String DATE_STR = "date";
	public static final String DATETIME_STR = "datetime";
	public static final String TIMESTAMP_STR = "timestamp";
	
	public static final String LIKE_STR = "like";
	public static final String IN_STR = "in";
	
	public static final String IS_BATCH_UPDATE = "1";
	
	public static final String PAGE_SQL = "SELECT * FROM (SELECT A.*, ROWNUM RN FROM ({Sql}) A WHERE ROWNUM <= :endRow) WHERE RN >= :startRow";
}
