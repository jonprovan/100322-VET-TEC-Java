package com.skillstorm.customexceptions;

public class CustomExceptionPractice2 {
	
	public static void main(String[] args) {
		// The compiler doesn't force me to catch or declare the exception
		// bc it IS-A RuntimeException (unchecked)
		throw new MyUncheckedException();
	}

}
