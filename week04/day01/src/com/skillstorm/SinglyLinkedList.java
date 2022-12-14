package com.skillstorm;

public class SinglyLinkedList {

	public static void main(String[] args) {
		
		// this one goes nowhere and has no value
		Node emptyNode = new Node();
		
		System.out.println(emptyNode.getValue());
		System.out.println(emptyNode.getNext());
		
		System.out.println();
		
		// this one has a value but still points nowhere
		Node<String> myFunNode = new Node<String>("Programming is fun!");
		
		System.out.println(myFunNode.getValue());
		System.out.println(myFunNode.getNext());
		
		Node<String> myNewFunNode = new Node<String>("I am Mr. Head!", myFunNode);
		
		System.out.println(myFunNode);
		System.out.println(myNewFunNode.getNext());
		
		// can use different data types for each instance of Node, BUT...
		Node<Integer> myNumericallyFunNode = new Node<Integer>(42);
		
		// ...can NOT do this, because myFunNode requires a Node of String type to be next
		// myFunNode.setNext(myNumericallyFunNode);
		
		System.out.println();
		
		MyLinkedList<String> stringList = new MyLinkedList<String>();
		
		stringList.add("It don't mean a thing if it ain't got that String.");
		stringList.add("Theory");
		stringList.add("-a-ling");
		stringList.add(null);
		stringList.add("It don't mean a thing if it ain't got that String.");
		stringList.add("Theory");
		stringList.add("-a-ling");
		stringList.add(null);
		stringList.add("It don't mean a thing if it ain't got that String.");
		stringList.add("Theory");
		stringList.add("HUZZAH!!!");
		stringList.add("-a-ling");
		stringList.add(null);
		
		
		System.out.println(stringList.size());
		
		System.out.println(stringList.get(10));
		
		

	}

}
