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
	// private int size; // we have now created a method to get this = size()
	
	// "default" constructor creates an empty list
	public MyLinkedList() {
		super();
	}
	
	// to add a node to our list
	// this is a factory design pattern
	// the "user" does not even know that Nodes exist OR what type of node is being created
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
			
			// when we find the last node, we create a new node with our parameter's value and point the last node to it
			Node<T> newNode = new Node<T>(thing);
			lastNodeFinder.setNext(newNode);
			
		}
	}
	
	// we don't have size as a parameter, because we can "easily" derive it
	// can simply call this method whenever we need the size
	public int size() {
		
		// similar logic to our add() method
		if (head == null) {
			return 0;
		} else {
			// counting the Nodes as we move through the list
			int size = 1;
			Node<T> counterNode = this.head;
			
			while (counterNode.getNext() != null) {
				counterNode = counterNode.getNext();
				size++;
			}
			
			return size;
		}
	}
	
	public T get(int index) {
		
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("The given index is outside the bounds of this MyLinkedList.");
		} else {
			
			int currentIndex = 0;
			Node<T> getterNode = this.head;
			
			while (getterNode != null) {
				
				if (index == currentIndex) {
					return getterNode.getValue();
				} else {
					getterNode = getterNode.getNext();
					currentIndex++;
				}
			
			}
			
			return null; // we'll never reach this, but Java doesn't know that and is expecting a return of some kind
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
