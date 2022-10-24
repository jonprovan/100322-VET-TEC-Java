package com.skillstorm.review;

public class HourlyEmployee implements Employee {
	
	int hoursWorked;
	int hourlyWage;
	@Override
	public void getPay() {
		System.out.println(hoursWorked * hourlyWage);
		
	}
	
	

}
