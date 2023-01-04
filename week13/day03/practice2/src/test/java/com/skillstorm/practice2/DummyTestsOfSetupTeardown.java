package com.skillstorm.practice2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DummyTestsOfSetupTeardown {
	
	// BeforeAll runs once when the class is set up
	// Here we can assign values to class properties like a database connection
	ArrayList<String> myList;

	@BeforeAll
	static void setUpBeforeClass() throws Exception { // MUST BE STATIC
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
		myList = new ArrayList<>(Arrays.asList("apple", "banana", "orange")); 
		// If I reuse this in multiple tests, don't assign in BeforeAll and depend on the order of the tests run
		// or the result of one test providing the input for the next test
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

	@Test
	void test() {
		System.out.println("test fail");
		fail("Not yet implemented");
	}
	
	// Test 1 - tests remove
	@Test
	void removeAnItemThatExists() {
		System.out.println("test remove");
		// Act and Assert
		assertTrue(myList.remove("banana"), "banana was not successfully removed");
		assertFalse(myList.contains("banana"));
	}
	
	// Test 2 - tests add
	@Test
	void addAnItemToTheList() {
		System.out.println("Test add");
		int length = myList.size();
		String newValue = "cherries";
		
		// Act
		myList.add(newValue);
		
		// Assert
		// length is one more than before
		assertEquals(length + 1, myList.size());
		// placed at end
		assertEquals(newValue, myList.get(myList.size() - 1));
		
	}
	
	
	// Test 3 - tests find

}
