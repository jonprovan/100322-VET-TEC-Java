package com.skillstorm;

// going to mimic the behavior of a singly-linked list
// this T has no relation to the T in our Node class
public class MyLinkedList<T> {

	/*
	 * WHAT DO I NEED IN ORDER TO BE A LINKEDLIST?
	 * 
	 *  1. head node (first node in the list)
	 *  2. can also have a tail node (last node in the list)
	 *  3. node order management
	 *  4. some way to find out the size
	 */
	
	private Node<T> head; // defaults to null
	
	// could include these OR derive them through other means
	// private Node<T> tail;
	// private int size;
	
	public MyLinkedList() {
		super();
	}
	
	public void add(T thing) {
		
		if (head == null) {
			// this happens if the list is empty
			this.head = new Node<T>(thing);
		} else {
			
			// create a temporary node to "step" our way through the list
			// need to find out where the end is
			
			Node<T> lastNodeFinder = this.head;
			
			while (lastNodeFinder.getNext() != null) {
				lastNodeFinder = lastNodeFinder.getNext();
			}
			
			Node<T> newNode = new Node<T>(thing);
			lastNodeFinder.setNext(newNode);
			
		}
	}
	
}
