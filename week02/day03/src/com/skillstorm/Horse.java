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

	public Horse addHair(int newHair) {
		amountOfHair = amountOfHair + newHair;
		return this;
	}
	
	public Horse addLotsOfHair(int newHair) {
		amountOfHair = amountOfHair + (newHair * 10);
		return this;
	}
	
	public Horse addAnInsaneAmountOfHair(int newHair) {
		amountOfHair = amountOfHair + (newHair * 1000);
		return this;
	}

}
