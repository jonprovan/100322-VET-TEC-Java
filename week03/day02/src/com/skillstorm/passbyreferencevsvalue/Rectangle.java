package com.skillstorm.passbyreferencevsvalue;

public class Rectangle {
	
	// Make the class fully encapsulated
	// Properties should be marked private
	private double height;
	private double width;
	
	public Rectangle() {
//		super(); // super is called automatically
		this.height = 1; // default
		this.width = 1; // default
	}
	
	public Rectangle(double height, double width) {
		isValid(height);
		isValid(width);
		this.height = height;
		this.width = width;
	}
	
	// Getters and Setters should be marked public
	public double getHeight() {
		return this.height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setHeight(double value) {
		// check if the value is valid
		isValid(value);
		// if it is, set the value
		this.height = value;
	}
	
	public void setWidth(double value) {
		isValid(value);
		this.width = value;
	}
	
	private static void isValid(double value) {
		if (value <= 0) {
			throw new IllegalArgumentException("Please input a value > 0");
		}
	}
	
	@Override 
	public String toString() {
		return "Rectangle: width = " + width + ", height = " + height;
	}

}
