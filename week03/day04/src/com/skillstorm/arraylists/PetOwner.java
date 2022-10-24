package com.skillstorm.arraylists;

import java.util.ArrayList;

public class PetOwner {
	
	private ArrayList<String> pets;
	
	public PetOwner() {
		this.pets = new ArrayList<String>();
	}
	
	public PetOwner(ArrayList<String> pets) {
		this.pets = new ArrayList<String>(pets);
		//this.pets = pets; // poorly encapsulated -- data leak
	}
	
	public ArrayList<String> getPets() {
		return new ArrayList<>(this.pets);
		// return this.pets; // poorly encapsulated -- data leak
	}
	
	// no setter bc unwanted 
	
	public void adopt(String pet) {
		if (pet ==null || pet.isEmpty()) // don't add invalid values
			return;
		this.pets.add(pet);
	}

}
