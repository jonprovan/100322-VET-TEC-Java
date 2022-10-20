package com.skillstorm.arraylists;

import java.util.ArrayList;

public class TestPetOwner {
	
	public static void main(String[] args) {
		PetOwner erica = new PetOwner();
		erica.adopt("Boots the Cat");
		System.out.println(erica.getPets());
		
		erica.getPets().add("Stanley the Snake");
		erica.getPets().remove(0);
		
		System.out.println(erica.getPets());
		
		ArrayList<String> pets = new ArrayList<>();
		pets.add("Bau the Dog");
		PetOwner lamar = new PetOwner(pets);
		System.out.println(lamar.getPets());
		
		pets.remove("Bau the Dog");
		System.out.println(lamar.getPets());
		
		erica.adopt("");
		System.out.println(erica.getPets());
		
	}

}
