package com.skillstorm;

// a simple, fully-encapsulated class
public class CoffeeMug {
	
	private int volumeInOunces;
	private String message;
	private boolean insulated;
	
	public CoffeeMug() {
		super();
	}

	public CoffeeMug(int volumeInOunces, String message, boolean insulated) {
		super();
		this.volumeInOunces = volumeInOunces;
		this.message = message;
		this.insulated = insulated;
	}

	// we want the "user" experience to stay consistent
	// so, if we change the functionality of our code internally
	// we want to try to ensure that it functions the same externally
	// the user is expecting a return value that fits into a byte
	// but we've changed volumeInOunces to an int, so this covers our bases
	public byte getVolumeInOunces() {
		if (volumeInOunces <= 127 && volumeInOunces >= -128) {
			return (byte)volumeInOunces;
		} else {
			System.out.println("Volume can't fit into a byte!");
			return 0;
		}
	}

	public void setVolumeInOunces(byte volumeInOunces) {
		this.volumeInOunces = volumeInOunces;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		if (message.length() < 8) {
			System.out.println("Too short...");
		} else {
			this.message = message;
		}	
	}

	public boolean isInsulated() {
		return insulated;
	}

	public void setInsulated(boolean insulated) {
		this.insulated = insulated;
	}

	@Override
	public String toString() {
		return "CoffeeMug [volumeInOunces=" + volumeInOunces + ", message=" + message + ", insulated=" + insulated
				+ "]";
	}
}
