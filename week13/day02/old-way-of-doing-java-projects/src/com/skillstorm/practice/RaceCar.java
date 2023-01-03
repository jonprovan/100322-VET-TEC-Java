package com.skillstorm.practice;

import java.util.Objects;

public class RaceCar extends Car {
	
	// property
	private int numOfStickers;


	
	// getters and setters
	
	public int getNumOfStickers() {
		return numOfStickers;
	}

	public void setNumOfStickers(int numOfStickers) {
		this.numOfStickers = numOfStickers;
	}
	
	// methods
	
	// don't allow negative stickers
	public void addStickers(int numStickers) {
		if (numStickers < 0) {
			// do something
			throw new IllegalArgumentException("Cannot have negative stickers. Call removeStickers method instead.");
		}
		this.numOfStickers += numStickers;
	}
	
	// don't allow negative stickers
	public void removeStickers(int numStickers) {
		if (numStickers < 0) {
			// note: this is a RuntimeException so we do not need to declare or catch
			throw new IllegalArgumentException("Cannot have negative stickers. Call addStickers method instead.");
		}
		this.numOfStickers -= numStickers;
		
	}

	@Override
	public String toString() {
		return "RaceCar [numOfStickers=" + numOfStickers + ", exhaustLoudness " + this.getExhaustLoudness() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numOfStickers);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		RaceCar other = (RaceCar) obj;
		return numOfStickers == other.numOfStickers;
	}
	
	
	
	

}
