package com.skillstorm.arrays;

public class ArraysReview {

	public static void main(String[] args) {
		int[] myNumbers;
		myNumbers = new int[4]; // new operator
		myNumbers[0] = 1;
		myNumbers[1] = 2;
		myNumbers[2] = 3;
		myNumbers[3] = 4;

		// for-loop
//		for (int i = 0; i < myNumbers.length; i++) {
//			myNumbers[i] *= 2;
//		}
////		System.out.println(myNumbers); // this prints out memory-addres
//		print(myNumbers);

		// for-each loop
//		for (int number : myNumbers) {
//			System.out.println(number *= 2);
//		}
//		print(myNumbers);
		
//		int counter = 0;
//		while (counter < myNumbers.length) {
//		    myNumbers[counter] *= 2;
//		    counter++;
//		}
//		print(myNumbers);

	}

	private static void print(int[] myNumbers) {
		for (int number : myNumbers) {
			System.out.println(number);
		}

	}

}
