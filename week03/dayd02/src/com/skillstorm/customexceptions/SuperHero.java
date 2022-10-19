package com.skillstorm.customexceptions;

public class SuperHero {
	
	//Properties
	private boolean indestructable; 
	
	// Constructors
	public SuperHero() {
		this.indestructable = true;
	}
	
	public SuperHero(boolean indestructable) {
		this.indestructable = indestructable;
	}
	
	// getters and setters
	public boolean isIndestructable() { // naming convention for getter is getPropertyNmae or isPropertyName for booleans
		return this.indestructable;
	}
	
	public void setIndestructable(boolean indestructable) {
		this.indestructable =  indestructable;
	}
	
	// Methods
	public void fly(String weather) throws Exception {
		if (weather.equals("Rainy")) {
//			throw new Exception("Bad weather"); // I want to be more specific than this and throw my own exception type
			 throw new BadWeatherException("Can't fly when it's rainy");
		}
		System.out.println("Whoosh! Flying to the rescue!");
	}
	
	public void fightCrime() {
		if (!indestructable) {
			// throw an exception that Justice wasn't served
			throw new KryptoniteException("Foiled by Kryptonite. Justice was not served today.");
		}
		System.out.println("Justice is served!");
	}
	

	

}
