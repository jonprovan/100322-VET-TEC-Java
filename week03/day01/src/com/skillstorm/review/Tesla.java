package com.skillstorm.review;

public class Tesla extends SportsCar {
	
	public String color;
	
	// override the drive method in the parent SportsCar class
	public void drive() {
		System.out.println("Go fast!");
	}
	
	public void describe() {
		System.out.println("This is a " + color + " " + carModel + " car" );
	}
	
	public static void main(String[] args) {
		Tesla myTesla = new Tesla();
		myTesla.color = "blue";
		myTesla.carModel = "Model Y";
		myTesla.describe();
	}

	@Override
	public String toString() {
		return "Tesla [color=" + color + ", wheels=" + wheels + ", carModel=" + carModel + "]";
	}


	
	

}
