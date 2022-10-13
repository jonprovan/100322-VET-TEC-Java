package com.skillstorm;

import java.util.Random;

public class Switch {

	public static void main(String[] args) {
		
		// SWITCH STATEMENT
		
		/*
		 * A switch statement is a logic gate with more than two possible outcomes
		 *  -- if/else statements only have two -- if true, do this; otherwise do that
		 *  -- even if you have multiple if/else, else if, nested statements, etc., each one still only goes one of two ways
		 *  
		 *  A switch statement takes a non-boolean condition
		 *  -- you CANNOT use a boolean as the switch condition
		 *  -- can have as many different outcomes as you like/as you set up in code
		 *  
		 *  Syntax:
		 *  
		 *  switch (variable to switch on) {
		 *  
		 *  case optionOne:
		 *  	some code
		 *  case optionTwo:
		 *  	some other code
		 *  case optionThree:
		 *  	some more other code
		 *  default:
		 *  	some default code
		 *  
		 *  }
		 *  
		 *  Equivalent to:
		 *  
		 *  if (variable == optionOne)
		 *  some code
		 *  else if (variable == optionTwo)
		 *  some other code
		 *  else if (variable == optionThree)
		 *  some more other code
		 *  else
		 *  some default code
		 *  
		 */
		
		// variable we're going to use in our switch statement
		// cannot be a boolean!
		String stringToSwitchOn = "Good morning!";
		
		// feed our variable into the switch statement
		switch (stringToSwitchOn) {
			// each case is a possible value for the variable
			// if it matches EXACTLY, start here
			case "Hello!":
				// this code will execute as usual
				System.out.println("Hello right back atcha!");
				// this break sends us to the end of the switch statement
				// without it, we will continue to run the code in the following cases
				break;
			case "Good morning!":
				System.out.println("And a good morning it is, sir.");
				break;
			case "Good afternoon!":
				System.out.println("Indeed...time for a nap.");
				break;
			case "Good evening!":
				System.out.println("Welcome to cocktail hour!");
				break;
			case "Goodnight!":
				System.out.println("Zzzzz...");
				break;
			// the default case will activate for any value that doesn't match any of the cases
			// think of this like an "else"
			default:
				System.out.println("Nice greeting, nice greeting.");
				break;
				
		}
		
		// break example in a loop
//		int counter = 0;
//		while (counter < 100) {
//			counter++;
//			if (counter == 5)
//				break;
//		}
//		
//		System.out.println(counter);
		
		
		// sometimes, you may WANT your switch statement to cascade, i.e., to NOT break after each bit of code
		// function to print out all remaining people in line
		
		String personAtTheFront = "Kelvin";
		
		System.out.println();
		System.out.println("Who's in front? And who's left after that in line?");
		// cannot have two identical cases
		
		// without break statements, we cascade all the way through to the bottom
		// and, in this case, we WANT to!
		switch (personAtTheFront) {
			case "Rob":
				System.out.println("Rob");
			case "Miles":
				System.out.println("Miles");
			case "Rogetta":
				System.out.println("Rogetta");
			case "Zulmak":
				System.out.println("Zulmak");
			case "Victoria":
				System.out.println("Victoria");
			case "Christopher":
				System.out.println("Christopher");
			case "Kelvin":
				System.out.println("Kelvin");
			case "Brittany":
				System.out.println("Brittany");
			case "Ringo":
				System.out.println("Ringo");
			case "Lamar":
				System.out.println("Lamar");
			case "Jon":
				System.out.println("Jon");
			case "Erica":
				System.out.println("Erica");
			default:
				System.out.println("Rina");
		
		}
		
		System.out.println();
		
		// can have multiple cases leading to the same code
		// by leaving them blank
		
		String dayOfTheWeek = "";
		
		// we won't always have a fixed value for a variable
		// imagine pulling items from a database that may be of different types
		
		// generating a random integer from 0 to 6
		int random = new Random().nextInt(7);
		
		// printing out our random number
		System.out.println(random);
		
		// using a switch statement to give a value to dayOfTheWeek based on our random number
		// CAN switch on a numerical value (still not a boolean!)
		switch (random) {
			case 0:
				dayOfTheWeek = "Sunday";
				break;
			case 1:
				dayOfTheWeek = "Monday";
				break;
			case 2:
				dayOfTheWeek = "Tuesday";
				break;
			case 3:
				dayOfTheWeek = "Wednesday";
				break;
			case 4:
				dayOfTheWeek = "Thursday";
				break;
			case 5:
				dayOfTheWeek = "Friday";
				break;
			case 6:
				dayOfTheWeek = "Saturday";
				break;
			default:
				break;
		}
		
		// printing out the day of the week we assigned
		System.out.println(dayOfTheWeek);
		
		// switching on our assigned day of the week to choose which code we run
		switch (dayOfTheWeek) {
			case "Sunday":
			case "Saturday":
				System.out.println("It's the weekend!");
				break;
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
				System.out.println("Boo...weekday...");
				break;
			case "Friday":
				System.out.println("Weekend incoming!");
				break;
			// default CAN be in the middle or at the beginning, but since it's our "else," in effect, it should be at the end
			default:
				System.out.println("Um...nice day, bruh.");
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
