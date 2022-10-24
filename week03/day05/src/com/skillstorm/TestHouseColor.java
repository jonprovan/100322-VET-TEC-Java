package com.skillstorm;

public class TestHouseColor {
	
	public static void main(String[] args) {
		Color red = new Color("red", 1.0);
		House myHouse = new House(red);
		System.out.println(myHouse);
		
		red.setName("Pink");
		System.out.println("Color is now " + red);
		System.out.println("House should be the same, is it? " + myHouse);
	}

}
