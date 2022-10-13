package com.skillstorm;

// keyword "abstract" BEFORE the keyword "class" makes the class abstract
public abstract class Person {
	
	// an abstract class CAN have properties, both static and instance
	// class variables
	private static boolean alive = true;
	
	// instance variables
	private String name;
	private byte age;
	
	// constructors
	// abstract classes still have constructors, even though we can't instantiate them
	// useful for initializing variables, etc.
	public Person() {
		super();
	}
	
	public Person(String name, byte age) {
		this.name = name;
		this.age = age;
	}
	
	// methods
	// non-abstract methods ARE allowed
	public static void aliveCheck() {
		System.out.println(alive);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}
	
	// abstract methods

	// CANNOT implement an abstract method here
	// MUST implement it in the subclass (or a subclass of the subclass, etc.)
	// no curly braces for these -- just a semicolon after the parentheses
	public abstract void showDegree();
	public abstract void declareJob();
	public abstract void growUp();
	

}
