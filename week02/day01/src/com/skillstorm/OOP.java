package com.skillstorm;

public class OOP {

	public static void main(String[] args) {
		
		/*
		 * Object-Oriented Programming (OOP)
		 * 
		 * As opposed to procedural or functional programming
		 * 
		 * Intent is to create and include real-world objects in programming
		 * 
		 * -- allows us to create programs that are more dynamic in behavior
		 * -- a little more confusing because code is not necessarily sequential
		 * -- can create digital representations of real-world objects
		 * 
		 * ----------------------------------------------
		 * 
		 * 4 Pillars of OOP
		 * 
		 * Encapsulation
		 * Abstraction
		 * Inheritance
		 * Polymorphism
		 * 
		 * -----------------------------------------------
		 * 
		 * Encapsulation
		 * 
		 * Two pieces:
		 * 
		 * 1. Class-binding = wrapping properties and methods into a class
		 * 		What features does every Object in this class have?
		 * 		What can every Object in this class do?
		 * 2. Access control = how/when/by whom/by what can we alter the properties or use the methods?
		 * 
		 * -------------------------------------------------
		 * 
		 * Abstraction
		 * 
		 * Hiding the details of implementation from the "user"
		 * A "user" can be a real-life person OR another class or piece of code
		 * The "user" doesn't care HOW the code works, only THAT it works
		 * Abstract classes and interfaces are common usages
		 * Also some more complex patterns
		 * 
		 * -------------------------------------------------
		 * 
		 * Inheritance
		 * 
		 * Simplifying code through modularity/reusability
		 * 
		 * A class has properties and methods
		 * A class that inherits the first class may have additional properties and methods
		 * We don't need to recode the first class's properties and methods in the second class if it INHERITS the first
		 * Example: PoliceOfficer inherits from Person
		 * 	-- a PoliceOfficer IS-A Person; a Person is not necessarily a PoliceOfficer
		 * 	-- PoliceOfficer can inherit from Person to acquire its properties and methods
		 * 
		 * ---------------------------------------------------
		 * 
		 * Polymorphism = "many forms"
		 * 
		 * Methods can have multiple forms within a class or within an inheritance tree
		 * Overloading = within the same class, the same method name can take in different parameters
		 * Overriding = within an inheritance tree, a subclass can have the same method name/parameters with different functionality
		 * 
		 * 
		 */
		
		PoliceOfficer policeOfficerOne = new PoliceOfficer();
		PoliceOfficer policeOfficerTwo = new PoliceOfficer(false);
		PoliceOfficer policeOfficerThree = new PoliceOfficer(true, "Glock", "Black", (byte)46);
		
		
		System.out.println(policeOfficerOne.isCertified);
		System.out.println(policeOfficerTwo.isCertified);
		System.out.println(policeOfficerThree.isCertified);
		System.out.println(policeOfficerThree.sidearmType);
		System.out.println(policeOfficerThree.uniformColor);
		System.out.println(policeOfficerThree.age);
		
		
		

	}

}
