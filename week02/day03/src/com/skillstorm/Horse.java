package com.skillstorm;

public class Horse {
	
	public String name;
	public int amountOfHair = 0;
	
	public Horse() {
		super();
	}
	
	public Horse(String name, int amountOfHair) {
		this.name = name;
		this.amountOfHair = amountOfHair;
	}

	// overrides Object's toString() method
	// be default, just prints out the memory location of the Object

	@Override
	public String toString() {
		return "Horse [name=" + name + ", amountOfHair=" + amountOfHair + "]";
	}

	// return value is Horse, because we need our next method in the chain to operate on a Horse object
	public Horse addHair(int newHair) {
		amountOfHair = amountOfHair + newHair;
		// we return the same Horse object we fed in, so we can keep operating on it
		return this;
	}
	
	// same thing here
	public Horse addLotsOfHair(int newHair) {
		amountOfHair = amountOfHair + (newHair * 10);
		return this;
	}
	
	// even though this one was last in our original chain, we still return our Horse, so we can do these in any order
	public Horse addAnInsaneAmountOfHair(int newHair) {
		amountOfHair = amountOfHair + (newHair * 1000);
		return this;
	}

}
