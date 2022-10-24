package com.skillstorm.review;

import java.util.Scanner;
import java.lang.ArithmeticException;

public class Test {
	
	public static void main(String[] args) {
//		Rectangle bob = new Rectangle();
//		Rectangle sue = new Rectangle(2.0, 1.5);
//		sue.setHeight(-1.11111);
//		sue.setWidth(-1.11111);
//		System.out.println(bob);
//		System.out.println(sue);
		

		Scanner scan = new Scanner(System.in);
		Rectangle rectangle = new Rectangle(); // gets a default 1  by 1 rectangle
		
		// Prompt user
		boolean userInputIsValid = false;
		while (!userInputIsValid) {
			System.out.println("Please enter the rectangle's height: ");
			double height = scan.nextDouble();
			try {
				rectangle.setHeight(height);
				userInputIsValid = true; // this will stop our loop - it will only run if the above line works
			} catch (IllegalArgumentException e) {
				// reprompt the user and cause the loop to continue
				System.out.println(e.getMessage());
			}
		}
		
		userInputIsValid = false;
		while (!userInputIsValid) {
			System.out.println("Please enter the rectangle's width: ");
			double width = scan.nextDouble();
			try {
				rectangle.setWidth(width);
				userInputIsValid = true; // this will stop our loop - it will only run if the above line works
			} catch (IllegalArgumentException e) {
				// reprompt the user and cause the loop to continue
				System.out.println(e.getMessage());
			}
		}
		System.out.println(rectangle);
		
		scan.close();
	}
	
	

}
