package com.skillstorm.review;

public class SalaryEmployee implements Employee {
	
	private int annualWage;

	@Override
	/*
	 * Returns the weekly pay
	 */
	public void getPay() {
		System.out.println(annualWage / 52);
		
	}
	

}
