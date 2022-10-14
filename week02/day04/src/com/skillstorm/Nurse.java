package com.skillstorm;

public class Nurse extends Professional {
	
	private String job = "Nurse";
	private String hatType;
	
	// constructors
	
	public Nurse() {
		super();
	}
	
	public Nurse(String name, byte age, String degreeName, String hatType) {
		super(name, age, degreeName);
		this.hatType = hatType;
	}
	
	public String getHatType() {
		return hatType;
	}

	public void setHatType(String hatType) {
		this.hatType = hatType;
	}

	// this class, if it is not an abstract class, MUST implement ALL abstract methods from its parent
	public void declareJob() {
		System.out.println(job);
	}
	
	public void growUp() {
		super.setAge((byte)(super.getAge() + 1));
	}

	@Override
	public String toString() {
		return "Nurse [job=" + job + ", hatType=" + hatType + ", degreeName=" + getDegreeName() + ", name="
				+ getName() + ", age=" + getAge() + "]";
	}
	
	

}
