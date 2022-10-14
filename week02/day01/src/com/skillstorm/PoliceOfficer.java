package com.skillstorm;

public class PoliceOfficer {
	
	// PROPERTIES
	// qualities/features Objects HAVE
	// ways you describe an Object
	
	// class variables
	// ALL Objects of this class share these variables
	// "static" keyword makes a variable a class variable and NOT an instance variable
	public static boolean isUpstanding = true;
	
	// "final" keyword
	// once initialized, the value assigned to a "final" variable CANNOT be changed
	// class constant
	final public static String DISTRICT = "West New York";
	
	// instance variables
	// each Object of this class will have its own copy of these variables
	// assigned values will be defaults unless overwritten in a constructor
	// if declared but not initialized (e.g. public int height;), a default value will be assigned (generally some version of zero/nothing)
	public boolean isCertified = true;
	public String sidearmType = "Smith & Wesson";
	public String uniformColor = "Blue";
	public byte age = 35;
	public String upstandingStatus;
	
	// CONSTRUCTORS
	// special methods that build an Object from a class
	// each class has a default constructor
	
	// default constructor
	// exists whether we type it out or not
	public PoliceOfficer() {
		super();
	}
	
	// custom constructors
	public PoliceOfficer(boolean isCertified) {
		this.isCertified = isCertified;
	}
	
	public PoliceOfficer(boolean isCertified, String sidearmType, String uniformColor, byte age) {
		
		this.isCertified = isCertified;
		this.sidearmType = sidearmType;
		this.uniformColor = uniformColor;
		this.age = age;
		
	}
	
	
	// METHODS
	// things the class/Object can DO
	
	// static methods
	// call them using the class name, NOT the Object instance (PoliceOfficer.graduate();)
	public static void graduate() {
		System.out.println("Whoopee! I got my badge!");
	}
	
	// static methods can ONLY call static variable or other static methods
	// static methods need to work WITHOUT and BEFORE an instance of the Object, so instance variables/methods cannot be used
	// does not work because I'm trying to use a non-static variable (this.isCertified)
	//	public static void checkCertification() {
	//		if (this.isCertified) {
	//			System.out.println("I'm certified!");
	//		}
	//	}
	
	
	// instance methods
	// call them using the Object instance name (policeOfficerThree.shoot();)
	public void shoot() {
		System.out.println("Bang!");
	}
	
	public void rescueCat() {
		System.out.println("Come outta that tree, Cutie.");
	}
	
	public String checkUpstandingness() {
		if (isUpstanding) {
//			System.out.println("I am upstanding!");
			return "I am upstanding!";
		} else {
//			System.out.println("Bad cop! Bad cop!");
			return "Bad cop! Bad cop!";
		}
	}

}







