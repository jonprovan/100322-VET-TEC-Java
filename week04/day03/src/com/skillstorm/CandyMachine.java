package com.skillstorm;

// this is our "owner" class that will HAVE-A class as a property
public class CandyMachine {
	
	// standard properties
	private String name;
	private String manufacturer;
	private boolean powered;
	
	// this property is the object that our class HAS
	// so now, our CandyMachine HAS-A MixingApparatus
	private MixingApparatus mixingApparatus = new MixingApparatus();
	
	// constructors
	public CandyMachine() {
		super();
	}
	
	public CandyMachine(String name, String manufacturer) {
		this.name = name;
		this.manufacturer = manufacturer;
	}

	// getters and setters; don't need one for the MixingApparatus, because we wanna keep it the same
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public boolean isPowered() {
		return powered;
	}

	public void setPowered(boolean powered) {
		this.powered = powered;
	}

	// custom methods
	// changes power state no matter which it is
	public boolean togglePower() {
		powered = !powered;
		return powered;
	}
	
	// the functionality for this method is offloaded to the MixingApparatus associated with this CandyMachine
	public Candy makeCandy(int cupsOfSugar) {
		
		return mixingApparatus.mixCandy(cupsOfSugar);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
