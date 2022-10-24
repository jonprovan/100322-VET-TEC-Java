package com.skillstorm.review;

public class TestingExceptionsWithFinally {
	
	public static void main(String[] args) {
//		Rectangle rect = decreaseWidth();
//		System.out.println(rect);
		doStuff();
	}
	
	@SuppressWarnings("finally")
	public static Rectangle decreaseWidth() {
		   Rectangle rectangle = new Rectangle(1,1);
		   try {
			  double width = rectangle.getWidth() - 1;
		      rectangle.setWidth(width); // try to set width to 1 – 1 = 0
		      return rectangle;
		   } catch (Exception e) {
		      return rectangle; // set width failed, so at this point width=1
		   } finally {
		      rectangle.setWidth(0.00001); 
		      return rectangle;
//		      System.out.println("something here"); // wont run
		   }
	}
	
	@SuppressWarnings("finally")
	public static void doStuff() {
		try {
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			throw new IllegalArgumentException();
		} finally {
			throw new NullPointerException();
//			System.out.println("something here"); // unreachable code
		}
	}

}
