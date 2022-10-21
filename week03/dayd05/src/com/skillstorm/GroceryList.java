package com.skillstorm;

import java.util.ArrayList;

public class GroceryList {
	
	private ArrayList<String> groceriesList;
	
	public GroceryList() {
		this.groceriesList = new ArrayList<>();
	}
	
	/*
	 * Will this get put in the javadocs?
	 */
	public GroceryList(ArrayList groceries) {
		this.groceriesList = copyValid(new ArrayList<>(groceries)); // copy the values and create a new object
		// this.groceriesList = groceries; // copies the reference
	}
	
	public ArrayList<String> getGroceriesList() {
		return new ArrayList<>(this.groceriesList);
	}
	
	public void addToList(String item) {
		if (item == null || item.isEmpty() || item.equals("chocolate"))
			return;
		this.groceriesList.add(item);
	}
	
	private ArrayList<String> copyValid(ArrayList<String> items) {
		ArrayList<String> validItems = new ArrayList<>();
		// do some stuff
		for (String item : items) {
			if (item == null)
				continue; // or throw new Exception("Not a valid grocery list");
			else
				validItems.add(item); // do nothing
			
			// more code
			// more code
		}
			
		return validItems;
	}
	
	
}
