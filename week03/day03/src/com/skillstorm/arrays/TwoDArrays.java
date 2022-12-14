package com.skillstorm.arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		// rectangular array
		int[][] numbers = { { 1, 2 }, {3, 4 }, { 5, 6} }; // literals 
		// jagged array
		int[][] numbers2 = {{ 1, 2, 5, 10, -2}, 
				            { 3, 4, 32, 4, -1, 36, 77, 100, 2000, 101, 20 }, 
				            { 5, 6, 44, 32, 156, 134567, 34, 2 } };
		
		// 2D also have SET LENGTH
		int[][] example = new int[3][8]; // { {0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0} };
		//                       ---
		//            number of inner arrays
		int[][] example2 = new int[3][]; // is NULL for each inner array { null , null, null }
//		System.out.println(example2[0].length); // DOES NOT WORK
		//                 -----------
		//                    null
		
		
		//DOES NOT WORK - MUST SET SIZE FIRST
//		example2[0][0] = 127;
//		System.out.println("length of example 2's first inner array is now " + example2[0].length);
//		example2[0][1] = 127;
//		System.out.println("length of example 2's first inner array is now " + example2[0].length);
//		example2[0][2] = 127;
//		System.out.println("length of example 2's first inner array is now " + example2[0].length);
		
		
		
//		// JAGGED ARRAY EXAMPLE
//		example2[0] = new int[2];
//		example[1] = new int[100];
//		example[2] = new int[3];
		
		
		
		
//		int[][] example3 = new int[][3];
		
		
		//-------------------------------------------------------------------
		// tangent on other ways to initialize arrays or arrays
		String[] team1 = { "Aung", "Brian", "brittany" };
		String[] team2 = { "Ernest", "Brandom", "Aaliyah" };
		String[] team3 = { "Jon", "Erica", "Miles" };
		
		String[][] teams = { team1, team2, team3 };
		
		// THIS IS NOT PRACTICAL - MISUSING ARRAYS
		Object[] objects = { team1, new TwoDArrays(),        null }; // an array can hold different sub types
//		                     -----  ---------------          ----
//		                     int[]   Object not an array     could be an array
		Object[][] different = {numbers, numbers2, teams, team1 };
		//-------------------------------------------------------------------
		
		
		
		// VERBOSE way of accessing every element in the 2d array
//		System.out.print(numbers2[0][0] + " ");
//		System.out.print(numbers2[0][1] + " ");
//		System.out.print(numbers2[0][2] + " ");
//		System.out.print(numbers2[0][3] + " ");
//		System.out.println(numbers2[0][4] + " ");
//		
//		System.out.print(numbers2[1][0] + " ");
//		System.out.println(numbers2[1][1] + " ");
//		
//		System.out.print(numbers2[2][0] + " ");
//		System.out.println(numbers2[2][1] + " ");
		
		// LESS verbose way
		int[] innerArray1 = numbers2[0]; // grabs the WHOLE inner array
		int[] innerArray2 = numbers2[1]; // grabs the WHOLE inner array
		int[] innerArray3 = numbers2[2]; // grabs the WHOLE inner array
		
		// THIS DOES NOT WORK
//		System.out.println(innerArray1); // THIS DOES NOT WORK
//		System.out.println(innerArray2);
//		System.out.println(innerArray3);
		
		
		// DO NOT COPY PASTE CODE - INSTEAD PUT THIS IN A HELPER METHOD
//		for (int i = 0; i < innerArray1.length; i++) {
//			System.out.print(innerArray1[i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < innerArray2.length; i++) {
//			System.out.print(innerArray2[i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < innerArray3.length; i++) {
//			System.out.print(innerArray3[i] + " ");
//		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		// LEAST VERBOSE VERSION
//		System.out.println("numbers2.length = " + numbers2.length);
//		for (int i = 0; i < numbers2.length; i++) {
//			System.out.println("numbers2[" + i + "].length " + numbers2[i].length);
//			for (int j = 0; j < numbers2[i].length; j++) {
//				System.out.println(numbers2[i][j]);
//			}
//		}
		
		// prettier print
//		prettyPrint(numbers2);
		
		// System.out.println(sum(numbers));
//		System.out.println(count(numbers)); // I expect 6
//		System.out.println(count(numbers2));
		// System.out.println(average(numbers));
		
		String[][] people = { { "Joe", "Kenny", "Nita", "Naruto" } , 
				              { "Boots" } , 
				              { "Jon", "Erica", "Miles", "Waldo"} };
		
		System.out.println("Where is Waldo?");
		int[] result = whereIsWaldo(people);
		try {
			System.out.println("row = " + result[0]);
			System.out.println("col = " + result[1]);
		} catch (NullPointerException e) {
			System.out.println("Did not find Waldo :(");
		}
		
	}// end of main
	
	
	
	
	
	
	
	
	
	
	// helper function
	private static void prettyPrint(int[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static int sum(int[][] numbers) {
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				result += numbers[i][j];
			}
			
		}
		
		return result;
	}
	
	private static int count(int[][] numbers) { // rows * cols = count
		int result = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = 0; j < numbers[i].length; j++) {
				result += 1;
			}
			
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static double average(int[][] numbers) {
		
		double result = 0;
		int sum = 0; // sum(numbers)
		int count = 0; // count(numbers)
		
		for (int i = 0; i < numbers.length; i++ ) {
			
			for (int j = 0; j < numbers[i].length ; j++) {
				
				sum += numbers[i][j];
				count++;
			}
			
		}
		
		result = (double) sum / count;
		return result;
	}
	
	// this will return the row and column like { 0 , 0 } so [ row , col ]
	// returns the location of the FIRST Waldo
	public static int[] whereIsWaldo(String[][] people) {
		int row = 0;
		int col = 0;
		
		for (int i = 0; i < people.length; i++) {
			
			for (int j = 0; j < people[i].length ; j++) {
				if ("Waldo".equals(people[i][j])) {
					row = i;
					col = j;
					int[] result = { row , col };
					return result;
				}
			} // end inner-loop
			
		} // end outer-loop
		return null;
	}

}
