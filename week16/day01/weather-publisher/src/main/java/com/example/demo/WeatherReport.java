package com.example.demo;

public class WeatherReport {
	
	private String description;
	
	private int tempHigh;
	
	private int tempLow;

	@Override
	public String toString() {
		return "WeatherReport [description=" + description + ", tempHigh=" + tempHigh + ", tempLow=" + tempLow + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTempHigh() {
		return tempHigh;
	}

	public void setTempHigh(int tempHigh) {
		this.tempHigh = tempHigh;
	}

	public int getTempLow() {
		return tempLow;
	}

	public void setTempLow(int tempLow) {
		this.tempLow = tempLow;
	}
	
}
