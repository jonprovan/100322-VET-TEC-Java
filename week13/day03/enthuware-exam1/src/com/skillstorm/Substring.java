package com.skillstorm;

public class Substring {
	
	public static void main(String[] args) {
		String apple = "apple";
		System.out.println(apple.substring(0,1)); // 0 is the start inclusive and 1 is the end exclusive
		System.out.println(apple.substring(1,1)); // returns empty string
		// vs java script splice which is the start, and the number of characters
	}

}
