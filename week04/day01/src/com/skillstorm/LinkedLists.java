package com.skillstorm;

// must import!
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		
		// if I don't declare a type, it defaults to a LinkedList of Objects
		// LinkedList myList = new LinkedList();
		
		// a LinkedList MUST contain objects of some kind, CANNOT contain primitives (unless inside Wrapper class)
		
		// declare a type inside the carets
		LinkedList<String> myStringList = new LinkedList<String>();
		
		// an empty list by default, NOT null
		System.out.println(myStringList);
		
		// adding each item to the end of the LinkedList
		myStringList.add("Football");
		myStringList.add("Cheesecake");
		myStringList.add("Paper Cut");
		
		System.out.println(myStringList);
		
		
		// inserting an item in the middle
		myStringList.add(1, "Baby Napkins"); // syntax here is first parameter = index where you want to insert; all items at/after that get moved to the right
		
		// overwriting an item with a new value
		myStringList.set(2, "Grandma's Shortbread");
		
		System.out.println(myStringList);
		
		// removing an item from the beginning
		myStringList.remove();
		
		System.out.println(myStringList);
		
		// removing an item from the middle
		myStringList.remove(1);
		
		System.out.println(myStringList);
		
		myStringList.add("Michael Douglas");
		myStringList.add("Gwar");
		myStringList.add("Earlobe Wax");
		myStringList.add("Fish Cakes");
		
		System.out.println(myStringList);
		
		// removing the item at the end
		myStringList.removeLast();
		
		System.out.println(myStringList);
		
		// removing an item by searching for it, then using the index
		myStringList.remove(myStringList.indexOf("Gwar"));
		
		System.out.println(myStringList);
		
		myStringList.add("Gwar");
		myStringList.add("Gwar");
		myStringList.add("Gwar");
		myStringList.add("Gwar");
		myStringList.add("Gwar");
		myStringList.add("Gwar");
		
		System.out.println(myStringList);
		
		// using removeAll()
		LinkedList<String> myListToRemove = new LinkedList<String>();
		myListToRemove.add("Gwar");
		myListToRemove.add("Paper Cut");
		
		// checking to see if myStringList has a single value in it
		System.out.println(myStringList.contains("Earlobe Wax"));
		// checking to see if it has ALL of a collection of values in it
		System.out.println(myStringList.containsAll(myListToRemove));
		
		// removing ALL instances of ALL values in one list from another
		myStringList.removeAll(myListToRemove);
		
		System.out.println(myStringList);
		
		
		// can I have a LinkedList of LinkedLists? YES!
		LinkedList<LinkedList<String>> myListOfLists = new LinkedList<LinkedList<String>>();
		
		myListOfLists.add(myStringList);
		myListOfLists.add(myListToRemove);
		
		System.out.println(myListOfLists);
		
//		LinkedList testList = new LinkedList<String>();
//		LinkedList otherTestList = new LinkedList<BetterBilliardBall>();
//		
//		LinkedList groupList = new LinkedList();
//		
//		groupList.add(testList);
//		groupList.add(otherTestList);
//		
//		LinkedList<String> stringList = new LinkedList<>();
		
		myStringList.add(null);
		
		System.out.println(myStringList);
		
		System.out.println(myStringList.indexOf("Earlobe Wax"));
	}

}
