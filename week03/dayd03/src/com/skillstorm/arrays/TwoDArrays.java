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
		example2[0][0] = 127;
		System.out.println("length of example 2's first inner array is now " + example2[0].length);
		example2[0][1] = 127;
		System.out.println("length of example 2's first inner array is now " + example2[0].length);
		example2[0][2] = 127;
		System.out.println("length of example 2's first inner array is now " + example2[0].length);
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
		for (int i = 0; i < innerArray1.length; i++) {
			System.out.print(innerArray1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < innerArray2.length; i++) {
			System.out.print(innerArray2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < innerArray3.length; i++) {
			System.out.print(innerArray3[i] + " ");
		}
		
		// LEAST VERBOSE VERSION
		
		
	}
	
	

}
