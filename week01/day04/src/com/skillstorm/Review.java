package com.skillstorm;

public class Review {

	public static int add(int x, int y) {
		
		if (x == 1) {
			System.out.println("X is 1!");
		} 
		else {
			System.out.println("X is not 1!");
		}
		
		
		
		
		
		
		return x + y;
	}
	
	public static void main(String[] args) {
		// {}
		// Curly brackets a block of code associated with something
		add(1, 2);
		
		
		if (true) {
			
		}
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		do {
			
		} while (i < 10);
		
		
		for (i = 0; i < 10; i++) {
			
		}
		// Initialization
		// [] - Means the data type an array
		// [5] - Means the array will be set to size 5
		int[] nums = new int[5];
		int number; // Variable declaration
		
		String word = "John";
		
		
		number = 54;
		System.out.println(number);
		
		
		// Any time after this is array access
		System.out.println(nums[0]);
	}

}
