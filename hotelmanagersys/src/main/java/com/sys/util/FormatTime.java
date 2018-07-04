package com.sys.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class FormatTime {
	public static Date getDateFormat(Date date)
	{	
		
		DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		String string=dateFormat.format(date);
		Date date2=new Date();
		date2.setTime(Long.valueOf(string));
		return date2;
	}
}
