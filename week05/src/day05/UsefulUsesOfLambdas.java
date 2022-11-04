package day05;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

public class UsefulUsesOfLambdas {
	
	// 
	// built in for-each and how to use it
	
	public static void main(String[] args) {
		/*
		 * GOAL: Apply a method to EVERY element in a list (which we will convert to a stream)
		 * 
		 * 
		 * 
		 */
		

		LinkedList<State> states3 = new LinkedList<>(Arrays.asList(new State("Georgia", 10_800_000, 59_425), 
																	new State("Alabama", 5_040_000, 52_419), 
																	new State("Florida", 21_780_000, 65_758), 
																	new State("Colorado", 5_812_000, 104_185)));
		// STEP 1: convert to stream
		Stream<State> stateStream = states3.stream();
		// STEP 2: Use java built-in .forEach(method) using our lambda
		// get the first two letters
		// capitalize them
		// print them out
		stateStream.forEach((state) -> {
			String name = state.getName();
			String abbreviation = name.substring(0,2); 
//			char initialLetter = name.charAt(0); // ONLY grabs one letter at a time -- use substring for multiple
//			char secondLetter = name.charAt(1);
			abbreviation = abbreviation.toUpperCase();
			System.out.println(abbreviation);
		});
		
		
		
		// Example 2
		// for each will NOT mutate our list so SAVE the result

		Stream<State> stateStream2 = states3.stream();
		Stream<State> stateStreamAltered = stateStream2.map((state) -> {
			String alteredName = state.getName().substring(0,2).toUpperCase();
			int population = state.getPopultation();
			int alteredSize = state.getSize();
			State alteredState = new State(alteredName, population, alteredSize);
			return alteredState;
		});
		System.out.println(stateStreamAltered);
	}

}
