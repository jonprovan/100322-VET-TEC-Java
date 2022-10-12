package com.skillstorm;

public class Strings {

	public static void main(String[] args) {
		// WET - Write Everything Twice
		// DRY - Don't Repeat Yourself
		
		// What is a string?
		// Strings store text
		
		// Strings are technically char arrays with a few extra features
		
		/*
		 * Features:
		 * 
		 * - Utility functions such as toLowerCase() and substring()
		 * - Java has given us the ability to use the + operator to add or concatenate two strings
		 *   Ex. "Apple " + "Banana" -> "Apple Banana"
		 * - Strings are technically immutable (immutable means unable to be changed)
		 */
		
		int[] numbers = new int[5];
		numbers[3] = 5; // This cannot be done with a String
		
		// Strings are just char arrays "under the hood"
		// We can iterate over a String just like an array
		
		String firstName = "Margaret";
		
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			System.out.println(num);
		}
		
		// [1, 3, 5, 3, 1] 
		// ['M', 'a', 'r', 'g', 'a', 'r', 'e', 't']
		
		// remember that Strings' lengths are gotten by .length();
		for (int i = 0; i < firstName.length(); i++) {
			char c = firstName.charAt(i);
			System.out.println("Char at index " + i + " is: " + c);
		}
		
		// Alternative way to loop through a String
		for (char c : firstName.toCharArray()) {
			System.out.println(c);
		}
		
		// Useful functions on the Strings
		
		// toLowerCase() takes a String and returns a new String that's has the A-Z characters lower cased
		
		 // This does NOT change firstName
		String lowerCasedFirstName = firstName.toLowerCase();
		
		System.out.println(lowerCasedFirstName); // New value
		System.out.println(firstName); // Still has old value
		
		// toUpperCase is just like toLowerCase but the opposite
		
		System.out.println(lowerCasedFirstName.toUpperCase());
		
		int x = 5;
		int y = 5;
		
		// Prefix increments before evaluating value of y
		// Postfix increments after evaluating value of y
		System.out.println("Value of y: " + (y));
		
		
		
		System.out.println("Y: " + y);
		System.out.println("X: " + x);
		
		String message = "a";
		
		// isEmpty returns true if the string is empty
		
		System.out.println(message.isEmpty());
		
		
		// replace() replaces all instances of the old char with the new char
		
		String boringSentence = "I woke up today. After that, I went to the store.";
		String excitingSentence = boringSentence.replace('.', '!');
		
		System.out.println(excitingSentence); // This does not change boringSentence
		System.out.println(boringSentence);
		
		String secondPersonSentence = boringSentence.replace("I", "You");
		
		System.out.println(secondPersonSentence);
		
		
		
		
		// substring() is it creates a new String that is a section of our old String
		
		for (int i = 1; i < 4; i++) {
			
		}
		
		String rainbow = "Rainbow";
		String rain = rainbow.substring(1, 4); // 0 is the start, 4 is the end
		String bow = rainbow.substring(4);
		
		System.out.println(rain);
		System.out.println(bow);
		
		
		System.out.println("My substring function: " + mySubstring(0, 100, rainbow));
		
		
		// StringBuilder
		
		// Reversing a string
		
		String encodedMessage = "!dlroW olleH";
		
		// Creates a new StringBuilder, preconfigured with my string
		StringBuilder stringReverser = new StringBuilder(encodedMessage);
		stringReverser.reverse(); // Reverses the string in StringBuilder
		System.out.println(stringReverser);
		String decodedMessage = stringReverser.toString(); // Takes us back to a String
		
		System.out.println("Decoded message: " + decodedMessage);
		
		
		// trim() and removes any trailing or leading white space;
		
		String uglyWord = "               	          John Doe                                         ";
		String prettyWord = uglyWord.trim(); // THat's it. Creates a new string without the whitespace
		System.out.println(prettyWord);
		System.out.println(uglyWord);
		
		// split() Is it splits up or string based on some character. Returns a String array
		
		String fullName = "Franklin Delano Roosevelt";
		String[] partsOfName = fullName.split(" "); // ["Franklin", "Delano", "Roosevelt"]
		
//		for (int i = 0; i < partsOfName.length; i++) { // Accomplishes the same as foreach
//			String name = partsOfName[i];
//			System.out.println(name);
//		}
		
		for (String name : partsOfName) { // More lightweight
			System.out.println(name);
		}
		
		
		// String parsing
		String ageString = "45";
		int ageNum = Integer.parseInt(ageString);
		System.out.println(ageNum);
		ageNum++; // 46
		ageNum = ageNum / 2; // 23
		System.out.println(ageNum);
		
		
		int num = 20;
		double doubleNum = (double) num; // Widening it. I don't lose data
		num = (int) doubleNum; // Narrowing it and possibly losing data
		
		// Write a program that parses CSV string and converts it into usable data
		// Comma Separated Values
		String johnData = "John,Doe,43";
	}
	
	/*
	 * Function that outputs the data for the car rental
	 * I want to be able to unpack all of the data and store it in a variable (and print it)
	 * This should work for any data so long as it's the right data type
	 */
	public static void printCarDetails(String csv) {
		String johnDoeDetails = "John,Doe,8888888888,P Sherman 42 Wallaby Way ,43,TX,Dallas,2/4/2022,2/5/2022";
	}
	
	public static String mySubstring(int startIndex, int endIndex, String str) {
		// Error checking
		if (startIndex > endIndex || endIndex > str.length()) {
			return str;
		}
		StringBuilder newString = new StringBuilder();
		for (int i = startIndex; i < endIndex; i++) {
			newString.append(str.charAt(i));
		}
		
		return newString.toString();
	}
}
