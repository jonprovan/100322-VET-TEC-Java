package com.skillstorm;

public class Teacher extends Professional {
	
	private String job = "Teacher";
	
	// constructors
	
	public Teacher() {
		super();
	}
	
	public Teacher(String name, byte age, String degreeName) {
		super(name, age, degreeName);
	}

	@Override
	public void declareJob() {
		System.out.println(job);
	}

	@Override
	public void growUp() {
		super.setAge((byte)(super.getAge() + 3));
	}

}
