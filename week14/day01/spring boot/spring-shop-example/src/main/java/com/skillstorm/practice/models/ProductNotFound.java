package com.skillstorm.practice.models;

public class ProductNotFound extends Exception {
	
	private static final long serialVersionUID = 1668377646834185118L;
	
	public ProductNotFound() { }
	
	public ProductNotFound(String message) {
		super(message);
	}

}
