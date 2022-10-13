package com.skillstorm;

public class Nurse extends Professional {
	
	private String job = "Nurse";
	
	// constructors
	
	public Nurse() {
		super();
	}
	
	public Nurse(String name, byte age, String degreeName) {
		super(name, age, degreeName);
	}
	
	
	// this class, if it is not an abstract class, MUST implement ALL abstract methods from its parent
	public void declareJob() {
		System.out.println(job);
	}
	
	public void growUp() {
		super.setAge((byte)(super.getAge() + 1));
	}

}
