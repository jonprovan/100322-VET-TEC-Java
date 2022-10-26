package com.skillstorm;

import java.util.LinkedList;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		/*
		 * BUBBLE SORT
		 * 
		 * The bubble sort compares each pair of items in an list and swaps them if they're out of order
		 * 
		 * Iterates through each pair, then does multiple passes through the list until there are no more swaps
		 * 
		 * Useful tool for sorting an already-in-place list
		 */

		LinkedList<Integer> myInts = new LinkedList<Integer>();
		
		myInts.add(8);
		myInts.add(3);
		myInts.add(9);
		myInts.add(5);
		myInts.add(10);
		myInts.add(1);
		myInts.add(2);
		myInts.add(7);
		myInts.add(4);
		myInts.add(0);
		myInts.add(6);
		
		System.out.println("myInts initial state:");
		System.out.println(myInts);
		
		System.out.println();
		
		bubbleSortOnePass(myInts);
		
		System.out.println("myInts state after One Pass:");
		System.out.println(myInts);
		
		System.out.println();
		
		bubbleSort(myInts);
		
		System.out.println("myInts state after Full Sort:");
		System.out.println(myInts);
		
	
		LinkedList<Integer> myEmptyList = null;
		bubbleSort(myEmptyList);
	}
	
	public static void bubbleSort(LinkedList<Integer> integerList) {
		
		if (integerList != null) {
			
			for (int j = 0; j < integerList.size() - 1; j++) {

				for (int i = 0; i < (integerList.size() - 1); i++) {
					if (integerList.get(i) > integerList.get(i + 1)) {
						integerList.add(i + 1, integerList.remove(i));
					}
				}
			} 
		}
	}
	
	public static void bubbleSortOnePass(LinkedList<Integer> integerList) {
		for (int i = 0; i < (integerList.size() - 1); i++) {
			if (integerList.get(i) > integerList.get(i + 1)) {
				integerList.add(i + 1, integerList.remove(i));
			}
		} 
	}
	

}
