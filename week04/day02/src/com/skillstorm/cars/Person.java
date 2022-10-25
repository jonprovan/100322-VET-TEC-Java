package com.skillstorm.cars;

// this class represents a generic person with properties that will be inherited
public abstract class Person {

	// common properties among all people
	private String name;
	private double netWorth;
	
	// constructors
	public Person() {
		super();
	}
	
	public Person(String name, double netWorth) {
		this.name = name;
		this.netWorth = netWorth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(double netWorth) {
		this.netWorth = netWorth;
	}
	
}
