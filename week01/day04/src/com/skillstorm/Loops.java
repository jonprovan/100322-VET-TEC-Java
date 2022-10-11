package com.skillstorm;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		/*
		 * What is a loop?
		 * 
		 * Loops are just blocks of code that will continuously execute so long as their condition is met
		 * 
		 * Similar to an if statement with the conditions
		 * 
		 * Loop process
		 * 
		 * So long as the boolean condition is true, the following block of code will be executed. Once that block
		 * finishes execution, the boolean condition is rechecked. If it is true, runs the block again and so on
		 * If it is false, the code does not the block of code and continues with the program normally
		 */
		
		if (true) {
			// Runs this code
		}
		System.out.println("Hello"); // This always happens
		
		/*
		 * Different types of loops
		 * 
		 * while
		 * for
		 * for-each
		 * do-while // Hardly used
		 */
		
		// Don't write a while (true) loop
//		while (true) {
//			System.out.println("Inside while loop.");
//			// At the end of the while loop. Recheck the boolean condition.
//			// If true: Repeat block of code
//			// If false: Exit block of code
//		}
		
		// None of this code after the while (true) loop will ever run
		
		int count = 0;
		
		// While loop
		while (count < 5) {
			System.out.println("The value of count is: " + count);
			count += 1; // ++ just increments by 1
//			System.out.println(count);
			// Recheck the boolean condition with the new value of count
		}
		
//		int num = 0;
//		num = num + 1;
//		// num is now 1
//		num = num + 1;
//		num = num + 2;
//		num++;
		
		System.out.println("Finished Loop!");
		System.out.println("The final value of count is: " + count);
		
		
		
		
		
		String[] fruits = {"Apple", "Pear", "Orange", "Plum", "Lemon", "Mango", "Strawberry"};
		
		// Use a while loop to iterate over my array
		
		int index = 0;
		while (index < fruits.length) {
			System.out.println("The fruit at index " + index + " is: " + fruits[index]);
//			fruits[index] = "Apple";
//			System.out.println("The fruit at index " + index + " is now: " + fruits[index]);
			index++;
		}
		
		System.out.println();
		
		// Same 
//		System.out.println("The fruit at index " + 0 + " is: " + fruits[0]);
//		System.out.println("The fruit at index " + 1 + " is: " + fruits[1]);
//		System.out.println("The fruit at index " + 2 + " is: " + fruits[2]);
//		System.out.println("The fruit at index " + 3 + " is: " + fruits[3]);
//		System.out.println("The fruit at index " + 4 + " is: " + fruits[4]);
//		System.out.println("The fruit at index " + 5 + " is: " + fruits[5]);
//		System.out.println("The fruit at index " + 6 + " is: " + fruits[6]);
		
		/*
		 * Youtubers: 
		 * 
		 * Java:
		 * - Alex Lee
		 * - Coding with John
		 * 
		 * JavaScript:
		 * - Fireship
		 * - Traversy Media
		 */
		
		
		
		
		
		// For Loops
		
		// Benefit of for loops is for iterating over something for a given amount
		
		// Syntax of a for loop
		// i is short for index
		// for (index initialization; condition; code to be execute at the end of while block) {}
		
//		while (count < 5) {
//			System.out.println("The value of count is: " + count);
//			count += 1; // ++ just increments by 1
////			System.out.println(count);
//			// Recheck the boolean condition with the new value of count
//		}
		
		int counter;
		// Same version of our while loop
		for (counter = 0; counter < 5; counter += 1) {
			System.out.println(counter);
		}
		
		
		System.out.println("Loop finished!");
		System.out.println("Value of counter is: " + counter);
		
		
		
		

		// First execution of the loop
		// i = 0
		// Is 0 less than fruits.length (7)?
		// Yes
		// String fruit = fruits[0]
		// print it
		// i++
		
		// Second execution
		// i = 1
		// Is 1 less than fruits.length (7)?
		// Yes
		// String fruit = fruits[1]
		// print
		// i++
		
		
		// 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6
		for (int i = 0; i < fruits.length; i++) {
			String fruit = fruits[i]; // Process of getting fruit in the foreach
			System.out.println("Fruit at index " + i + " is " + fruits[i]);
			// Hit the bottom, do i++
		} 
		
		
		// Show fruits in reverse order
		System.out.println("\nFruits in reverse order:\n");
		
		
		for (int i = fruits.length - 1; i >= 0; i--) {
			System.out.println("Fruit at index " + i + " is " + fruits[i]);
		}
		
		
		
		
		
		
		
		
		// Foreach loop
		// Foreach loops do not come with an index
		// For each fruit in the fruits array
		for (String bag : fruits) {
			System.out.println(bag);
			bag = "Apple"; // Doesn't actually change the value in the array
		}
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		/*
		 * 
		 * While - something is true (a positive bank balance, something is not empty/full)
		 * For - Use for reading and writing to a list of data
		 * Foreach - Reading through a list of data and doing something with the data (don't use to edit)
		 */
		
		
		// Do - While
		
		// Similar to a while loop
		
		// Important thing for do-while loops is that they ALWAYS run at least once
		
		do {
			System.out.println("Inside do-while loop");
		} while (false);
		
		Scanner scan = new Scanner(System.in);
		String answer = "y";
		
		do {
			System.out.println("What is your age?");
			int age = scan.nextInt();
			scan.nextLine();
			System.out.println("You are " + age + " years old!");
			
			
			System.out.println("Do you want to continue? Y/N");
			answer = scan.nextLine();
		} while(answer.equals("y") || answer.equals("Y") || answer.equals("Yes") || answer.equals("yes"));
		
		System.out.println("Thanks for playing!");
		
		scan.close();
		
		
		
	}

}