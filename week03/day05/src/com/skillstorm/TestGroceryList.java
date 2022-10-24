package com.skillstorm;

import java.util.ArrayList;

/**
 * A class that holds a list of groceries
 * @author ehicks
 *
 */
public class TestGroceryList {
	
	public static void main(String[] args) {
		
		// ALL OBJECTS
		// 1. in a constructor -- make a copy don't use their copy
		// 2. in a setter -- make a copy don't use their copy
		// 3. in a getter -- don't return your copy, makea copy to return
		
		// list to hand in
		ArrayList<String> need = new ArrayList<>();
		need.add("coffee");
		need.add("toothpaste");
		need.add("eggs");
		need.add(null);
		
		
		
		
		
		GroceryList groceryList = new GroceryList(need);
		System.out.println(groceryList.getGroceriesList());
		
		need.add("captain crunch cereal");
		System.out.println(groceryList.getGroceriesList());
		
		
		// DONT LET THEM
		//groceryList.addToList("");
		
		
		// someone wants to see my list
		groceryList.getGroceriesList().add(null);
		// don't want it to add to my copy
	}

}
