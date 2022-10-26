package com.skillstorm;

import java.util.LinkedList;
import java.util.Random;

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
		
		LinkedList<Integer> myGiantList = new LinkedList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			myGiantList.add(new Random().nextInt(1000));
		}
		
		System.out.println();
		
		System.out.println("myGiantList of 100 random numbers 0-999:");
		System.out.println(myGiantList);
		
		System.out.println();
		
		bubbleSort(myGiantList);
		
		System.out.println("myGiantList after being bubble-sorted:");
		System.out.println(myGiantList);
		
		
	}
	
	public static void bubbleSort(LinkedList<Integer> integerList) {
		
		// checking to see if the user gave us a null list object
		if (integerList != null) {
			
			// this loop refers to each pass through the list; we need one fewer than the list's size to fully sort
			for (int j = 0; j < integerList.size() - 1; j++) {

				// this loop refers to the swaps within each pass; we need one for each pair, so one fewer than the list's size 
				for (int i = 0; i < (integerList.size() - 1); i++) {
					
					// if the one we're on is greater than the next one...
					if (integerList.get(i) > integerList.get(i + 1)) {
						// ...remove it and insert it after the next one
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
