package com.skillstorm;

public class MethodChaining {

	public static void main(String[] args) {
		
		/*
		 *  METHOD CHAINING
		 *  
		 *  What if I want to do several things in a row to an Object?
		 *  
		 *  I could call each of the Object's methods one after another in separate lines of code
		 *  
		 *  OR, I could set up my methods so we could do them all at once.
		 *  
		 *  syntax without chaining:
		 *  
		 *  object.methodOne(param);
		 *  object.methodTwo(param);
		 *  object.methodThree(param);
		 *  
		 *  syntax with chaining: object.methodOne(param).methodTwo(param).methodThree(param);
		 *  
		 *  Either way, all three methods get run on the same Object, from left to right.
		 *  Return type for each method is an object, specifically the object we fed in at the start
		 */

		Horse horse = new Horse("Suzy Two-Shoes", 5);
		System.out.println(horse.toString());
		
//		horse.addHair(10);
//		
//		System.out.println(horse.toString());
//		
//		horse.addLotsOfHair(10);
//		
//		System.out.println(horse.toString());
//		
//		horse.addAnInsaneAmountOfHair(6);
//		
//		System.out.println(horse.toString());
		
		//does not work yet, because return types don't match
		//horse.addHair(10).addLotsOfHair(10).addAnInsaneAmountOfHair(6);
		
		horse.addHair(10).addLotsOfHair(10).addAnInsaneAmountOfHair(6);
		System.out.println(horse.toString());
		
		System.out.println();
		
		Horse greatHorse = new Horse("Johnny One-Shoe", 1);
		System.out.println(greatHorse.toString());
		
		greatHorse.addAnInsaneAmountOfHair(34).addHair(2).setName("Isaac").addHair(79).addLotsOfHair(809);
		System.out.println(greatHorse.toString());
		
		System.out.println();
		
		
		// toString() method
		Object object = new Object();
		// default memory location output
		System.out.println(object);
		// for Horse, we have overridden it, so it prints something more useful
		System.out.println(greatHorse.toString());
		
	}

}









