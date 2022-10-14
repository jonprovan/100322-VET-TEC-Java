package com.skillstorm;

// the "final" keyword makes it so you CANNOT extend (inherit from) a class
// public final class Animal {

public class Animal {
	
	// Properties that ALL animals have
	public boolean hasLegs;
	public String color;
	public String diet;
	
	// Constructors
	public Animal() {
		super();
	}
	
	public Animal(boolean hasLegs, String color, String diet) {
		this.hasLegs = hasLegs;
		this.color = color;
		this.diet = diet;
	}
	
	
	// Methods that ALL animals have
	public void move() {
		System.out.println("I am an Animal, and I just went forward.");
	}
	
	public void speak() {
		System.out.println("Generic Animal Noise");
	}
	
	// RUNTIME POLYMORPHISM
	// same as method overriding
	// we have an eat() method here AND in our Dog class, which inherits from Animal
	// when the program runs, it decides which method it's going to run, based on what class we're running it on
	// if it's an Animal, it'll run the Animal version, if it's a Dog (even though a Dog IS AN Animal), it'll run the Dog version
	public void eat() {
		System.out.println("I am an Animal, and now I am full.");
	}
	
	public static void drink() {
		System.out.println("Glub, glub...Animal like drink.");
	}
	
	
	
	
}
