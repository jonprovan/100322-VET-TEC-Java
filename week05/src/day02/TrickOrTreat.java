package day02;

import java.util.Arrays;
import java.util.HashMap;

public class TrickOrTreat {
	
	
	public static void main(String[] args) {
		
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
		System.out.println(Arrays.asList(alotaCandy));

		// HOW MANY OF EACH CANDY DO I HAVE?
		// KEY = what candy
		// VALUE = how many
		HashMap<String, Integer> candyCount = new HashMap<>(40);
		// add 1 piece of candy
		candyCount.put("twix", 1);
		System.out.println(candyCount);
		// add a 2nd twix
		Integer currentCount = candyCount.get("twix"); // TODO ADD IF-EXISTS CHECK
		if (currentCount != null) 
			candyCount.put("twix", currentCount  + 1);
		else
			candyCount.put("twix", 1);
		System.out.println(candyCount);
		// add a different candy
		Integer currentReesesCount = candyCount.get("reeses"); // TODO ADD IF-EXISTS CHECK
		if (currentReesesCount != null) 
			candyCount.put("reeses", currentReesesCount  + 1);
		else
			candyCount.put("reeses", 1);
		System.out.println(candyCount);
		System.out.println(findCandyCount(alotaCandy));
		
	} // end of main
	
	// MUST BE STATIC
	// non-static methods belong to INSTANCES of the class 
	// TO CALL THIS FROM MAIN -- this method must be static 
	public static HashMap<String, Integer> findCandyCount(String[] candies) {
		HashMap<String, Integer> result = new HashMap<>();
		for (String candy : candies) {
			Integer currentCandyCount = result.get(candy);
			if (currentCandyCount == null) {
				// add candy to map
				result.put(candy, 1);
			} else {
				result.put(candy, currentCandyCount + 1);
			}
		}
		return result;
	}

} // end of class
