package com.skillstorm;

public class Color {
	
	private String name;
	
	private double opacity; // 0.0 to 1.0
	
	public Color(String name, double opacity) {
		this.name = name;
		this.opacity = opacity;
	}
	
	// COPY CONSTRUCTOR
	public Color(Color other) {
		this.name = other.name;
		this.opacity = other.opacity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + " with an opacity of " + opacity;
	}

}
