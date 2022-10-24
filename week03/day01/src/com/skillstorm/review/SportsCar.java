package com.skillstorm.review;

//public class SportsCar extends Car { // this doesn't work bc Car is a FINAL class
public class SportsCar extends java.lang.Object { // this class extends Object
	
//	public static int wheels = 4;
	public int wheel = 4;
	public static int wheels = 4;
	
	public String carModel;
	
	public SportsCar() {
//		super(); // this is not needed it is called automatically
	}
	
	public void drive() {
		System.out.println("zoom zoom");
	}

	@Override
	public String toString() {
		return "SportsCar [wheels=" + wheels + ", carModel=" + carModel + "]";
	}
	
	

}
