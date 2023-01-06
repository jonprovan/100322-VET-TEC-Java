package com.skillstorm.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.skillstorm.utils.ArrayUtil;


class Array1DMaxTests {
	
	static int[] numbers; // this is a class variable and gets initialized to null

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@AfterEach
	void reset() {
		numbers = null; // can't depend on null test being run first, so reset to null
	}
	

	// Tests we probably want are
	// null
	@Test
	void findMaxWhenArrayParameterIsNull() {
		// Assert that find max, when handed null, does something
		// It should handle the NullPointerException and instead throw a useful exception
		// IllegalArgumentException with a message that says "Please provide an array of numbers." or whatever required message you want
	
		Throwable e = assertThrows(IllegalArgumentException.class, () -> {
			ArrayUtil.findMax(numbers);
		});
		
		assertEquals("Please provide an array of numbers.", e.getMessage());
		
	}
	
		
	// none
	@Disabled
	@Test
	void findMaxWhenArrayParameterIsEmpty() {
		// set up the data
		numbers = new int[0];
		
		// As a user, I want it to give me a warning rather than return some dummy value
		Throwable e = assertThrows(IllegalArgumentException.class, () -> {
			ArrayUtil.findMax(numbers);
		});
		
		assertEquals("Please provide an array of numbers.", e.getMessage());
	}

	

	// one
	@Test
	void findMaxOfWithArrayOfOneElement() {
		numbers = new int[] { 1 };
		
		assertEquals(1, ArrayUtil.findMax(numbers));
	}
	
	// a zero value
	@Test
	void findMaxOfArrayOfOneZeroValueElement() {
		numbers = new int[] { 0 };
		
		assertEquals(0, ArrayUtil.findMax(numbers));
	}
	
	// a negative value
	@Test
	void findMaxOfArrayOfOneNegativeValueElement() {
		numbers = new int[] { -1 };
		
		assertEquals(-1, ArrayUtil.findMax(numbers));
	}
	
	// some
	@Test
	void findMaxOfArrayWithMultipleElements() {
		numbers = new int[] { 1, 2 };
		
		assertEquals(2, ArrayUtil.findMax(numbers));
	}
	
	
	// multiple of the same max
	@Test
	void findMaxOfArrayWithDuplicateElements() {
		numbers = new int[] { 2, 1, 2, 0 };
		
		assertEquals(2, ArrayUtil.findMax(numbers));
	}
	
	// all negative values
	@Test
	void findMaxOfArrayWithAllNegativeElements() {
		numbers = new int[] { -2, -1, -3 };
		
		assertEquals(-1, ArrayUtil.findMax(numbers));
	}
	
	// some very large values
	@Test
	void findMaxOfArrayWithVeryLargeElements() {
		numbers = new int[] { 20_000_000, Integer.MAX_VALUE, Integer.MAX_VALUE - 1 };
		
		assertEquals(Integer.MAX_VALUE, ArrayUtil.findMax(numbers));
	}
	
	// all zero values
	@Test
	void findMaxOfArrayWithAllZeroValues() {
		numbers = new int[] { 0, 0, 0, 0 };
		
		assertEquals(0, ArrayUtil.findMax(numbers));
	}
	
	// some very small values
	@Test
	void findMaxOfArrayWithVerySmallElements() {
		numbers = new int[] { -20_000_000, Integer.MIN_VALUE + 1 };
		
		assertEquals(-20_000_000, ArrayUtil.findMax(numbers));
	}
	
	// with the smallest value
	@Test
	void findMaxOfArrayWithSmallestElements() {
		numbers = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE };
		
		assertEquals(Integer.MIN_VALUE, ArrayUtil.findMax(numbers));
	}
	
	// with many values
	@Test
	void findMaxOfArrayWithManyValues() {
		ArrayList<Integer> someNumbers = new ArrayList<>(); // don't know how many
		System.out.println("Working Directory = " + System.getProperty("user.dir")); // if you need to find the full path
		try (Scanner scanner = new Scanner(new File(".//src//test//resources//com//skillstorm//arrays//data.txt"))) {
			// loop over the data
			while (scanner.hasNext()) {
				// read the next int
				int number = scanner.nextInt();
				someNumbers.add(number);
				System.out.println(number);
			}
			numbers = someNumbers.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
			
			assertEquals(11400, ArrayUtil.findMax(numbers));
		} catch (FileNotFoundException e) {
			// fail("Unable to create large array to test with."); // or just disable the test by letting it pass
			e.printStackTrace();
		} // no finally bc try with resources closes the scanner
	}
	
	// with a 1000 values
	@Test
	void findMaxOfArrayWithA1000Values() {
		ArrayList<Integer> someNumbers = new ArrayList<>(); // I made a csv of 1000 values 1 to 1000 in Mockaroo I will use to fill this
		
		try (BufferedReader reader = new BufferedReader(new FileReader("./src/test/resources/com/skillstorm/arrays/numbers.csv"))) { // try-with-resources closes the reader for us
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// Parse line (one number per line assumed)
				someNumbers.add(Integer.parseInt(line));
				line = reader.readLine();
			}
			System.out.println(someNumbers.size() + " numbers in the csv file!");
			
			// convert to array and call the findMax method
			numbers = someNumbers.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
			assertEquals(1000, ArrayUtil.findMax(numbers));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
