package com.skillstorm;

public class Skittle {
	
	// properties
	private String color;
	private String flavor;
	
	// constructors
	public Skittle() {
		super();
	}
	
	public Skittle(String color, String flavor) {
		this.color = color;
		this.flavor = flavor;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public boolean equals(Object object) {
		
		// if the object we're comparing our object to is the same object, return true
		if (object == this) {
			return true;
		}
		
		// if the object we're comparing our object to is not even a Skittle, return false
		if (!(object instanceof Skittle)) {
			return false;
		}
		
		// cast our object as a Skittle
		Skittle newSkittle = (Skittle)object;
		
		// compare individual properties
		if (this.color == newSkittle.getColor() && this.flavor == newSkittle.getFlavor()) {
			return true;
		} else {
			return false;
		}
 		
	}
	

}
