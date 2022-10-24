package com.skillstorm.customexceptions;

public class BadWeatherException extends Exception {
	
	public BadWeatherException() {
		super();
	}
	
	public BadWeatherException(String message) {
		super(message);
	}

}
