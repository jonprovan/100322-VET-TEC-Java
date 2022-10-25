package com.skillstorm.cars;

// this class represents an individual Vehicle
// we should include properties and methods that are relevant to this project
public class Vehicle {
	
	// properties
	private String make;
	private String model;
	private short year;
	private String type;
	private String color;
	private String fuelType;
	private double price;

	// constructors
	public Vehicle() {
		super();
	}
	
	public Vehicle(String make, String model, short year, String type, String color, String fuelType, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.type = type;
		this.color = color;
		this.fuelType = fuelType;
		this.price = price;
	}
	
	// getters and setters
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", type=" + type + ", color=" + color
				+ ", fuelType=" + fuelType + ", price=$" + price + "]";
	}

	
	
}
