package com.example.demo;

public class Movie {
	
	private String title;
	
	public Movie() { }
	
	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return this.title;
	}

}
