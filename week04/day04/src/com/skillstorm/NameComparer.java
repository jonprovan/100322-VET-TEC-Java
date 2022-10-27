package com.skillstorm;

import java.util.Comparator;

// implement Comparator interface and give it the type of the object we want to sort/compare
public class NameComparer implements Comparator<Person> {
	
	// must override this method
	public int compare(Person person1, Person person2) {
		
		// same as before, just with the two input objects
		return person1.getName().compareToIgnoreCase(person2.getName());
		
	}

}
