// package declaration
package com.skillstorm;

// class declaration
public class Operators {
	
	public static void main(String[] args) {
		
		/*
		 * OPERATORS
		 * An operator is something that does an operation
		 * 
		 * Mathematical Operators:
		 * 
		 * + -- Addition (2 + 2 == 4)
		 * - -- Subtraction (2 - 2 == 0)
		 * * -- Multiplication (2 * 2 == 4)
		 *  / -- Division (2 / 2 == 1)
		 * % -- Modulo (returns the remainder of a division operation) (2 % 2 == 0, 3 % 2 == 1, 2 % 7 == 0)
		 * 
		 * = -- Assignment operator (assigns the value on the right to the variable or whatever on the left)
		 * 		myNumber = 3 assigns the value 3 to the variable myNumber
		 * 		This operator returns a value -- if (myBoolean = true) (return myBoolean = true;) (return myInt = 5;)
		 * += -- adds the value on the right to the variable on the left, then assigns the new value to the variable
		 * 		myInt = 5; myInt += 5; now myInt == 10
		 * -=
		 * *=
		 *  /=
		 * %=
		 * 
		 * ++ -- increases the value of a variable by 1
		 * -- (decreases the value of a variable by 1
		 * 		myInt++; and ++myInt; have the same result
		 * 
		 * 
		 * 
		 * Boolean Operators:
		 * Asks a true/false question, returns the answer as a boolean
		 * 
		 * ----------- Single boolean question
		 * == -- Logical equals, is the value on the left equal to the value on the right?
		 * < -- less than, is the value on the left less than the value on the right?
		 * > -- greater than
		 * <= -- less than or equal
		 * >= -- greater than or equal
		 * 
		 * ! -- not, reverses the truth of whatever follows it (true == !false, false == !true, !=, !<, etc.)
		 * 
		 * ------------ Comparing two boolean statements
		 * | -- bitwise OR, processes both to see if they're true, regardless of whether the first one already gives you your overall answer
		 * & -- bitwise AND
		 * || -- logical OR, is either the value on the left true OR the value on the right true
		 * 			doesn't bother with the one on the right if the left one is true
		 * 			(true || false -> true)
		 * && -- logical AND, are both the values on the left and right true?
		 * 			(true && false -> false)
		 * !|| -- NOR, returns true if NEITHER value is true
		 * !&& -- NAND, returns true only if at least one value is false
		 * ^ -- XOR, exclusive OR, returns true ONLY if ONE is true but not BOTH
		 * !^ -- XNOR, exclusive NOR
		 * 
		 */
		
		// if/else statements allow to execute code only if certain conditions are met
		// I might want one thing to happen if something is true and another to happen if it's not
		
		boolean myBoolean = false;
		int myInt = 0;
		
		// if your if/else block only contains one line of code, you don't need the curly braces
		
		// syntax:
		// if (boolean condition) {
		//    //some code
		// }
		
		if (myInt == 4) {
			System.out.println("It's true!");
		} else {
			System.out.println("It's false!");
		}
		
		System.out.println();
		
		if (myInt == 4) {
			System.out.println("Spot on!");
			// can have multiple else if blocks
		} else if (myInt == 5) {
			System.out.println("Just a little too big...");
		} else if (myInt == 3) {
			System.out.println("Just a little too small...");
		} else if (myInt > 5) {
			System.out.println("Too big...");
			// can NOT have multiple else blocks, because the first one catches all remaining possibilities
		} else {
			System.out.println("Too small...");
		}
		
		System.out.println();
		
		
		int myAge = 20;
		
		// checking conditions one by one
		if (myAge >= 18) {
			
			System.out.println("Alright, I'm at least 18. What can I do?");
			
			if (myAge >= 21) {
				System.out.println("To the bar!");
			} else if (myAge == 20) {
				System.out.println("Please, Mr. Bouncer??");
			} else {
				System.out.println("At least I can vote...");
			}
			
		} else {
			System.out.println("Enjoy your youth while you can.");
		}
		
		System.out.println();
		
		// checking conditions all at once
		
		// a String is an array of chars
		String myName = "Larry";
		String myLastName = "Larryson";
		String myHatSize = "XL"; // an array of chars, | X | L |, indexes start at 0, so | X (0) | L (1) |
		
		if (myName == "Larry" && myAge == 21 || myLastName == "Larryson" && myHatSize.indexOf('X') == 1) {
			System.out.println("Everything checks out.");
		} else if (myName == "Larry") {
			System.out.println("Hey, Larry...no such luck this time.");
		} else {
			System.out.println("Sorry, fella.");
		}
		
		System.out.println();
		
		// having no else block is okay, depending on the functionality you desire
		String time = "11:10am";
		
		if (time == "11:10am") {
			System.out.println("It's 11:10am...huzzah!");
		}
		
		System.out.println();
		
		// Post Office example
		// if size/weight is ... do something
		// if destination is national/international, do something
		// if shape is ... do something
		// if delivery time is ... do something
		
		// new Object declaration
		Object myPackage = new Object();
		int weight = 30;
		int length = 50;
		String destination = "Florida";
		boolean isInternational = false;
		String shape = "Square";
		int deliveryTime = 4;
		
		// checking one at a time
		// this is called a null check and can eliminate many issues, especially when dealing with database calls
		// or when grabbing things from Arrays, LinkedLists, etc.
		if (myPackage != null) {
			
			if (weight >= 50) {
				System.out.println("Package is too heavy; freight shipping required.");
			} else {
				System.out.println("Weight okay.");
				if (length > 25) {
					System.out.println("Package is too long; cut it up.");
				} else {
					System.out.println("Length okay.");
					
					if (!isInternational)
					System.out.println(destination);
					
					if (shape != "Square") {
						System.out.println("Package too oblong. Repack.");
					} else {
						System.out.println("Estimated time for delivery: " + deliveryTime + " days.");
					}
				}
			}
			
		} else {
			System.out.println("No package!");
		}
		
		System.out.println();
		
		// checking all at once
		if (myPackage != null && weight <= 49 && length <= 25 && !isInternational && shape == "Square") {
			System.out.println("Weight okay.");
			System.out.println("Length okay.");
			System.out.println(destination);
			System.out.println("Estimated time for delivery: " + deliveryTime + " days.");
		} else {
			System.out.println("Too bad, customer!");
		}
		
		
		
		
		
	}

}
