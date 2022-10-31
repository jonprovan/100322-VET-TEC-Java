package day01;

import java.util.HashSet;

public class TrickOrTreat {
	
	public static int countCandyTypes(String[] candy) {
		// step 1 create a hashset
		HashSet<String> candySet = new HashSet<>();
//		int counter = 0;
		// step 2 add all the candy to the hashset
		for (String aCandy : candy) {
			candySet.add(aCandy);
//			if (candySet.add(aCandy));
//			    counter++;
		}
//		return counter;
		// for testing purposes, print the hashset
		System.out.println(candySet);
		return candySet.size();
	}
	
	public static void main(String[] args) {
		// Test 1: Expecting 2 
		String[] candy = {"snickers", "milkyway", "snickers"};
		int number = countCandyTypes(candy);
		System.out.println("I have " + number + " different types of candy!");
		// Test 2: Expecting 19
		String[] alotaCandy = {"starburst",
				"reeses",
				"snickers",
				"milkyway",
				"twix","starburst",
				"whoppers","starburst",
				"almond joy",
				"M&M's","starburst",
				"almond joy",
				"almond joy",
				"pepermint paddy",
				"tootsie pop",
				"hershey kiss",
				"hershey kiss",
				"M&M's",
				"Peanut M&M's",
				"snickers",
				"milkyway",
				"reeses",
				"reeses pieces",
				"swedish fish",
				"sourpatch kids",
				"raisins",
				"carmel apple pop",
				"raisins",
				"snickers",
				"hershey kiss",
				"twix",
				"twix",
				"starburst",
				"tootsie pop",
				"tootsie pop",
				"reeses"};
		System.out.println("Wow! I've got " + countCandyTypes(alotaCandy) + " types of candy!");
	}
	


}
