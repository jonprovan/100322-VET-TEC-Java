package com.skillstorm.review;

public class Quiz2Review {
	
	// fully encapsulate the class by making everything 
	private String name;
	private int number;
	
	public static void main(String[] args) {
		// Data hiding vs implementation details hiding
		// 
		

		// abstraction is hiding the details of how the class works
		// simplify the user's experience by only showing them
		// the methods they need to know about
		Car myCar = new Car();
		myCar.drive();
//		myCar.runEngine(); // this is an implementation detail the user 
		                   // doesn't need to know about
		
		SportsCar sportyCar = new SportsCar();
		SportsCar expensiveCar = new Tesla();
		
		// BAD do not do this, instead use polymorphism
		if (sportyCar instanceof SportsCar) {
			// do something
		} else if (sportyCar instanceof Tesla ) {
			// do something else
		}
		
		sportyCar.drive();
		expensiveCar.drive(); // This is runtime polymorphism 
		                      //  -- the body of the method to run is chosen
		                      //     at runtime not compile time
		
		sportyCar.wheels = 3;
		System.out.println("sportyCar is " + sportyCar);
		System.out.println("expensiveCar is " + expensiveCar);
		
		/*
		 * INTERFACES vs ABSTRACT CLASSES
		 * - abstract classes can have abstract methods - methods without a body 
		 *                                                so no definition in { }
		 *                                              - and they can have 
		 *                                                concrete methods that
		 *                                                have a definition
		 * - interfaces are like completely abstract classes - none of their methods
		 *                                                     have defnitions
		 *                                                   - it is just a 
		 *                                                     guarentee that all
		 *                                                     classes that implement
		 *                                                     it will have certain
		 *                                                     behaviour
		 *  NOTE: Import use cases
		 *  1. You have subclasses that share some lines of code
		 *     -- use abstract class that has some concrete methods
		 *  2. You want to define some non-static non-final instance variables
		 *        in the superclass
		 *     -- use an abstract class (interfaces can only have static final variables)
		 *  3. You want a subclass of another class to be able to implement this as well
		 *     -- use an interface bc Java does not support multiple inheritance 
		 *        (a class cannot extend more than one class, but it can implement 
		 *          any number of interfaces)
		 */
		
		
	}
	
	/*
	 * What is polymorphism?
	 * 
	 *  - is the ability for the compiler and runtime JVM to choose a the appropriate
	 *     method body
	 */
	
	/* OVERLOADING vs OVERRIDING
	 * 
	 * 1. overloading - multiple methods of the same name in a class (different signatures)
	 *                - is compile time polymorphism
	 * 
	 * 2. overriding - methods with same name and parameters (same signature)
	 *                 in a superclass and subclass 
	 *               - is runtime polymorphism
	 *               
	 * When you add new methods to a child class, this is not called overloading or overriding
	 *    it is just extending functionality
	 *    
	 * When you add new properties to a child class, this not called overloading or overriding
	 *    it is just extending the properties you are able to store
	 */
	

	
}
