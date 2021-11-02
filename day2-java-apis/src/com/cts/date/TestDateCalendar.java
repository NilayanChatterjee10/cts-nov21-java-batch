package com.cts.date;

import java.util.Calendar;
import java.util.Date;

public class TestDateCalendar {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date); // prints date & time both
		System.out.println("Year: "+date.getYear()); // if its 1996, it returns 96
		System.out.println("Month: "+date.getMonth()); // 0 to 11
		
		Calendar calendar = Calendar.getInstance();
		System.out.println("Year: "+calendar.get(Calendar.YEAR));
		System.out.println("Month: "+calendar.get(Calendar.MONTH));
		System.out.println("Day: "+calendar.get(Calendar.DAY_OF_MONTH));
		
		// date is also present in java.sql
		
		java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
		System.out.println(sqlDate);
		System.out.println("Month: "+sqlDate.getMonth());
	}
}
