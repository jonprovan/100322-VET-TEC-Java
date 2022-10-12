package com.skillstorm;

// "extends" makes this class inherit from Car
public class Mustang extends Car {

	// properties
	public String engineType;
	public boolean isAwesome;
	
	// constructors
	public Mustang() {
		super();
	}
	
	public Mustang(String color, String fuelType, String engineType, boolean isAwesome) {
		super(color, fuelType);
		
		// this works but is redundant code -- we already wrote it in our Car custom constructor
		// super.color = color;
		// super.fuelType = fuelType;
		
		// this also works but is both redundant and confusing, since this Object doesn't have these properties
		// a Mustang IS A Car, though, so this compiles
		// this.color = color;
		// this.fuelType = fuelType;
		
		this.engineType = engineType;
		this.isAwesome = isAwesome;
	}
	
	
	// methods
	public void drive() {
		System.out.println("Mustang beats Fiat...see ya, sucka!");
	}
	
}
