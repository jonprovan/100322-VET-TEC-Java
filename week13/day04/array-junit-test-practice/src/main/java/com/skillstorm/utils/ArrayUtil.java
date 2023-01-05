package com.skillstorm.utils;

public class ArrayUtil {
	
	public static int findMax(int[] numbers) {
		int maxSoFar = 0;
		for (int i = 0; i <= numbers.length; i++) {
			maxSoFar = Math.max(maxSoFar, numbers[i]);
		}
		return maxSoFar;
	}
	
	public static int findMax(int[][] numbers) {
		int maxSoFar = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				maxSoFar = Math.max(maxSoFar, numbers[i][j]);
			}
		}
		return maxSoFar;
	}	

}
