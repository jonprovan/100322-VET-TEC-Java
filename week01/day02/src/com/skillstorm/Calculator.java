package com.skillstorm;

public class Calculator {

	public static void main(String[] args) {
		// pass in values to your method here
		// your code goes here
		int a = 7;
		int b = 14;

		divide(a,b);
		System.out.println();
		add(a,b);
		System.out.println();
		subtract(a,b);
		System.out.println();
		multiply(a,b);
		
	}

	//
	public static void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	// add three more methods called subtract/multiply/divide
	public static void subtract(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));

	}

	public static void multiply(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));

	}

	public static void divide(double a, double b) {
		if (b != 0) {
	        System.out.println(a + " / " + b + " = " + (a / b));
	        System.out.println("b is not 0 so we were able to proceed.");
		} else {
			System.out.println("b is 0, cannot proceed.");
		}
		// this will break when input b is 0 and any further method calls will not continue
//		System.out.println(a + " / " + b + " = " + (a / b));
		
		
		
		//////////////////////////
		// Alternative to if-else is making the execution of the code stop
//		if (b == 0)
//			return;
//		
//		System.out.println(a + " / " + b + " = " + (a / b));
		
	}

}
