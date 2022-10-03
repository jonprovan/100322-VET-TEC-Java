// this is a comment
// can do multiple in a row
// anything after the two slashes doesn't count as code

/*
 * This is a multi-line comment
 * Can press enter over and over
 * And it stays a comment
 */

// class declaration
// access modifier (public), then the keyword "class," then the name of the class
// class name must be Pascal case (upper case at the beginning of each word, no spaces)
// class name must match the filename

public class HelloWorld {   // can also comment at the end of a line
	
	/*
	 * this is the main method
	 * first thing that Java runs when it runs the program
	 * 
	 * public -- anything in the program can access it
	 * static -- can be run without an "instance" of the object
	 * void -- a return type, void methods return nothing
	 * main -- the name of the method
	 * 
	 * () -- contains the arguments the main method takes
	 * 
	 * String -- series of alphanumeric characters
	 * [] -- indicates that this is an array
	 * args -- variable name for the String array ("arguments")
	 * 
	 * example from command line -- java HelloWorld argument1 argument2
	 * 
	 * {} -- curly braces, everything within the curly braces is "in scope" (part of the method)
	 * 
	 */
	
	public static void main(String[] args) {
		
		// this prints out anything within the parentheses to our console
		// if printing a String, put it in quotes
		
		System.out.println("Hello, World!");
		System.out.println("...and Hello, back!");
		
		// sysout then CTL + spacebar
		System.out.println();
		
		System.out.println("Now with wonderful spacing!");
		
	}
	
	// not in the scope of our main method
	// public int number = 3;

}
