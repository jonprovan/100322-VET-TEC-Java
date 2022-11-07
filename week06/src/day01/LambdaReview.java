package day01;

import java.util.Arrays;
import java.util.List;

public class LambdaReview {
	
	/*
	 * OOP vs Functional Programming
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*
	 * What are the 4 principles of OOP?
	 * 1. Encapsulation - using access modifiers to restrict access "hiding data"
	 * 2. Abstraction  - hiding unnecessary details to the user (hide implementation dtails)
	 * 3. Polymorphism - "many types" making code reusable/adaptable for many types
	 * 4. Inheritance - one class inherits properties/methods from a parent class -- for code reusability "extensibility" 
	 */
	
	
	
	
	
	
	
	
	/*
	 * What are the 2 principles of Functional Programming?
	 * 1. functions are "first class" -- we can pass a function as an argument, we can return it as a value, can store in variable
	 * 2. pure functions -- doesn't mutate the state of anything in your program, only works with the data you pass in
	 * 
	 */
	
	
	
	
	
	
	
	/*
	 * Follow-up Question:
	 * - Are methods in Java treated as such?
	 * --- no, so we can't use functional programming without functional interfaces
	 */
	
	/*
	 * What is a "Functional Interface"?
	 * - an interface with ONE abtract method
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * What is a lambda function?
	 * - anonymous -- 
	 * - arrow -- 
	 * - dfn: lambda function is shorthand for creating a class that IMPLEMENTS a functional interface
	 */
	
	
	
	
	
	
	
	
	

	
	public static void main(String[] args) {
		Driveable myDriveable = new Motorcycle();
		List<String> peopleAtMotorcycleEvent = Arrays.asList("Tor", "Bob", "Joe");
		forEachMotorcycle(peopleAtMotorcycleEvent, myDriveable);

	}
	
	// for each we will hand write a method that runs the drive mehtod on each person at the mortorcycle even	
	public static void forEachMotorcycle(List<String> peopleAtEvent, Driveable driver) {
		// every element in my list, call the method
		for (String person : peopleAtEvent) {
			driver.drive(person);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* 
	 * Example: Built-in Functional Interfaces
	 * - Comparator --- compareTo takes in TWO arguments returns and INT
	 * - Predicate --- takes in ONE argument and returns a BOOLEAN
	 * - Consumer --- a built in interface that takes ONE argument and returns VOID
	 * - Supplier --- take in NO arguments and return ONE value ex: random number generator
	 * - Function --- takes in ANY type and returns ANY type
	 */
	
	
	
	

}
