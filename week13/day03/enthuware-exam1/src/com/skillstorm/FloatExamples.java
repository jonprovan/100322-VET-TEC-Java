package com.skillstorm;

public class FloatExamples {

	public static void main(String[] args) {
		// float f1 = 1.0; // compiler assumes it's a double and a double fan't fit in a float
		float f2 = 1.0f; // this would work
		float f3 = -1; // and int fits in a double
		float f4 = 0x123; // this is hexidecimal values that Java compiler recognizes
		int hexValue1 = 0x100;
		int hexValue2 = 0x1234;
		int hexValue3 = 0xDEAF;
		int hexValue4 = 0xCAB;
		// you can also use binary

		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
	}

}
