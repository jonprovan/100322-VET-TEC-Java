package day01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MoreStreamPractice {
	
	public static void main(String[] args) {
		// Example1: Foreach
		int[] nums = {1, 2, 3, 56, 67, 2354, 5678, 89 };
		// convert to stream
		IntStream numsStream = Arrays.stream(nums);
		numsStream.filter((num) -> num % 2 == 0).forEach((num)->System.out.println(num)); // returns a stream
		
		
		// Example 2: going to a stream to a list
		List<Integer> nums2 = Arrays.asList(1, 2, 3, 56, 67, 2354, 5678, 89);
		Stream<Integer> numsStream2 = nums2.stream();
		Stream<Integer> streamNew = numsStream2.filter((num) -> num % 2 == 0);
		List<Integer> listNew = streamNew.collect(Collectors.toList());
		// we can access individual elements bc we have a list back
		System.out.println(listNew);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// FILTER with Strings
		List<String> fruits = Arrays.asList("grapes", "avocado", "tomato", "cucumber", "banana", "mangoesteen", "watermellon");
		Stream<String> goodFruitsForSalsa = fruits.stream();
		Stream<String> newStream = goodFruitsForSalsa.filter((fruit) -> {
			// get the first letter
			char firstLetter = fruit.charAt(0);
			// decide to keep it, IF the first letter is a, t, or c
			return firstLetter == 'a' || firstLetter == 't' || firstLetter == 'c';
		});
		System.out.println("These are good fruits for salsa: ");
		newStream.forEach(System.out::println);
		
		
		
		
		
		
		
		
		// REDUCE example 1:
		
		// given a list of numbers lets find the max
		List<Integer> nums3 = Arrays.asList(1, 2, 3, 56, 67, 2354, 5678, 89);
		// convert to stream
		Stream<Integer> intStream = nums3.stream();
		// use .reduce
		
		// hand in a lambda that accumulate
		Integer result = intStream.reduce(Integer.MIN_VALUE,  (soFar, num) -> {
			// compare soFar and num
			// return the larger of the two
			return Math.max(soFar, num);
		});
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
