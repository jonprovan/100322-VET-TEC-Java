package com.skillstorm;

public class ControlFlowAndMethods {

	public static void main(String[] args) {
		System.out.println("M: This is my main method");
		
		System.out.println("M: It is awesome!");
		
		String result = otherMethod(30, "Park", 10000L);
		System.out.println("M: I just ran otherMethod");

		anotherMethod(result);
		System.out.println("M: I just ran anotherMethod");
		
		System.out.println("M: main is now ending");
	}

	public static String otherMethod(int numOfPeople, String location, long someNumber) {
		String result =  numOfPeople + " are at the " + location;
		System.out.println("OM:" + result);
		
		System.out.println("OM: This is my other method!");

		System.out.println("OM: It is really cool!");
		
		System.out.println("OM: otherMethod is now ending");
		
		return result;
	}
	
	public static void anotherMethod(String stuff) {
		int description = 3000;
		
		System.out.println("AM: This is my another method! " + stuff);
		
		System.out.println("AM: It is really really cool times " + description  + "!");
		System.out.println("AM: anotherMethod is now ending");
	}
	
	

} // this is the end of the class
