package com.skillstorm;

public class IsAndHas {

	public static void main(String[] args) {
		
		/*
		 * IS-A vs. HAS-A
		 * 
		 * 
		 * --- IS-A ---
		 * 
		 * An IS-A relationship is a parent-child (or parent-grandchild, etc.) relationship
		 * 
		 * If Dog extends Animal, then a Dog IS-AN Animal
		 * -- BUT an Animal IS NOT NECESSARILY A DOG
		 * 
		 * If Dog extends Animal, which extends Organism, then Dog IS-AN Animal and IS-AN Organism
		 * -- also, Animal IS-AN Organism
		 * -- BUT Organism is not necessarily an Animal or a Dog
		 * -- and Animal is not necessarily a Dog
		 * 
		 * 
		 * --- HAS-A ---
		 * 
		 * With HAS-A, we're talking about one object having another object as a property
		 * 
		 * An ElectricGuitar HAS-A Pickup
		 * 
		 * 2 rules:
		 * -- the Pickup cannot have a Guitar (the relationship cannot be reversed)
		 * -- the Pickup cannot exist outside of a Guitar
		 * 
		 * One of the main uses for HAS-A is offloading and abstracting functionality from the owner class
		 * -- the "user" requests an action from the owner class, and the owner class asks the owned class to do the action
		 * -- the "user" never knows the owned class even existed or how the action was executed
		 * 
		 */
		
		CandyMachine myMachine = new CandyMachine("The Douglas", "Wonka");
		
		Candy myCandy = myMachine.makeCandy(5);
		
		System.out.println(myCandy.getWeight());
		
		MixingApparatus myAp = new MixingApparatus();

	}

}
