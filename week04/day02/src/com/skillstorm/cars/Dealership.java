package com.skillstorm.cars;

import java.util.LinkedList;

// this class is for the dealership itself
// properties and methods that are specific to Customer, Salesperson, Car go elsewhere
public class Dealership {
	
	// properties
	private String name;
	private String location;
	private LinkedList<Vehicle> inventory;
	private double cashOnHand;
	
	// constructors
	public Dealership() {
		super();
		this.inventory = new LinkedList<Vehicle>();
	}
	
	public Dealership(String name, String location, LinkedList<Vehicle> inventory, double cashOnHand) {
		super();
		this.name = name;
		this.location = location;
		
		// must check if inventory given is null, because we want to make sure that we have an empty list to add to later
		if (inventory == null) {
			this.inventory = new LinkedList<Vehicle>();
		} else {
			this.inventory = inventory;
		}
		
		this.cashOnHand = cashOnHand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LinkedList<Vehicle> getInventory() {
		return inventory;
	}

	public void setInventory(LinkedList<Vehicle> inventory) {
		this.inventory = inventory;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	@Override
	public String toString() {
		return "Dealership [name=" + name + ", location=" + location + ", inventory=" + inventory + ", cashOnHand=$"
				+ cashOnHand + "]";
	}


}
