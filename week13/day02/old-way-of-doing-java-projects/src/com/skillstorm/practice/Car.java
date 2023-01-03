package com.skillstorm.practice;

import java.util.Objects;

public class Car {
	
	// properties
	private float exhaustLoudness; // in dB

	// getters and setters
	
	public float getExhaustLoudness() {
		return exhaustLoudness;
	}

	public void setExhaustLoudness(float exhaustLoudness) {
		this.exhaustLoudness = exhaustLoudness;
	}

	// methods
	
	@Override
	public String toString() {
		return "Car [exhaustLoudness=" + exhaustLoudness + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(exhaustLoudness);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Float.floatToIntBits(exhaustLoudness) == Float.floatToIntBits(other.exhaustLoudness);
	}
	
	
	// methods
	
	public void drive() {
		System.out.println("vroom");
	}
	

}
