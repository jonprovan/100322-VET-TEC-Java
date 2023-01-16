package com.skillstorm.demo.models;

// @Entity not needed bc no JPA in this project, this is just a normal class that we will let Jackson turn into JSON
public class Hello {
	
	private String message;
	
	private boolean urgent;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}
	
}
