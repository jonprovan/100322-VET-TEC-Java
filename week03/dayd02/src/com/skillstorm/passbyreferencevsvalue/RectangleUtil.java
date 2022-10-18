package com.skillstorm.passbyreferencevsvalue;

public class RectangleUtil {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(); // 1 by 1
		System.out.println("CALLING DOUBLE");
		doubleRectangle(rectangle);
		System.out.println(rectangle);
		
		System.out.println("CALLLING HALVE");
		halveRectangle(rectangle);
		System.out.println(rectangle);
	}
	
	public static void doubleRectangle(Rectangle rectangle) {
		// mutate the rectangle to be twice the size
		double width = rectangle.getWidth() * 2;
		double height = rectangle.getHeight() * 2;
		
		rectangle.setWidth(width);
		rectangle.setHeight(height);
		
		System.out.println(rectangle);
	}
	
	
	
	public static void halveRectangle(Rectangle rectangle) {
		// DO NOT mutate the rectangle to be half the size
		
		// make a copy
		Rectangle newRectangle = rectangle;
		rectangle = new Rectangle(rectangle.getWidth(), rectangle.getHeight());
		// halve the values
		double width = rectangle.getWidth() / 2;
		double height = rectangle.getHeight() / 2;
		rectangle = new Rectangle(width, height);
		// print it out
		System.out.println(rectangle);
		
	}

}
