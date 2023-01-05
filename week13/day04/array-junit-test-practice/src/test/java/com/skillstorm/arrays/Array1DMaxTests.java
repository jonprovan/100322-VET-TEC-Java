package com.skillstorm.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.skillstorm.utils.ArrayUtil;


class Array1DMaxTests {
	
	static int[] numbers; // this is a class variable and gets initialized to null

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	

	// Tests we probably want are
	// null
	@Test
	void findMaxWhenArrayParameterIsNull() {
		// assert that find max when handed null does something
		// it should handle the nullpointerexception and instead throw a useful exception
		// IllegalArgumentException with a message that "Please provide an array of numbers." -- whatever required message you want
	
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
	

	
	// some
	
	// multiple of the same max
	
	// all negative values
	
	// some very large values
	
	// some very small values

}
