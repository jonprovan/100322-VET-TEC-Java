package com.skillstorm;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem7 {

	public static void main(String[] args) {
		Object o = null;
		ArrayList<String> c = new ArrayList<>(Arrays.asList( "bananas", "apples" )) ; // valid ArrayList object.
		int[] ia = {1, 2, 3, 4}; //valid array	
		
		// a
		// for(o : c){ }

		// b
		// https://stackoverflow.com/questions/18019582/what-is-the-purpose-of-using-final-for-the-loop-variable-in-enhanced-for-loop
		for(final Object o2 : c){ System.out.println(o2); }; // This is actually fine in Java 8 and later

		// c
		for(int i : ia) { }

		// d
		
		// e
	}

}
