package day01;

import java.util.HashSet;

public class HashCodePractice {
	
	public static void main(String[] args) {
		Cat myCat = new Cat("Boots", "Erica");
		// method 1
		System.out.println("myCat " + myCat);
		System.out.println(myCat.hashCode());
		Cat otherCat = new Cat("Garfield","Jonathan Q. Arbuckle");
		System.out.println("Garfield: " + otherCat);
		System.out.println(otherCat.hashCode());
		// change contents
		myCat.name = "Pinky";

		System.out.println("myCat " + myCat);
		System.out.println(myCat.hashCode());
		
		
		// HashSet
		HashSet<Cat> cats = new HashSet<>();
		cats.add(otherCat);
		cats.add(myCat);
		cats.add(new Cat("Jocey", "Kelvin"));
		cats.add(new Cat("Gaia", "Enesto"));
		cats.add(new Cat("Sirious", "Dylan"));
		cats.add(new Cat("Lenny", "Brian"));
		cats.add(new Cat("Carol Baskin", "Jordan"));
		
		System.out.println(cats);
		
		// contains
		// won't work without .hashCode() implemented -- breaking equals contract
		boolean isBoots = cats.contains(new Cat("Boots", "Erica"));
		System.out.println("Is Boots in the set? " + isBoots);
		
		// 
		
	}

}
