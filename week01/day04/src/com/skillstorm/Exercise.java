package com.skillstorm;

public class Exercise {

	/*
	 * Function that returns the largest number in an array
	 */
	public static int findMax(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return 0;
		}
		int max = numbers[0];
		for (int num : numbers) {
			max = Math.max(max, num);
		}
		return max;
	}
	
	// [0, 1, 2, 5, 7, 10]
	public static int findMaxWithSortedArray(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return 0;
		}
		return numbers[numbers.length - 1];
	}
	
	/*
	 * Function that returns the minimum number in an array
	 */
	public static int findMin(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return 0;
		}
		int min = numbers[0];
		for (int num : numbers) {
			min = Math.min(min, num);
		}
		return min;
	}
	
	public static int findMaxIndex(int[] numbers) {
		return 0;
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {5, 2, 3, 5, 3, 8, 1, 7};
		int max = findMax(numbers);
		System.out.println(max); // Should be 8
		int min = findMin(numbers);
		System.out.println(min); // Should be 1
	}

}