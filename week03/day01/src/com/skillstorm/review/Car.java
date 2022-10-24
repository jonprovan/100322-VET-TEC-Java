package com.skillstorm.review;

public final class Car {
	/* Three places we can use final
	 * 1. on a variable -- this means you can set the value once and you can't 
	 *                     reset it
	 *                     to clarify, a instance variable a class variable (static)
	 *                     
	 * 2. on a class -- this means we can't create and subclasses 
	 *                  (the class cannot be extended)
	 * 
	 * 3. on a method -- this means the method cannot  be overridden in a child class
	 * 
	 * (4. you CANNOT use final on a local variable inside of a method)
	 */
	
//	private final String color;
	
	
	public void drive() {
		if (runEngine())
			System.out.println("Driving vroom vroom");
		else
			System.out.println("Something went wrong");
	}
	
	public void drive(int distance) {
		
	}
	
//	When overloading methods, they must have a unique signature (method and parameters)
//	public void drive(int time) {
//		
//	}
	
//	// Another common misconception is 
//	public int drive() {
//		
//	}
	
	
	private boolean runEngine() {
		return true; // the engine working fine
	}

}
