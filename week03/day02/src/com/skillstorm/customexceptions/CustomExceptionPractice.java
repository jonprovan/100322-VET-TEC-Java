package com.skillstorm.customexceptions;

public class CustomExceptionPractice {

	public static void main(String[] args) {
		try {
		   doStuff();
		} catch (MyCheckedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of Main");
		// you do not inherit constructors
		MyCheckedException e = new MyCheckedException("something");
		// What does the enableSuppression and writeableToStack default to?
		//    -- It probably defaults to true === so we can write it to stack

	}
	
	public static void doStuff() throws MyCheckedException {
		// To throw a custom exception 
		// we need to create a class
		//    -- the convention to name the class with "Exception" at the end of the name
		throw new MyCheckedException("Something unexpected happened! Whoopsie daisies!");
	}

}
