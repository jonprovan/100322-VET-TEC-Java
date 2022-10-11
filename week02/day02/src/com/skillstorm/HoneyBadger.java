package com.skillstorm;

// also inherits from Animal
public class HoneyBadger extends Animal {

	public boolean isUnstoppable = true;
	
	public HoneyBadger() {
		super();
	}
	
	// overriding
	public void speak() {
		System.out.println("Razzle-frazzle...take that, honeybees!");
	}
	
	public static void drink() {
		System.out.println("Glub, glub...HoneyBadger drink bee souls!");
	}
	
}
