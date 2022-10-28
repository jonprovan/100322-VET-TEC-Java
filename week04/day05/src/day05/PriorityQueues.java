package day05;

import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		
		// PRIORITY QUEUE
		/*
		 * the PriorityQueue is a queue and functions like a queue
		 * EXCEPT
		 * 1. you CAN actually instantiate it
		 * 2. it sorts objects for polling
		 * 		-- does not sort them for printing the queue
		 * 		-- does sort the order in which you poll the items
		 */

		// instantiate it like other collections, must give it an object type
		PriorityQueue<Integer> myIntPQ = new PriorityQueue<Integer>();
		
		System.out.println(myIntPQ);
		
		myIntPQ.add(4);
		myIntPQ.add(1);
		myIntPQ.add(9);
		myIntPQ.add(3);
		myIntPQ.add(11);
		
		System.out.println("Printing the PQ:");
		System.out.println(myIntPQ);
		
		System.out.println();
		
		System.out.println("Polling the PQ, now in order:");
		System.out.println(myIntPQ.poll());
		System.out.println(myIntPQ.poll());
		System.out.println(myIntPQ.poll());
		System.out.println(myIntPQ.poll());
		System.out.println(myIntPQ.poll());
		
		System.out.println();
		
		// to use our own method of sorting, we can create a class that implements Comparator
		// and override the compare() method
		StringComparer sc = new StringComparer();
		
		// as a parameter, we give our new PriorityQueue an instance of the class that implements Comparator
		// in this instance, our class ignores case when sorting Strings
		PriorityQueue<String> myStringPQ = new PriorityQueue<String>(sc);
		
		myStringPQ.add("Zulmak");
		myStringPQ.add("Annie");
		myStringPQ.add("Proust");
		myStringPQ.add("Big Papa");
		myStringPQ.add("Marge");
		myStringPQ.add("annie");
		myStringPQ.add("zzzulmak");
		myStringPQ.add("Margie");
		myStringPQ.add("big al");
		myStringPQ.add("asdf;laisdufalisd");
		myStringPQ.add("Java 4 Life");
		myStringPQ.add("123456");
		
		System.out.println("Printing the String PQ:");
		System.out.println(myStringPQ);
		
		System.out.println();
		
		System.out.println("Polling the String PQ, now in order:");
		
		System.out.println(myStringPQ.poll());
		System.out.println(myStringPQ.poll());
		System.out.println(myStringPQ.poll());
		System.out.println(myStringPQ.poll());
		System.out.println(myStringPQ.poll());
		System.out.println(myStringPQ.poll());
		System.out.println(myStringPQ.poll());
		System.out.println(myStringPQ.poll());
		System.out.println(myStringPQ.poll());
		System.out.println(myStringPQ.poll());
		System.out.println(myStringPQ.poll());
		System.out.println(myStringPQ.poll());
		
		System.out.println();
		
		// comparing objects and using their properties to sort
		// the PersonComparator class looks inside the Person objects and uses the age to sort
		PriorityQueue<Person> presentationOrder = new PriorityQueue<Person>(new PersonComparator());
		
		presentationOrder.add(new Person(true, "Lamar", 25));
		presentationOrder.add(new Person(true, "Kelvin", 99));
		presentationOrder.add(new Person(true, "Brian", 22));
		presentationOrder.add(new Person(true, "Donavon", 45));
		presentationOrder.add(new Person(true, "Edwin", 5));
		
		System.out.println(presentationOrder);
		
		System.out.println(presentationOrder.poll());
		System.out.println(presentationOrder.poll());
		System.out.println(presentationOrder.poll());
		System.out.println(presentationOrder.poll());
		System.out.println(presentationOrder.poll());
		
		
	}

}
