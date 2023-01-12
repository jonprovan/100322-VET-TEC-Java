package com.skillstorm.practice.models;

// We throw this when the update wasn't successful
// because the object didn't exist
public class MyCustomException extends Exception {

	private static final long serialVersionUID = 8188881780139960437L;
	
	public MyCustomException() { }
	
	public MyCustomException(String message) {
		super(message);
	}
	
	

}
