package com.skillstorm.customexceptions;

// This is my custom exception class
public class MyCheckedException extends Exception {
	
	// no-args constructor that doesn't take in any values
	public MyCheckedException() {
		super();
	}
	
	
	// If I add this constructor, do I still have a default constructor?
	//    NO once I add this constructor Java does not provide one for me
	public MyCheckedException(String message) {
		// to set the message property I can call the super constructor
		super(message);
	}
	
	// A constructor that takes in a message and a cause
	public MyCheckedException(String message, Throwable cause) {
		// to set the message and cause I can call the super constructor
		super(message, cause);
	}
	
	public MyCheckedException(String message, Throwable cause, boolean suppressable, boolean writable) {
		super(message, cause, suppressable, writable);
	}

}
