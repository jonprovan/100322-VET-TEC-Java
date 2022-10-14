package com.skillstorm;

public class Abstraction {

	public static void main(String[] args) {
		
		// ABSTRACTION
		
		/*
		 * Abstraction is hiding the details of our code's implementation from the "user"
		 * -- "user" can mean an actual person using our code
		 * -- "user" can ALSO mean a different class or another piece of code
		 * 
		 * Two main ways we do this in Java:
		 * 
		 * Abstract Classes
		 * Interfaces
		 * 
		 * One of objectives here is "loose coupling"
		 * -- reducing the dependence on individual Objects and between individual Objects
		 * -- increasing modularity and reusability
		 * 
		 * ------------------------------------------
		 * 
		 * Abstract Class
		 * -- also known as a "partially-implemented" class
		 * 
		 * We have been creating fully-implemented classes so far
		 * 
		 * An abstract class can have static and/or instance properties
		 * -- can also have static and/or instance methods
		 * -- can ALSO-ALSO have abstract methods
		 * -- an abstract class CANNOT be instantiated
		 * 
		 * REQUIRES inheritance:
		 * Useful in instances where you'll never want to work directly with the parent class, only the subclass(es)
		 * -- all subclasses MUST implement the things that aren't implemented in the abstract superclass
		 * 
		 * 
		 * -----------------------------------------------
		 * 
		 * Interface
		 * 
		 * An interface is a pure abstraction
		 * -- can ONLY contain abstract methods
		 * -- can NOT contain any regular methods or constructors
		 * -- the ONLY type of property you can include in an interface is a static final property (must be initialized)
		 * 
		 * You CAN implement multiple interfaces
		 * -- one class cannot extend more than one class, but it CAN implement more than one interface
		 * 
		 */
		
		// can only do this if the class is NOT abstract
		//Person person = new Person();
		
		// can still run static methods on our abstract class, because static methods DO NOT REQUIRE an instance
		// Person.aliveCheck();
		
		// can do this because Nurse is not abstract
		Nurse nurse = new Nurse();
		
		// can do this because we're only using Person as a reference type
		Person otherNurse = new Nurse();
		
		// can NOT do this because we cannot instantiate a Person
		// Nurse thirdNurse = new Person();
		
		nurse.declareJob();
		System.out.println(nurse.getAge());
		nurse.growUp();
		System.out.println(nurse.getAge());
		
		System.out.println(nurse.getName());
		
		System.out.println();
		
		Person nurseWithProperties = new Nurse("Sarah", (byte)32, "R.N.", "White Pointy");
		
		System.out.println(nurseWithProperties.getName());
		System.out.println(nurseWithProperties.getAge());
		System.out.println(((Professional)nurseWithProperties).getDegreeName());
		System.out.println(((Nurse)nurseWithProperties).getHatType());
		
		System.out.println();
		
		Person teacherOne = new Teacher("Rob", (byte)45, "B.A.");
		
		System.out.println(teacherOne.getName());
		System.out.println(teacherOne.getAge());
		System.out.println(((Professional)teacherOne).getDegreeName());
		
		// can do this because Nurses and Teachers ARE Persons and Professionals
		Person[] personArray = { nurseWithProperties, teacherOne };
		// must cast if trying to fit a larger reference type into a smaller one
		// these Objects are considered Persons, so must cast to Professionals
		Professional[] professionalArray = { (Professional)nurseWithProperties, (Professional)teacherOne };
		
		System.out.println();
		
		int myCash = 50000;
		
		Guitar myGuitar = new Guitar("Fender");
		
		System.out.println(myGuitar.appraise());
		myGuitar.play();
		myGuitar.stop();
		
		System.out.println();
		
		
		// important to remember that, when passing a variable into a function,
		// the variable itself is NOT going, just the value
		System.out.println("myCash value BEFORE purchase:");
		System.out.println(myCash);
		
		System.out.println();
		
		myCash = myGuitar.buy(myCash);
		
		System.out.println("myCash value AFTER purchase:");
		System.out.println(myCash);
		
		System.out.println();
		
		myCash = myCash + myGuitar.auction();
		
		System.out.println("myCash value AFTER auction:");
		System.out.println(myCash);
		
		
		// can I do this?
		// yes, because Guitar IS A MusicalInstrument in that it follows all the rules
		MusicalInstrument myOtherGuitar = new Guitar("Gibson");
		CollectorsItem myAdditionalGuitar = new Guitar("Joe's Discount Axes");
		
		// CANNOT do this
		// you cannot instantiate an interface
		// Guitar myBogusGuitar = new MusicalInstrument();
		
		MusicalInstrument[] myInstruments = { myGuitar, myOtherGuitar, (MusicalInstrument)myAdditionalGuitar };
		
		System.out.println(nurseWithProperties);

	}

}













