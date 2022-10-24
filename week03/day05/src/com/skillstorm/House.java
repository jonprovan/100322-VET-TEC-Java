package com.skillstorm;

public class House {
	
	private Color color;
	
	public House(Color color) {
		this.color = new Color(color);
	};
	
	public Color getColor() {
		return new Color(this.color);
	}
	
	@Override
	public String toString() {
		return "My house is " + color;
	}

}
