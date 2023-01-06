package com.skillstorm.utils;

public class ArrayUtil {
	
	public static int findMax(int[] numbers) {
		// handle null and empty
		if (numbers == null || numbers.length < 1) {
			throw new IllegalArgumentException("Please provide an array of numbers.");
		}
		int maxSoFar = Integer.MIN_VALUE; // handles if all are negatives
		for (int i = 0; i < numbers.length; i++) {
			maxSoFar = Math.max(maxSoFar, numbers[i]);
		}
		return maxSoFar;
	}
	
	public static int findMax(int[][] numbers) {
		// Handle null and empty
		if (numbers == null || numbers.length < 1) {
			throw new IllegalArgumentException("Please provide an array of number arrays.");
		}
		
		int maxSoFar = Integer.MIN_VALUE;
		boolean foundNumbers = false; // Flag to indicate [ null, null, null, ... ] was the input and no numbers found
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != null && numbers[i].length > 0) { // Only run inner loop if inner array not null or empty
				foundNumbers = true; 
				for (int j = 0; j < numbers[i].length; j++) {
					maxSoFar = Math.max(maxSoFar, numbers[i][j]);
				}
			}
		}
		
		if (!foundNumbers) { // Throw exception if none of the inner arrays contained values
			throw new IllegalArgumentException("Please provide at least one non-null, non-empty inner array.");
		}
		return maxSoFar;
	}	

}
