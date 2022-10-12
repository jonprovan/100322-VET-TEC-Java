package com.skillstorm;

import java.util.Scanner;

public class Review {

	public static void anotherFunction(Scanner scan, int num, char letter, String firstName) {
		
	}
	
	
	/*
	 * I want to find the maximum integer in an array of integers
	 * 
	 * I need to create a function, findMax() that takes in an array of integers and returns the max from it.
	 * If the array is empty or null, the max will be 0
	 */
	public static int findMax(int[] numbers) {
		if (numbers.length <= 0) { // Special case	
			return 0; // If we're given an array with no elements. I am just going to escape
		}
		
		int max = numbers[0]; // Set the starting max size
		
		// I keep track of the max value so far, if I encounter a number that's bigger then I will change the max
		// value to that value
		
		// i is short for index
		//   counter    condition           increment counter
		for (int i = 0; i < numbers.length; i++) {
			max = Math.max(max, numbers[i]);
		}
		
		// The while loop equivalent of a for loop
//		int i = 0;
//		while (i < numbers.length) {
//			max = Math.max(max, numbers[i]);
//			i++;
//		}
		
		return max; // This will be replaced
	}
	
	public static boolean isOlderThan21(int age) {
		boolean isOlder = age > 21;
		return isOlder;
	}
	
	
	
	
	
	
	
	
	// I want to determine what I'm gonna do with my afternoon, but what I do is dependent on the weather
	public static void planAfternoon(String weather) {
		if (weather.equals("sunny")) { 
			System.out.println("I am going to go to the gym!");
		} 
		else if(weather.equals("Rainy") || weather.equals("Snowy")) {
			System.out.println("I am going to stay inside!");
		} 
		else if (weather.equals("Hurricane")) {
			System.out.println("I am going to seek out shelter");
		} 
		else if (weather.equals("Tornado")) {
			System.out.println("I am off to see the wizard");
		} 
		else {
			System.out.println("I am just gonna play it by ear");
		}
		
	}
	
	public static void planEvening(int temperature) {
		if (temperature < 0) {
			System.out.println("I am going to stay inside");
		}
		else if (temperature > 32) {
			System.out.println("I am going to go outside");
		} 
		// If breaks the if else chain
		if (temperature > 80) {
			System.out.println("I am going to go to the beach");
		} 
		else {
			System.out.println("I am just going to play in by ear");
		}
	}
	
	
	
	public static void spendingGame(int balance) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Your current balance is " + balance);
		
		while(balance > 0 && balance < 20000) {
			System.out.println("How much would money you like to spend? ");
			int amountSpent = scan.nextInt();
			scan.nextLine(); // Clears the buffer
			System.out.println("You have spent " + amountSpent + " dollars!");
			balance -= amountSpent; // balance = balance - amountSpent
			System.out.println("Your new balance is: " + balance);
		}
		if (balance <= 0) {
			System.out.println("All out of money! You lose!");
		} else {
			System.out.println("You cheated the system! I guess you win");
		}
	}
	
	public static double calculateSimpleInterest(double principal, double ratePercent, int time) {
		return principal * (1 + (ratePercent / 100) * time);
	}
	
	
	public static void main(String[] args) {
		
		double simpleInterest = calculateSimpleInterest(10000, 3.875, 5);
		System.out.println("The simple interest is: " + simpleInterest);
		
		
		// int firstIndex = 0;
		// int lastIndex = numberSet.length - 1;
		
		int[] numberSet1 = {9, 2, 3, 1, 10, 2, 5, 6, 7};
		int[] numberSet2 = {-7, -6, -3, -2};
		// 0 - 3
		System.out.println(numberSet2.length);
		
		System.out.println("The max of numberset 1 is: " + findMax(numberSet1));
		System.out.println("The max of numberset 2 is: " + findMax(numberSet2));
		
		String firstName;
		
		
		int sallyAge = 21;
		int joeAge = 22;
		
		
		System.out.println(sallyAge < joeAge);
		
		/*
		 * ==
		 * !=
		 * <
		 * >
		 * <=
		 * >=
		 */
		
		System.out.println("Sally's age is: " + sallyAge);
		
		System.out.println(isOlderThan21(joeAge));
		
		System.out.println();
			
		Functions.helloWorld();
		int sum = Functions.calculateSum(1, 2);
		System.out.println(sum);
		
//		spendingGame(10000);
		
		String stringifiedNumber = "400";
		int numberFromString = Integer.parseInt(stringifiedNumber);
		
		System.out.println(numberFromString);
		System.out.println(numberFromString + 1);
		
		int[] moreNumbers = {1, 20, 6, 4};
		System.out.println(findMax(moreNumbers));
	}

}