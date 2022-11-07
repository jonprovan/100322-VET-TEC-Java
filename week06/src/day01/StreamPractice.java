package day01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
	
	/*
	 * What is a stream?
	 * DEFINITION: a sequence of elements that supports aggregate operations and processing them as a whole
	 * USAGE: processing a sequence of data
	 * 
	 */
	
	/*
	 * What is the difference between a stream and a list or other collections?
	 * - stream you can only access once
	 * - list you can access until you destroy it
	 * 
	 * - stream is for operating the whole sequence
	 * - list is for operating on individual elements
	 */
	
	
	
	/*
	 * Why use streams?
	 * - less for loops!
	 * - "streamlines" our code
	 */
	
	
	
	
	
	
	
	/*
	 * Utility methods streams provide:
	 * **** NOTE: all of them will not mutate your original data set ****
	 * 1. forEach - took each element, does something with it, does not return anything
	 * 2. map - take each element, does something to it, returns the new elements in a stream
	 * 3. filter - return a new stream -- only contains elements that pass the "filter"
	 * 4. reduce - returns a single value eg: sum, max, min etc.
	 * 
	 */
	
	public static void main(String[] args) {
		
		/*
		 * Ways to create a stream:
		 * 1. from a list
		 * 2. from an array
		 * 3. from primitives! (int, long, double)
		 */
		
		// Method 1: lists
		List<String> favoriteFoods = Arrays.asList("pineapple", "steak", "pizza");
		Stream<String> foodsStream = favoriteFoods.stream();
		foodsStream.forEach((food) -> System.out.println(food.toUpperCase() + " is the best!"));
//		foodsStream.forEach((f)->System.out.println(f)); // cannot reuse stream
		System.out.println(favoriteFoods);
		

		// map
		Stream<String> foodsStream2 = favoriteFoods.stream();
		Stream<String> newStream = foodsStream2.map(f -> f.substring(2));
		System.out.println(newStream);
		//newStream.forEach(System.out::println); // (word) -> System.out.println(word);
		
		// convert our stream back to a list
		// use the Collectors utility class
		List<String> newList = newStream.collect(Collectors.toList()); // collect the stream into a list using a collector
		System.out.println(newList);
	}
	
}