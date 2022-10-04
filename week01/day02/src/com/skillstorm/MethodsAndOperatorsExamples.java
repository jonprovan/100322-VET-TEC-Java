package com.skillstorm;

public class MethodsAndOperatorsExamples {
	
	public static void main(String[] args) {
		// Uncommment to run example 1
//		makeCookies();
//		int numberOfCookiesIWant = 6;
//		eatCookies(numberOfCookiesIWant);
		
		// Example 2 bike to the library
		bikeToLibrary();

	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	// Example 2: Bike to the Library
	/////////////////////////////////////////////////////////////////////////////////////
	
	// Only bike to the library if it is NOT raining and the library is open
	public static void bikeToLibrary() {
		float inchesOfRain = 1f;
		int time = 1200;
		if (!isItRaining(inchesOfRain) && isTheLibraryOpen(time)) {
			System.out.println("Biking to the library.");
		} else {
			System.out.println("Can't bike to the library.");
		}
		
	}
	
	// isItRaining takes in a float
	//    -- in Java float can store an int, byte, short, BUT NOT double
	
	/*
	 * Returns true if it is "raining"
	 * takes in the number of inches of rain 
	 */
	public static boolean isItRaining(float inchesOfRain) {
		if (inchesOfRain > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Returns true if the library and false if the library is closed
	 * Takes in the current time as an int in military time.
	 */
	public static boolean isTheLibraryOpen(int time) {
		// The library is open at 800 hours
		boolean hasOpened = time >= 800; 
//		// The libary is closed at 1700 hours
		boolean hasntClosedYet = time < 1700;
		
		// what we want to do but Java won't let us
//		if (800 <= time < 1700)
		
		// instead Java makes us do this
//		if (time >= 800 && time < 1700) {
		
		// Return true if both conditions evaluate to true
		if (hasOpened && hasntClosedYet) {
			return true;
		} else {
			return false;
		}
	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	// Example 1: Making Coookies
	/////////////////////////////////////////////////////////////////////////////////////
	public static void makeCookies() {
		System.out.println("Get the ingredients for your cookies");
		System.out.println("Mix the ingredients together");
		bakeCookies();
	}
	
	public static void bakeCookies() {
		System.out.println("Put the cookies in the oven for 12 minutes");
		System.out.println("Take the cookies out and let them cool before eating.");
	}
	
	public static void eatCookies(int numCookies) {
		System.out.println("I ate " + numCookies + " cookies. Yummm!");
	}

}
