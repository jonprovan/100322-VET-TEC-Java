package com.skillstorm;

import java.util.Comparator;

// must implement the Comparator interface and give it the type of object we want sort/compare
public class AgeComparer implements Comparator<Person> {

	// must override the compare() method, taking in two of the object we want to compare
	public int compare(Person person1, Person person2) {
		
		// same as our age comparison function, but comparing ages of the two input objects
		return person1.getAge() - person2.getAge();
	}
	
}
