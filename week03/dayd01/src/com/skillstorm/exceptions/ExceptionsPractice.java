package com.skillstorm.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ExceptionsPractice {
	
//	public static void main(String[] args) throws FileNotFoundException {
	public static void main(String[] args) throws FileNotFoundException {
		
		/*
		 * What is an exception?
		 * 
		 * An event that occurs unexpectedly, and interupts the normal flow
		 * of execution
		 * 
		 * What are some exceptions we've seen?
		 * - ArithmeticException - like divide by 0
		 * - IndexOutOfBoundsException - like accessing myArray[myArray.length]
		 * - NullPointerException
		 * 
		 * 
		 * Exception Objects can have certain properties
		 * - It can have a type - instead of the Exception class it might be IndexOutOfBounds, NullPointer, etc.
		 * - a cause
		 * - enableSuppression
		 * - writeStackTrace or not
		 */
		
		/*
		 * Why does java throw exceptions what's the point?
		 * - let's the user know why the result is what it is
		 * - it forces users to handle exceptions that might occur
		 *    -- it forces them to use your method the way you intented
		 *    
		 */
		
		// Question: Is and Infinite Loop an exception? -- No
		// --------
		// infinite loop -- just keeps going no exception or error is thrown
//		boolean stop = false;
//		while (!stop) {
//			System.out.println("still going");
//		}
		
		// Recursion StackOverFlowError -- we will cover recursion later in the course
		// java.lang.StackOverflowError
//		String[] someStuff = {};
//		main(someStuff);
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////// Unchecked Exceptions ///////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
//		// Example 1: 
//		System.out.println(1 / 0);
		
		// Example 2:  java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//		String[] myPets = new String[2];
//		System.out.println(myPets[2]);
		
//		// Example 3: java.lang.NullPointerException: Cannot invoke "String.length()" because "myCat" is null
//		String myCat = null;
//		System.out.println(myCat.length());
		
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////// Checked Exceptions /////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Example 4: Checked Exception -- I must declare this using the "throws keyword"
		//                              -- Or handle the exception using a try-catch blck
		
		// try block code will run the code that might throw an exception (it doesn't have to throw an exception)
		//      if the exception is NOT thrown, catch block is skipped
		//      if the exception IS thrown, it stops executing the code in the try block
		//                                  jumps to the catch block and runs that code // recovery mechanisms 
		//                                  the program continues and executing all the code below the try-catch
		Scanner myScanner;
//		myScanner = new Scanner(System.in);
//		String userInput = myScanner.next();
//		System.out.println(userInput + " right back at ya");
//		
//		myScanner = new Scanner("hello\ngoodbye\nwhatever");
//		System.out.println("line1: " + myScanner.next());
//		System.out.println("line2: " + myScanner.next());
		
		// Example 4a: Trying to read from a file that doesn't exist
//		File myFile = new File("somefile.txt"); // This file may not exist, 
//		myScanner = new Scanner(myFile); // This Scanner is trying to read from a file
		
		

		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////// Handling Exceptions /////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Example 4b: Handling our file not found exception allows us to continue to the end of our main method
		try {
			File myFile = new File("somefile.txt"); // This file may not exist, 
			myScanner = new Scanner(myFile); // This Scanner is trying to read from a file
			                                                   // 
			System.out.println("Yay! Found my file!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			myScanner = new Scanner("This is my awesome text to read in."); // recovering from exception thrown
		} 
		System.out.println(myScanner.next());
		
		

		// Example 5: Using a try-catch to continue code after the error is thrown
		
		// Two Important key words to know
		//  1. throw -- we use to throw an exception 
		//  2. throws -- we use to declare that the method might throw the exception
		
		// Examples of where we could use illegal argument exception
		// -- when a user hands in an invalid value
		
		try {
			divide( 1 , 0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		

		///////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////// Afternoon Material To Be covered ///////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * Finally Block:
		 * - a block that runs in both situations
		 *      1. if the try block throws and exception and jumps to the catch block
		 *      2. if the try block does not throw an exception and skips the catch block
		 * - a good place to close database connections or any other resources that might be left open
		 *    if the method stops execution due to an exception
		 * 
		 */
		
		try {
			System.out.println("--> In the try block");
			File myFile = new File("somefile.txt"); // This file may not exist, 
			myScanner = new Scanner(myFile); // This Scanner is trying to read from a file
//			myScanner = new Scanner(System.in); 
//			System.out.println("Yay! Found my file!");
		} catch (Exception e) {
			System.out.println("--> In the catch block");
			// TODO Auto-generated catch block
			myScanner = new Scanner("This is my awesome text to read in."); // recovering from exception thrown
		} finally {
			System.out.println("--> In the finally block");
			System.out.println(myScanner.next());
			myScanner.close();
		}
		
		/*
		 * Try-Catch 
		 * vs
		 * If-Else
		 * -- example: searching an array for a value that is not found returns -1
		 *             this is using a special value to indicate to the user something went wrong
		 * -- try-catch will force the user to handle that case
		 *                   - it helps the user identify earlier where the error in their logic is
		 * 
		 * 
		 */
		
		
		
		/*
		 * Multiple Catches -- uses the same recovery mechanism for both situations
		 * and 
		 * Multiple Catch Blocks: -- allows unique recovery mechanisms for each situation
		 * 
		 * 
		 */
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		try {
			// something
//			throwRandomException();
		} catch (ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException e) {
			// some code
			System.out.println(e.getClass());
		}
		
		try {
			// something
			throwRandomException();
//		} catch (Exception e) { // ORDER MATTERS -- more specific exceptions must be handled first
//			System.out.println("Idunno what happened");
		} catch (ArithmeticException e) {
			// some code
			System.out.println("are you bad at math?");
		} catch (NullPointerException e) {
			// some other code
			System.out.println("sorry there is nothing there");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// some other code
			System.out.println("sorry can't get that for ya");
		} catch (Exception e) {
			System.out.println("Idunno what happened");
		}
		
		System.out.println("End of main. Program terminating.");
		
	} // end of main method
	
	public static void divide(int a, int b) throws IllegalArgumentException {
		try {
			System.out.println(a + " / " + b + " = " + (a / b));
		} catch (ArithmeticException e) {
			// Constructor
						//  IllegalArgumentException(String message, Throwable cause)
						//	     Constructs a new exception with the specified detail message and cause.
						
			throw new IllegalArgumentException("Please enter a valid divisor.", e);
		}
	}
	
	public static void throwRandomException() {
		int someNumber = (int) Math.floor(Math.random() * 10);
		if (someNumber < 4) {
			throw new ArithmeticException();
		} else if (someNumber < 8) {
			throw new NullPointerException();
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
}
