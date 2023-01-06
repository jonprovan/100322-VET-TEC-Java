package com.skillstorm.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.skillstorm.utils.ArrayUtil;

class Array2DMaxTests {

	static int[][] numbers;

	@Disabled("This is an example failure test we do not want to run normally.")
	@Test
	void test() {
		fail("Not yet implemented");
	}

	// null outer array
	@Test
	void findMaxWithNullOuterArray() {
		numbers = null;

		Throwable e = assertThrows(IllegalArgumentException.class, () -> {
			ArrayUtil.findMax(numbers);
		});

		assertEquals("Please provide an array of number arrays.", e.getMessage());
	}

	// null first inner array
	@Test
	void findMaxwithNullFirstInnerArray() {
		numbers = new int[][] { null };

		Throwable e = assertThrows(IllegalArgumentException.class, () -> {
			ArrayUtil.findMax(numbers);
		});

		assertEquals("Please provide at least one non-null, non-empty inner array.", e.getMessage());
	}

	// null second inner array
	@Test
	void findMaxwithNullSecondInnerArray() {
		numbers = new int[][] { { 1 }, null };

		assertDoesNotThrow(() -> {
			ArrayUtil.findMax(numbers);
		});
	}

	// null all inner arrays
	@Test
	void findMaxwithAllNullInnerArray() {
		numbers = new int[][] { null, null, null, null };

		Throwable e = assertThrows(IllegalArgumentException.class, () -> {
			ArrayUtil.findMax(numbers);
		});

		assertEquals("Please provide at least one non-null, non-empty inner array.", e.getMessage());
	
	}

	// empty outer array
	@Test
	void findMaxwithEmptyOuterArray() {
		numbers = new int[][] { };

		Throwable e = assertThrows(IllegalArgumentException.class, () -> {
			ArrayUtil.findMax(numbers);
		});

		assertEquals("Please provide an array of number arrays.", e.getMessage());
	}

	// empty inner array
	void findMaxWithAnEmptyInnerArray() {
		numbers = new int[][] { { 1 }, { 1, 2 }, {}, { 1, 2, 3 }, { 1, 2 } };

		assertDoesNotThrow(() -> {
			ArrayUtil.findMax(numbers);
		});

		assertEquals(3, ArrayUtil.findMax(numbers));
	}

	// all empty inner arrays
	@Test
	void findMaxWithAllEmptyInnerArrays() {
		numbers = new int[][] { {}, {}, {}, {} };

		Throwable e = assertThrows(IllegalArgumentException.class, () -> {
			ArrayUtil.findMax(numbers);
		});

		assertEquals("Please provide at least one non-null, non-empty inner array.", e.getMessage());
	}

	// one inner array

	// some inner arrays

	// multiple of the same max

	// all negative values

	// some very large values

	// some very small values

}
