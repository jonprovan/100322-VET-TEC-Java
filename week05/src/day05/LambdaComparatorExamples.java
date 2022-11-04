package day05;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LambdaComparatorExamples {
	
	public static void main(String[] args) {
		/*
		 * Let's use a lambda instead of an instance of a Comparator class
		 */
		// Strings Example
		LinkedList<String> states = new LinkedList<>(Arrays.asList("Florida", "Bama", "Pennsylvania", "Georgia", "New Jersey", "Maryland"));
		// Natural Ordering
		// Ex:
		Collections.sort(states);
		System.out.println(states);
		
		
		
		// Special Ordering
		// Ex: sort by length of string
		LinkedList<String> states2 = new LinkedList<>(Arrays.asList("Florida", "Bama", "Pennsylvania", "Georgia", "New Jersey", "Maryland" ));

		Collections.sort(states2, (state1, state2)-> state2.length() - state1.length());
		System.out.println(states2);
		
		
		// User-defined Class Example
		// Special Ordering #1
		LinkedList<State> states3 = new LinkedList<>(Arrays.asList(new State("Georgia", 10_800_000, 59_425), 
																	new State("Alabama", 5_040_000, 52_419), 
																	new State("Florida", 21_780_000, 65_758), 
																	new State("Colorado", 5_812_000, 104_185)));
		Collections.sort(states3, (s1, s2) -> s1.getPopulation() - s2.getPopulation());
		System.out.println(states3);
		
		
		
		// Special Ordering #2 -- order by size to the nearest 10,000 miles
		Collections.sort(states3, (s1, s2) -> s1.getSize() / 10_000 - s2.getSize() / 10_000);
		System.out.println(states3);
		
		
	}

}
