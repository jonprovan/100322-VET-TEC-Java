package com.skillstorm.passbyreferencevsvalue;

import com.skillstorm.customexceptions.SuperHero;

public class ExamplePassByReferenceAndValueMethods {
	
	public static void main(String[] args) {
		
		int n = 10;
		increment(n);
		System.out.println(n);
		
		SuperHero superman = new SuperHero();
		superman.setIndestructable(true);
		attackSuperhero(superman);
		System.out.println("After attack Superman is " + superman.isIndestructable());
		
	}
	
	// pass by value example
	public static void increment(int n) { // <-- declares a new variable called n and stores the value 10 // int n = 10
		n = n + 1;
	}
	
	public static void attackSuperhero(SuperHero superman) {
		superman.setIndestructable(false);
		System.out.println("This superhero is now " + superman.isIndestructable());
	}
	
	public static void attackSuperheroV2(SuperHero superman) {
		SuperHero superhero = new SuperHero();
		superhero.setIndestructable(superman.isIndestructable());
		superhero.setIndestructable(false);
		System.out.println("Is this superhero still indestructable? " + superhero.isIndestructable());
	}

}
