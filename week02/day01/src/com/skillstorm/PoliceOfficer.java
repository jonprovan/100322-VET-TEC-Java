package com.skillstorm;

public class PoliceOfficer {
	
	// PROPERTIES
	// class variables
	// ALL Objects of this class share this variable
	// static keyword makes a variable a class variable and NOT an instance variable
	public static boolean isUpstanding = true;
	
	
	// instance variables
	// each Object of this class will have its own copy of these variables
	// assigned values will be defaults unless overwritten in a constructor
	// if declared but not initialized (e.g. public int height;), a default value will be assigned (generally some version of zero/nothing)
	public boolean isCertified = true;
	public String sidearmType = "Smith & Wesson";
	public String uniformColor = "Blue";
	public byte age = 35;
	
	// CONSTRUCTORS
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
	// instance methods
	public void shoot() {
		System.out.println("Bang!");
	}
	
	public void rescueCat() {
		System.out.println("Come outta that tree, Cutie.");
	}
}
