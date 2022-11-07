package day02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map.Entry;
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

				//"Lion",

				"Eric",

				"Donavon",

				"Raymond",

				"Ernesto",

				"NaDario",

				"Victoria",

				"Rob",

				"Lamar",

				"Jordan",

				//"Aaliyah",

				"Dylan",

				"Rina",

				"Artyom",

				"Kelvin" };
		LinkedList<String> names = new LinkedList<>(Arrays.asList(people));
		createGroups(names);

	}// end of main
	
	public static void createGroups(LinkedList<String> names) {
		int numGroups = 8;
		// HashMap -- use whatever key type you want -- 
		HashMap<Integer, LinkedList<String>> groups = new HashMap<>(); // KEY-VALUE pairs -- KEY - INTEGER, VALUE - LINKEDLIST
		for (int i = 1; i <= numGroups; i++) {
			groups.put(i, new LinkedList<String>());
		}
		System.out.println(groups);
		Random randomGenerator = new Random();
		int groupNumber = 0;
		while (!names.isEmpty() ) {
			System.out.print(groupNumber + " ");
			groupNumber = ++groupNumber % numGroups; // 0 -> 0 , 1 -> 1, ... , 10 -> 10, 11 -> 0
			String name = names.remove(randomGenerator.nextInt(names.size()));
			System.out.println(name);
			// Step 1: GET the LinkedList
			LinkedList<String> value = groups.get(groupNumber + 1);
			// Step 2: ADD to the LinkedList
			value.add(name);
		}
//		System.out.println(groups);
		jonsPrettyPrint(groups);
	}
	
	public static void jonsPrettyPrint(HashMap<Integer, LinkedList<String>> groups) {
		for (Entry<Integer, LinkedList<String>> group : groups.entrySet()) {
			System.out.println(group.getKey() + " - " + concatenate(group.getValue()));
		}
	}
	
	private static String concatenate(LinkedList<String> namesList) {
		String names = "";
		for (String name : namesList) {
			names += name + ", ";
		}
		names = trimComma(names);//
		return names;
	}
	
	private static String trimComma(String csv) {
		if (csv.length() > 0)
			csv = csv.substring(0, csv.length() - 2); // trim 2 characters the ", "
		return csv;
	}
} // end of class
