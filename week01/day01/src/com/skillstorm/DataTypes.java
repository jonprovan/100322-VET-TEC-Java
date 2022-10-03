// package declaration
package com.skillstorm;

// class declaration
public class DataTypes {
	
	static boolean staticBoolean;
	static char staticChar;

	// main method
	public static void main(String[] args) {
		
		/*
		 * JavaScript, for example, is loosely-typed
		 * -- you don't have to tell it what kind of variable it is when declaring it
		 * -- it figures it out on its own
		 * 
		 * Advantages = flexibility, ease of setup
		 * Disadvantage = compiler doesn't know there's an issue until it's too late
		 * 
		 * Java, by comparison, is strongly-typed
		 * -- you must declare what kind of data is assigned to a variable when you declare the variable
		 * 
		 * Advantages/Disadvantages = the opposite of the above
		 * 
		 * 
		 * Primitive Data Types in Java
		 * -- not objects (one exception)
		 * 
		 * Whole Number Data Types
		 * 
		 * int (integer) -- -2^31 through 2^31-1 (32 bits)
		 * byte -- -2^7 through 2^7-1 (8 bits)
		 * short -- -2^15 through 2^15-1 (16 bits)
		 * long -- -2^63 through 2^63-1 (64 bits)
		 * 
		 * Decimal/Fractional Data Types
		 * 
		 * float -- also 32 bits, but can include decimals
		 * double -- 64 bits, can include decimals
		 * 
		 * True/False Data Type
		 * 
		 * boolean -- only true or false
		 * 
		 * Alphanumeric Data Types
		 * 
		 * char -- single alphanumeric character
		 * String (not a primitive, actually an object) -- series of alphanumeric characters
		 */
		
		// int = reference type -- what kind of data is in this variable?
		// myNumber = variable name -- camel-case, no capital letter at the top, capital letter at each new word
		// 34 = value we're assigning to the variable
		int myNumber = 34;
		
		System.out.println(myNumber);
		
		byte myByte = 23;
		
		System.out.println(myByte);
		
		short myShort = 4985;
		
		System.out.println(myShort);
		
		long myLong = 234982374;
		
		System.out.println(myLong);
		
		double myDouble = 345.34;
		
		System.out.println(myDouble);
		
		// remember your "f" at the end of a float's value (doesn't print or contribute to the value itself)
		float myFloat = 45.22f;
		
		System.out.println(myFloat);
		
		int myOtherInt = 3;
		System.out.println(myOtherInt);
		
		myOtherInt = myOtherInt/2;
		System.out.println(myOtherInt);
		
		int first = 3;
//		first = 100;
//		first = first + 150;
//		first = myLong;
		int second = 5;
		int third = 7;
		
		// whole number data types, when divided, clip off anything after the decimal point of the result
		System.out.println(first/2 + second/3 + third/4);
		
		boolean myBoolean = false;
		boolean myOtherBoolean = true;
//		boolean myOtherOtherBoolean = (myBoolean || myOtherBoolean); // can assess a statement to see if it's true
		
		System.out.println(myBoolean);
		System.out.println(myOtherBoolean);
		
		System.out.println();
		
		System.out.println(staticBoolean);
		
		char myChar = 'A';
		System.out.println(myChar);
		
		// char can be incremented to sequentially move through the letters/characters
		++myChar;
		
		System.out.println(myChar);
		
		System.out.println(staticChar);
		
		// remember to use capital-S String as the reference type, because String is an object
		String myString = "Hey! It's-a me, my String!";
		System.out.println(myString);
		
		// adding Strings concatenates them -- attaches them back-to-back
		String myOtherString = "...no kidding.";
		System.out.println(myString + " " + myOtherString);
		
	}

}
