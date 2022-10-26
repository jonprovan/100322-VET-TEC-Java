package com.skillstorm;

import java.util.LinkedList;

public class Sorting {

	public static void main(String[] args) {
		
		/*
		 * LinkedLists are ordered, not sorted
		 * 
		 * Meaning -- the order in which you insert items is maintained
		 *   -- regardless of WHERE you insert the item
		 *   -- if I put items in like 2 - 6 - 11 - 8 - 1 - 7, they stay in that order
		 *   
		 *   NOT sorted, meaning, it doesn't come out like 1 - 2 - 6 - 7 - 8 - 11 if I insert them like the above
		 *   
		 *   Two ways to sort (to start; there are certainly others)
		 *   1. Insertion sort -- we sort the items as we put them in
		 *   2. Bubble sort -- used to sort items that are already in a list
		 *   
		 *   
		 *   Insertion sort is only going to work if the items already in the list are already sorted
		 */
		
		LinkedList<Integer> myInts = new LinkedList<Integer>();
		
		System.out.println(myInts);
		
		myInts.add(2);
		myInts.add(5);
		myInts.add(9);
		addAndSort(8, myInts);
		addAndSort(4, myInts);
		addAndSort(1, myInts);
		addAndSort(32, myInts);
		addAndSort(5, myInts);
		addAndSort(-123, myInts);
		addAndSort(2879, myInts);
		addAndSort(7, myInts);
		addAndSort(0, myInts);
		addAndSort(-1, myInts);
		addAndSort(2878, myInts);
		
		
		System.out.println(myInts);

	}
	
	public static void addAndSort(Integer integer, LinkedList<Integer> integerList) {
		
		// set a counter
		int index = 0;
		
		// check to see if the input integer is there
		if (integer != null) {
			
			// check to see if the list of numbers is empty
			if (!integerList.isEmpty()) {
				
				// as long as the input number is greater than or equal to the current index value
				while (integer >= integerList.get(index)) {
					
					// move right
					index++;
					
					// if we're at the end, stop
					if (index == integerList.size()) {
						break;
					}
				}
				
			} 
			
			// add the number to the list at that index
			integerList.add(index, integer);
			
		// this goes with the original integer null check	
		} else {
			System.out.println("Sorry, dude.");	
		}
		
	}
	
	
	

}
