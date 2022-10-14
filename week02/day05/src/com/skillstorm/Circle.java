package com.skillstorm;

// "implements" means it's using our Shape interface
public class Circle implements Shape {

	// this Circle MUST include this method, because the interface says it has to
	@Override
	public void declareMyself() {
		System.out.println("I am a Circle, and I have zero corners!");
	}

}
