package day01;

import java.util.HashSet;

public class TrickOrTreat {
	
	public static void main(String[] args) {
		String[] candy = {"snickers", "milkyway", "snickers"};
		int number = countCandyTypes(candy);
		System.out.println("I have " + number + " different types of candy!");
	}
	
	public static int countCandyTypes(String[] candy) {
		// step 1 
		HashSet<String> candySet = new HashSet<>();
//		int counter = 0;
		for (String aCandy : candy) {
			if (candySet.add(aCandy));
//			    counter++;
		}
//		return counter;
		return candySet.size();
	}

}
