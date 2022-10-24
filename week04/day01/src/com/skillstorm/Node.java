package com.skillstorm;

// GENERICS

/*
 * Generics allow us to add a placeholder type in our class definition that gets filled in when we create the object
 * 
 * I'd create a Node like this: Node<String> myNode = new Node<String>();
 * 
 * One of the typical placeholders is T, standing for Type
 * -- another one you may see is E for Element
 * -- but, doesn't ultimately matter, as long as it's the same everywhere you use it
 * 
 * Enables us to create a class with multiple purposes that can incorporate different data types
 */


// simulates a node in a singly-linked list
public class Node<T> {

	// properties include address of next node, the value itself
	private T value;
	private Node<T> next;
	
	// constructors
	public Node() {
		super();
	}
	
	public Node(T value) {
		this.value = value;
		// this.next = null; // don't need this, because instance variable "next" is null by default
	}
	
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
	
	
	
	
}
