package com.skillstorm.arraylists;

public class TestPetOwner {
	
	public static void main(String[] args) {
		PetOwner erica = new PetOwner();
		erica.adopt("Boots the Cat");
		System.out.println(erica.getPets());
		
		erica.getPets().add("Stanley the Snake");
		erica.getPets().remove(0);
		
		System.out.println(erica.getPets());
	}

}
