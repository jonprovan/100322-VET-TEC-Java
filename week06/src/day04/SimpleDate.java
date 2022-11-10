package day04;

public class SimpleDate {
	
	// Implementing Date functionality
	// What functionality would you want?
	int day;
	int month;
	int year;
	
	int hour;
	int minutes;
	int seconds;
	// nanoseconds
	double nanoseconds;
	// or miliseconds -- redundant if alreayd have nanoseconds
	
	public void setDate(int day, int month, int year) {
		
	}
	
	public void setDay(int day) {
		
	}
	
	
	
	public SimpleDate getDate() {
		return this;
	}
	
	// determine
	public boolean isLeapYear() {
		return year % 4 == 0;
	}
	
	// TIME ZONE METHODS!
	
	// toString methods
	// Jan 1, 2022
	// 2022-01-01

}
