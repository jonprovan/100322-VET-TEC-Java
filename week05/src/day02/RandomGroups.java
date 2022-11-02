package day02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Random;

public class RandomGroups {

	public static void main(String[] args) {
		String[] people = {

				"Brandon",

				"Jason",

				"Christopher",

				"Edwin",

				"Brian",

				"Kirby",

				"Preston",

				"Aung",

				"Lion",

				"Eric",

				"Donavon",

				"Raymond",

				"Ernesto",

				"NaDario",

				"Victoria",

				"Rob",

				"Lamar",

				"Jordan",

				"Aaliyah",

				"Dylan",

				"Rina",

				"Artyom",

				"Kelvin" };
		LinkedList<String> names = new LinkedList<>(Arrays.asList(people));
		createGroups(names);

	}// end of main
	
	public static void createGroups(LinkedList<String> names) {
		// HashMap -- use whatever key type you want -- 
		HashMap<Integer, LinkedList<String>> groups = new HashMap<>(); // KEY-VALUE pairs -- KEY - INTEGER, VALUE - LINKEDLIST
		for (int i = 1; i <= 11; i++) {
			groups.put(i, new LinkedList<String>());
		}
		System.out.println(groups);
		Random randomGenerator = new Random();
		int groupNumber = 0;
		while (!names.isEmpty() ) {
			System.out.print(groupNumber + " ");
			groupNumber = ++groupNumber % 8; // 0 -> 0 , 1 -> 1, ... , 10 -> 10, 11 -> 0
			String name = names.remove(randomGenerator.nextInt(names.size()));
			System.out.println(name);
			// Step 1: GET the LinkedList
			LinkedList<String> value = groups.get(groupNumber + 1);
			// Step 2: ADD to the LinkedList
			value.add(name);
		}
		System.out.println(groups);
	}
} // end of class
