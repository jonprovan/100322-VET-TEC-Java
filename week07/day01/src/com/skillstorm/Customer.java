package com.skillstorm;

public class Customer {
	
	// PROPERTIES
	// flavor
	private String flavor;
	
	// constructor(s)
	// no-args to test when Customer doesn't have a flavor
	public Customer() {
		super();
	}
	
	// custom to test other flavor methods
	public Customer(String flavor) {
		super();
		this.flavor = flavor;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public String toString() {
		return "Customer [flavor=" + flavor + "]";
	}
	
	

}
