package com.skillstorm;

public abstract class Professional extends Person {
	
	private String degreeName;
	
	// constructors
	public Professional() {
		super();
	}
		
	public Professional(String name, byte age, String degreeName) {
		super(name, age);
		this.degreeName = degreeName;
	}
	
	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public void showDegree() {
		System.out.println(degreeName);
	}
	
}
