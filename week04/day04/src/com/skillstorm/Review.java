package com.skillstorm;

import java.util.Deque;

// if you use import java.util.*; -- you get EVERYTHING from the java.util package
// probably gets you a bunch of stuff you don't need
// BUT if you're importing everything from another package in your project, for instance, this makes a lot of sense

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Review {

	public static void main(String[] args) {
		
	/*
	 * REVIEW QUESTIONS
	 * 
	 * 1. How do we create/instantiate a LinkedList?
	 * 		a. What about a Stack?
	 * 		b. A Queue?
	 * 		c. A Deque (or Dequeue)?
	 * 
	 * 2. To add/remove/view an item, for each of the above, what are the methods we use?
	 * 
	 * 3. When, in the code below, is the object created in the first line eligible for garbage collection?
	 * 
	 * 4. Where in a class do we need to indicate that we're using a Generic type?
	 * 		a. What character/characters can we use for our Generic?
	 * 		b. Can we change it wherever we want?
	 * 
	 * 5. How do we instantiate a singly-linked List in Java?
	 * 		a. Why would we want to?
	 * 
	 * 6. If we weren't allowed to use the .size() method, how would we determine the length of our LinkedList?
	 * 
	 * 7. How do we set up an IS-A/IS-AN relationship?
	 * 		a. What about a HAS-A/HAS-AN relationship?
	 * 		b. Why would we want to use either one? What is each one's primary use case?
	 * 
	 * 8. How do we get the next or previous element from our LinkedList?
	 * 
	 * 9. In plain language, how does an Insertion sort work?
	 * 		a. What about a Bubble Sort?
	 * 		b. Why would we want to use one vs. the other?
	 * 		c. Which is better?
	 * 		d. What is the minimum number of passes a Bubble Sort must make on a list of Integers to ensure that it's fully sorted?
	 */
		
		// QUESTION 1
		// import java.util.LinkedList;
		// data type cannot be a primitive, must be an object of some sort (including Wrapper classes)
		
		LinkedList<Integer> listName = new LinkedList<Integer>();
		
		Stack<Integer> stackName = new Stack<Integer>();
		
		// cannot instantiate a Queue (new Queue<Integer>();) because it is an Interface; must apply this reference type to something like a LinkedList
		Queue<Integer> queueName = new LinkedList<Integer>();
		
		// same thing with Deque
		Deque<Integer> dequeName = new LinkedList<Integer>();
		
		
		
		// QUESTION 2
		// LinkedList - add(), remove(), get(index) -- adds to the end, removes from the beginning, looks at the index
		// Stack - push(), pop(), peek() -- adds to the top, removes from the top, looks at the top
		// Queue - offer(), poll(), peek() -- adds to the back, removes from the front, looks at the front
		// Deque - offerFirst() or offerLast(), pollFirst() or pollLast(), peekFirst() or peekLast()
		
		
		
		// QUESTION 3
		Object obj = new Object(); // this object
		Object obj2 = new Object();
		Object obj3 = new Object();
		obj3 = obj;
		obj = obj2;
		obj2 = null;
		obj3 = null;
		obj = null;
		
		
		// QUESTION 4
		// this is a class declaration
		// declare our Generic here
		// public class Node<T> {}
		
		/*
		 * Can use anything we want for our Generic except established keywords
		 * MUST match within each class, but CAN use different Generic names in different classes
		 * Probably should at least have a capital first letter, per standard naming conventions for objects
		 */
		
		// QUESTION 5
		// Java ONLY has doubly-linked lists by default
		// If you want a singly-linked list, you have to make one
		// Singly-linked list takes up less memory, because each Node only has one pointer instead of two
		
		
		// QUESTION 6
		
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		
		myLinkedList.add(4);
		myLinkedList.add(88);
		myLinkedList.add(12);
		myLinkedList.add(-10);
		myLinkedList.add(5);
		
		// counter starts at 0 because an empty list has size == 0, nothing at index 0
		// if there WERE something at index 0, it would have size == 1
		int counter = 0;
		
		for (Integer i : myLinkedList) {
			counter++;
		}
		
		System.out.println(counter);
		
		
		// QUESTION 7
		/*
		 * IS-A/IS-AN == through inheritance -- any object that extends or implements another object/interface IS-A that object/interface
		 * 
		 * -- Dog extends Animal and implements Pet, so Dog IS-AN Animal and IS-A Pet
		 * 
		 * HAS-A/HAS-AN == through the class properties
		 * 
		 * -- if one of Car's properties is an Engine object, then Car HAS-AN Engine
		 * -- usually, it can't go in reverse, i.e., an Engine CANNOT have a Car
		 * -- and, usually, an Engine cannot exist on its own
		 * 
		 * 
		 * Why use IS-A?
		 * -- we can reuse the code from the parent object
		 * -- they can share properties and methods
		 * -- easy to group together child objects and run code on all of them in, say, a LinkedList
		 * 
		 * Why use HAS-A?
		 * -- CAN reuse a "had" class in other classes that may want to share its functionality
		 * -- we can offload functionality from our "owner" class to the "had" class
		 * -- we are abstracting code/functionality away from the user
		 * 
		 */
		
		
	}
	
	
	
	
	
	
	
	
}
