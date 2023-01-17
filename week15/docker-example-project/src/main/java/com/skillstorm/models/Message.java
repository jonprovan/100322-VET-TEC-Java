package com.skillstorm.models;

// Im not using Data JPA, this is just regular Java class, that we will make an instance of
// It will get converted to JSON and served to our client who makes a request
public class Message {

	private String message;
	private boolean urgent;
	
	public Message(String message, boolean urgent) {
		super();
		this.message = message;
		this.urgent = urgent;
	}

	public Message() {

	}

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
