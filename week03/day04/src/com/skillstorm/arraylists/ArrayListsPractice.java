package com.skillstorm.arraylists;

import java.util.ArrayList;

public class ArrayListsPractice {
	
	public static void main(String[] args) {
		practice();
	}
	
	public static void practice() {
		
		/* What is an array?
		 * - list of items primitive or non-primitive
		 *    - primitive = holds value
		 *    - non-primitives = holds "reference" (memory address)
		 *    - ALL items must be SAME TYPE
		 *           (non-primitives - can use sub-type ex: Animals[] can hold cats & dogs)
 		 * - indexed specifically starting with 0
		 *     - the last index you can access is length - 1
		 * - we can access the items using the index
		 * - once you initialize the array size is FIXED
		 *     - you can initialize the size - it fills with default values ex: 0
		 *     - or you can initialize it with the values you want
		 * 
		 * 
		 * What is an ArrayList?
		 * - it's RESIZABLE - we can continue adding items indefinitely
		 * - don't need length specified up front
		 * - MUST BE NON-PRIMITIVE
		 * - ALL items must be of same type still
		 *      - or subtype
		 * -  
		 */
		
		// How to declare
		ArrayList<String> names = new ArrayList<>(); // default capacity is 10
		ArrayList objects = new ArrayList(); // stores ANY java.lang.Object and subtypes
		
		// instead of .length
		names.size(); // capacity vs number of items added
		System.out.println(names.size());
		
		// declare initial capacity
		ArrayList<Integer> numbers = new ArrayList<>(4);
		System.out.println(numbers.size());
		
		numbers.add(1); // 1 is autoboxed to be Integer
		numbers.add(Integer.valueOf(10));
		numbers.add(100);
		numbers.add(101);
		numbers.add(102); // 5th item -- exceeds capacity
		System.out.println(numbers.size());
		
		Integer n = new Integer(1); // not good style
		Integer x = Integer.valueOf(1);
		// autoboxing
		Integer y = 1;
		// auo-unboxing
		int z = y; 
		
		System.out.println(numbers);
		numbers.add(2, Integer.valueOf(50)); // index, value
		//numbers.add(9, Integer.valueOf(60)); // index > size DOES NOT work
		System.out.println(numbers);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(5);
		numbers2.add(7);
		
		// change the value at index 2 
		numbers.set(2, Integer.valueOf(55));
		System.out.println(numbers);
		numbers.set(2, Integer.valueOf(1));
		System.out.println(numbers);
		
		// copy everything
		numbers.addAll(numbers2);
		System.out.println(numbers);
		
		numbers.add(1, Integer.valueOf(27));
		System.out.println(numbers.size());
		numbers.add(numbers.size(), Integer.valueOf(1000));
		System.out.println(numbers.size());
		System.out.println(numbers);
		// remove by value
		numbers.remove(Integer.valueOf(1));
		
		// remove by index
		//numbers.remove(1); 
		System.out.println(numbers);
		
		
		
		
		
		
		
		
		
		
		// Strings examples
		ArrayList<String> people = new ArrayList<>();
		people.add("Jon");
		people.add("Joe");
		people.add("Jimmy");
		System.out.println(people);
		
		// remove by value
		people.remove("Joe");
		System.out.println(people);
		// remove by index
		people.remove(1); // 0-indexed
		System.out.println(people);
		
		people.add("Jon");
		System.out.println(people);
		
		
		people.remove("Jon");
		System.out.println(people);
		
		people.add("James");
		people.add("Joeseph");
		people.add("Jane");
		people.add("Jon");
		people.add("Jesus");
		people.add("Jon");
		people.add("Jimmerson");
		people.add("Jameson");
		people.add("Johnson");
		people.add("Jon");
		System.out.println(people);
		
		ArrayList<String> peopleWithoutTicket = new ArrayList<>();
		peopleWithoutTicket.add("Jon");
		
		people.removeAll(peopleWithoutTicket);
		System.out.println(people);
		
		//people.removeAll(people); // inefficient 
//		people.clear();
//		System.out.println(people);
		
		// set OVERWRITES the value   vs  add INSERTS the value
		people.set(0, "Jaqueline");
		System.out.println(people);
		
		people.set(1, "Juliet");
		System.out.println(people);
		
		System.out.println(people.get(2));
		
		System.out.println(people.get(people.size() - 1));
		
		System.out.println("size = " + people.size());
		
		int middle = people.size() / 2; 
		
		System.out.println("middle = " + middle);
		System.out.println(people.get(middle));
		
		System.out.println(people.indexOf("Jameson"));
		System.out.println(people.indexOf("Jon")); // -1 means NOT FOUND
		
		// indexOf with duplicates
		people.set(middle, "Jon");
		people.set(people.size() - 1, "Jon");
		System.out.println(people);
		System.out.println("Found Jon at index " + people.indexOf("Jon"));
		
		
		// contains
		System.out.println("Is Jon in the list? " + people.contains("Jon"));
		System.out.println("Is Jesus here? " + people.contains("Jesus"));
		
		System.out.println(people);
		
		ArrayList<String> keepers = new ArrayList<>();
		keepers.add("Jimmerson");
		keepers.add("Jameson");
		keepers.add("Jon");
		people.retainAll(keepers);
		System.out.println(people);
		
		// retain range -- PROTECTED only accessible if we create MyArrayList extends ArrayList
		// people.retainRange(0, 3);
	} // end main

}
