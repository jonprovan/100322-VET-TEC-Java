package com.skillstorm;

public class Functions {

	// Made a function that prints hello world
	public static void helloWorld() {
		System.out.println("Hello World!");
	}
	
	// Function prints the first name
	public static void printFirstName(String firstName) { // firstName = ""
		System.out.println("Hello " + firstName);
	}
	
	// Parameters
	public static void printFullName(String firstName, String lastName, int age) {
		System.out.println(0);
	}
	
	public static void printNameAndBMI(String firstName, double bmi) {
		System.out.println(firstName + "'s BMI is: " + bmi);
	}
	
	// Void means returns nothing
	// Return types can be any Java data type
	public static int calculateSum(int x, int y) {
		int sum2 = x + y;
		return sum2;
	}
	
	public static int calculateProduct(int x, int y) {
		int product = x * y;
		return product;
		
	}
	
	public static int calculateDividend(int x, int y) {
		if (y == 0) {
			return 0;
		}
		return x / y;
	}
	
	// This is the main function
	public static void main(String[] args) {
		int sum = calculateSum(1, 1);
		System.out.println(calculateSum(20, 30));
		
		int product = calculateProduct(25, 30);
		System.out.println("The product is: " + product);
		
		/*
		 * A function takes in parameters and spits out a result 
		 * 
		 * Also known as method
		 * 
		 * Function/Method 
		 * Parameter/Argument - What we pass a function
		 * Return - The value given as the answer (Think calculator addition) AKA the Result
		 * Return type - The data type of the return value
		 * 
		 * Allows for code reuse.
		 * Helps our code read more like English
		 * 
		 * DRY -> Don't Repeat Yourself
		 * WET -> Write Everything Twice
		 * 
		 * DRY code is ideal
		 * 
		 * f(x) -> y
		 */
		
		// Invoke or call a function
		helloWorld();
		helloWorld();
		
		printFirstName("John");
		printFirstName("Sally");
		
//		System.out.println("Hello John");
//		System.out.println("Hello Sally");
		
		printFullName("John", "Doe", 52);
		printFullName("Sally", "Smith", 34);
		
		printNameAndBMI("John", 25.2);
		
		String firstName = "Troy";
		String lastName = "Dixon";
		
//		printFullName(firstName, lastName, false);
		printFullName(lastName, firstName, 0);
		
		// Functions with a return we can catch the result of
		calculateSum(100, 0); // We just do nothing with the value returned
		
		System.out.println("Sum: " + calculateSum(2, 1));
		
		
//		int sum = calculateSum(100, 50);
		System.out.println(sum);
		
		System.out.println(calculateDividend(10, 0));
	}
}