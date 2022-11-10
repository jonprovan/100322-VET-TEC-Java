package day04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTimePractice {
	
	/*
	 * TOPICS
	 * 1. java.util.Date  -- DO NOT USE ANYMORE
	 * 2. Calendar
	 * 3. DateFormat
	 * 4. Temporal classes - LocalDate, LocalTime, LocalDateTime
	 */
	
	public static void main(String[] args) {
		// Issues with old Date class
		// 1. unintuitive 
		//        - expecting the year as # years since 1900
		//        - month is 0 indexed -- so jan is 0, feb is 1, ... nov is 10
		//        - months and days overflow if too large -- would be better to warn us instead
		// 2. time and date aren't separable - can't just talk about date or just time
		// 3. time zones were handled 
		
		// Example 1: today
		Date today = new Date();
		System.out.println(today);
		
		// Example 2: tomorrow
		Date tomorrow = new Date(122, 10, 11); // deprecated = has been marked for removal
		System.out.println(tomorrow);
		
		// Example 3: enter invalid days for a month
		Date whatDate = new Date(122, 10, 31); // overflows Thu Dec 01 00:00:00 EST 2022
		System.out.println(whatDate);
		
		// WHAT IS THE EPOC?
		// number of milliseconds since the standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
		// y2K ISSUE if stored as 32-bit integer
//		long today = today.get(Calendar.)
		
		// Calendar - methods for converting between a specific instant in time and a set of calendar fields 
		//            such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields
		Calendar rightNow = Calendar.getInstance();
		int dayOfWeek = rightNow.get(Calendar.DAY_OF_WEEK); 
		System.out.println("right now the day of the week is " + dayOfWeek);
		int dayOfYear = rightNow.get(Calendar.DAY_OF_YEAR); 
		System.out.println("right now the day of the week is " + dayOfYear);
		int amOrPm = rightNow.get(Calendar.AM);
		System.out.println("right now the is it PM " + amOrPm);
		
		// DateFormat - can enter a date in a more intuitive way (string -> Date) or (Date -> string)
		// Example 1: Default format
		DateFormat formatter = DateFormat.getInstance();
		System.out.println(formatter.format(today));
		
		// Example 2: Choose a Locale
		DateFormat franceFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.FRANCE);
		System.out.println(franceFormatter.format(today));
		
		// Example 3: Using SimpleDateFormat to come up with our own String (instead SHORT, MEDIUM, LONG, FULL)
		SimpleDateFormat simpleFormatter = new SimpleDateFormat("EEE, d MMM yyyy");
		System.out.println(simpleFormatter.format(today));
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////
		// This is how we use dates in Java now
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		// Example: LocalDate today
		LocalDate todayDate = LocalDate.now();
		System.out.println(todayDate);
		
		// Example: yesterday
		LocalDate yesterdayDate = todayDate.minusDays(1);
		System.out.println(yesterdayDate);
		
		// Example: tomorrow
		LocalDate tomorrowDate = todayDate.plusDays(1);
		System.out.println(tomorrowDate);
		
		// Example: parse from string
		LocalDate newYearsDay = LocalDate.of(2023, 1, 1); 
		System.out.println(newYearsDay);
		
		LocalDate christmasDay = LocalDate.of(2022, Month.DECEMBER, 25);
		System.out.println(christmasDay);
		
		// Example: get the day in california
		LocalDate dayInCalifornia =  LocalDate.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(dayInCalifornia);
		
		// get all the zoneid's available
		for (String zone : ZoneId.getAvailableZoneIds()) {
			System.out.println(zone);
		}
		
		// Goal: get the day in New Zealand right now
		LocalDate dayInNewZealand = LocalDate.now(ZoneId.of("Australia/Lindeman"));
		System.out.println(dayInNewZealand);
		
		// Example: LocalTime today
		LocalTime timeNow = LocalTime.now(); // using 
		System.out.println("Here it is " + timeNow);
		
		// Example: LocalTime today in Australia
		LocalTime timeInAustralia = LocalTime.now(ZoneId.of("Australia/Lindeman"));
		System.out.println("In Australia it is " + timeInAustralia);
		
		LocalDateTime timeDateNow = todayDate.atTime(timeNow);
		System.out.println("To be exact, here it is now " + timeDateNow); // 2022-11-10T10:27:44.189 <--- uses "T" to separate date and time
		
		// Math with dates
		// Period
		// Duration 
		// difference: Period of 1 day is NOT always 24 hours vs duration of 1 day is always 24 hours
		LocalDate valentinesDay = LocalDate.of(2023, Month.FEBRUARY, 14);
		Period daysTillValentinesDay = Period.between(todayDate, valentinesDay);
		System.out.println(daysTillValentinesDay); // period itself
		System.out.println("Time until Valentines Day is " + daysTillValentinesDay.getMonths() + " months " + daysTillValentinesDay.getDays() + " days"); // just the days 
		
		// get someones age from their DOB
		LocalDate dateOfBirth = LocalDate.of(1963, Month.NOVEMBER, 22);
		Period timeAlive = Period.between(dateOfBirth, todayDate);
		System.out.println("Someone born on Nov 22, 1963 is now " + timeAlive.getYears());
		
		
	}

}
