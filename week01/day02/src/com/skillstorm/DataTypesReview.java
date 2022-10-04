package com.skillstorm;

public class DataTypesReview {
	
	public static void main(String[] args) {
		System.out.println("The MAX value of a double is " + Double.MAX_VALUE ); // 1.7976931348623157 x 10^308
		System.out.println("The MIN value of a double is " + Double.MIN_VALUE ); // 4.9 x 10^-324
		
		System.out.println();
		
		System.out.println("The MAX value of a float is " + Float.MAX_VALUE ); // 
		System.out.println("The MIN value of a float is " + Float.MIN_VALUE ); // .00000000 ... 14
		
		
		System.out.println();

		String s = "1" + 1;
		System.out.println(s); // String concatenation prints 11
		
		
		System.out.println("1" + 1 + 1); // String concatenation prints 111
		System.out.println("1" + (1 + 1)); // String concatenation prints 12 bc order of operations
		
		System.out.println();
		
		int x = 4 / 5; // int arithmetic can't keep track of 
		System.out.println(x);
		
		double y = 4.0 / 5; // NOT int arithmetic so will be a double and print 0.8
		System.out.println(y);
		
		// Type Casting
		int z = (int) 4.0 / 5;
		System.out.println(z);
		
		// DONT USE ONE LETTER NAMES FOR VARIABLES BE DESCRIPTIVE!
		boolean ready = true; // not as good a name for boolean
		boolean isReady = true;
		boolean isOn = false; // good name for a boolean variable
		
		// I can also 
		double a = ((double) 4) / 5; // int arithmetic can't keep track of 
		a = (double) (4 / 5); // int arithmetic can't keep track of 
		System.out.println(a);
		
		System.out.println(((Object)a ).getClass().getName());
		
		
	}

}
