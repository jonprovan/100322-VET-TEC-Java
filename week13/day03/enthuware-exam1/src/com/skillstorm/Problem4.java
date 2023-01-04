package com.skillstorm;

public class Problem4 {
	
	public static void main(String[] args) {
		Object[] objs = {"apples", "bananas", "oranges"};
		Object obj = "bananas";
		new Problem4().search(objs, obj);
		new Problem4().search2(objs, obj);
	}
	
	void search(Object[] objects, Object find)
	{
	   // for(Object obj : objects)   // This is an iteration statement. 
	   for (int i = 0; i < objects.length; i++)
	   {
	      if(objects[i].equals(find))  //This is a conditional statement.
	      {
	    	// System.out.println("Found " + find); 
	        System.out.println("Found at "+i); // Cannot use i if using enhanced for-loop
	       }
	   }
	}
	
	boolean search2(Object[] objects, Object find) {
		for (Object obj : objects) {
			if (obj.equals(find)) {
				System.out.println("Found " + find);
				return true;
			}
		}
		System.out.println("Found " + find);
		return false;
	}
}
