package com.skillstorm;

import java.util.Collections;
import java.util.LinkedList;

public class UsingComparable {

	public static void main(String[] args) {
		
		// THE COMPARABLE INTERFACE
		// we want to be able to use Java's Collections.sort() method
		
		// the Integer.compare(int x, int y) method takes two integers and returns:
		// 1 if the first is larger
		// 0 if they are equal
		// -1 if the first is smaller
		
		System.out.println("Comparing integers:");
		System.out.println(Integer.compare(7, 5));
		System.out.println(Integer.compare(5, 5));
		System.out.println(Integer.compare(3, 5));
		
		System.out.println();
		
		// the .compareTo(String string) method, when called on a String, returns:
		// a positive number if the first string is later in alpha order
		// 0 if it's the same
		// a negative number if the first string is earlier in alpha order
		
		System.out.println("Comparing strings:");
		System.out.println("mike".compareTo("anna"));
		System.out.println("mike".compareTo("mike"));
		System.out.println("anna".compareTo("mike"));
		// can create problems with upper- and lowercase letters
		// can use .toLowerCase() or .compareToIgnoreCase() methods to convert strings to lowercase before comparison
		System.out.println("Zaaa".toLowerCase().compareToIgnoreCase("aaaZ"));
		
		System.out.println();
		
		// using Collections.sort to sort a list by age or name
		LinkedList<Person> myPeople = new LinkedList<Person>();
		
		myPeople.add(new Person("Gandalf", 329));
		myPeople.add(new Person("Jones", 56));
		myPeople.add(new Person("Brian", 27));
		myPeople.add(new Person("Emily", 37));
		myPeople.add(new Person("Peter", 1));
		myPeople.add(new Person("Petri Dish", 123));
		myPeople.add(new Person("Brian", 12));
		myPeople.add(new Person("Brian", 99));
		myPeople.add(new Person("Brian", 33));
		myPeople.add(new Person("Angelina", 37));
		myPeople.add(new Person("Winona", 1));
		myPeople.add(new Person("Cheyenne", 123));
		
		
		System.out.println(myPeople);
		
		// uses the .compareTo() method of the items in the class
		// the class MUST override the .compareTo() method and CANNOT change the name
		// this uses the sorting method coded into the class itself
		//Collections.sort(myPeople);
		
		System.out.println(myPeople);
		
		// USING THE COMPARATOR INTERFACE
		
		// What if we want to be able to sort by more than one property?
		// Using our example, we want to choose at runtime to sort by name OR by age?
		// Can't do this with the Comparable interface
		
		System.out.println();
		
		// must instantiate our objects with the new sorting methods
		NameComparer nameComparer = new NameComparer();
		AgeComparer ageComparer = new AgeComparer();
		
		// this uses whichever sorting method we indicate with the second parameter
		Collections.sort(myPeople, nameComparer);
		// whichever one we sort by second will group those together, keeping the sort order of the other from the first group
		Collections.sort(myPeople, ageComparer);
		
		
		System.out.println(myPeople);
		
		
	}

}
