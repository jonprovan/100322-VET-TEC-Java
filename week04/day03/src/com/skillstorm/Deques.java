package com.skillstorm;

import java.util.Deque;
import java.util.LinkedList;

public class Deques {

	public static void main(String[] args) {
		
		/*
		 * We covered Stacks and Queues earlier this week
		 * 
		 * One other data structure is the Deque (some folks say "deck"...I disagree)
		 * 
		 * Stands for "double-ended queue"
		 * 
		 * -- can add or remove items from both ends
		 * -- shares functionality with the stack and the queue
		 */

		Deque<String> myLine = new LinkedList<String>();
		
		// can add at the front OR back
		// offerFirst() or offerLast()
		myLine.offerFirst("Zulmak");
		myLine.offerLast("Jim");
		myLine.offerFirst("Marvin");
		myLine.offerLast("Marla");
		
		System.out.println(myLine);
		
		// can see what's at the front OR back
		// peekFirst() or peekLast()
		System.out.println(myLine.peekFirst());
		System.out.println(myLine.peekLast());
		
		// can remove what's at the front OR back
		// pollFirst() or pollLast()
		myLine.pollFirst();
		
		System.out.println(myLine);
		
		myLine.pollLast();
		myLine.pollLast();
		
		System.out.println(myLine);
		
		System.out.println();
		
		myLine.offerLast("Chad");
		myLine.offerLast("Craig");
		myLine.offerLast("Miles");
		myLine.offerLast("Luke");
		myLine.offerLast("Zuckerberg");
		myLine.offerLast(null);
		myLine.offerLast("null");
		myLine.offerLast("Null");
		myLine.offerLast("Ryan");
		myLine.offerLast("Misty");
		myLine.offerLast("Shakira");
		myLine.offerLast("Maybelline");
		myLine.offerLast("Ciara");
		myLine.offerLast("Polly");
		myLine.offerLast("Lincoln");
		myLine.offerLast("Linkin");
		myLine.offerLast("Marge");
		myLine.offerLast("Tesla");
		myLine.offerLast("Joe");
		myLine.offerLast("Britknee");
		
		System.out.println(myLine);
		
		
		Deque<String> myNewLine = new LinkedList<String>();
		
		// can do this, but not as efficient, because we have to create a new list
		// myLine.offerLast(myLine.pollFirst()); x 10
		
		while (myLine.size() > 10) {
			myNewLine.offerFirst(myLine.pollLast());
		}
		
		System.out.println(myLine);
		
		System.out.println(myNewLine);
	}

}
