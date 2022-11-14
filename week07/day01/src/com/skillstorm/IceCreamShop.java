package com.skillstorm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class IceCreamShop {

	// PROPERTIES
	// queue for Customers
	private Queue<Customer> customerQueue = new LinkedList<Customer>();

	// total earnings
	private double totalEarnings = 0;

	// ice cream cost
	private final double ICE_CREAM_COST = 4.5;

	// HashSet of available flavors (prevent duplicates)
	private HashSet<String> availableFlavors = new HashSet<String>();
	
	// constructor doesn't need to initialize anything
	public IceCreamShop() {
		super();
	}


	// METHODS
	// method called addCustomer
	// adds a Customer to the queue
	public void addCustomer(Customer customer) {
		if (customer != null)
			customerQueue.offer(customer);
	}


	// method called serviceCustomer
	// takes first Customer, adds cost to total earnings, removes from queue
	// prevent Customer from purchasing unavailable flavor by throwing Exception
	// prevent from purchasing when Customer has no flavor (Exception)
	// Exception when trying to service when queue is empty
	public void serviceCustomer() throws Exception {
		if (!customerQueue.isEmpty() 
		  && customerQueue.peek().getFlavor() != ""
		  && availableFlavors.contains(customerQueue.peek().getFlavor())) {
			customerQueue.poll();
			totalEarnings += ICE_CREAM_COST;
		} else {
			throw new Exception("Service Not Possible");
		}
	}
	

	// method called addFlavor
	// add a flavor to the list of available flavors
	public void addFlavor(String flavor) {
		if (flavor != null && !flavor.isEmpty())
		availableFlavors.add(flavor);
	}

	// method called removeFlavor
	// removes a flavor from the list of available flavors
	public void removeFlavor(String flavor) {
		availableFlavors.remove(flavor);
	}
	

	public static void main(String[] args) throws Exception {

		IceCreamShop myShop = new IceCreamShop();
		
		myShop.addCustomer(new Customer("Vanilla"));
		myShop.addCustomer(null);
		System.out.println(myShop.customerQueue);
		
		myShop.addFlavor("Vanilla");
		myShop.addFlavor("");
		myShop.addFlavor(null);
		myShop.removeFlavor("Vanilla");
		myShop.removeFlavor(null);
		System.out.println(myShop.availableFlavors);
		
		myShop.addFlavor("Vanilla");
		myShop.addFlavor("Chocolate");
		myShop.addFlavor("Strawberry");
		System.out.println(myShop.availableFlavors);
		
		myShop.addCustomer(new Customer("Strawberry"));
		myShop.addCustomer(new Customer("Chocolate"));
		myShop.addCustomer(new Customer("Chocolate"));
		System.out.println(myShop.customerQueue);
		
		System.out.println(myShop.totalEarnings);
		myShop.serviceCustomer();
		myShop.serviceCustomer();
		myShop.serviceCustomer();
		System.out.println(myShop.totalEarnings);
		System.out.println(myShop.customerQueue);
		

	}

}
