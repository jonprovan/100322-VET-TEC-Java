package com.skillstorm.customexceptions;

// Custom exception
// Is an unchecked exception
public class KryptoniteException extends RuntimeException {

	// Constructors
	public KryptoniteException() {
		super();
	}
	
	public KryptoniteException(String message) {
		super(message);
	}
}
