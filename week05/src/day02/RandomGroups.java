package day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RandomGroups {

	public static void main(String[] args) {
		// TODO make array of names out of the names.txt file
//		String[] people = {};
		
		
//		String[] people = {
//				"Aaliyah",
//				"Artyom",
//				"Aung",
//				"Brandon",
//				"Brian",
//				"Christopher",
//				"Donavon",
//				"Dylan",
//				"Edwin",
//				"Eric",
//				"Ernesto",
//				"Jason",
//				"Jordan",
//				"Kelvin",
//				"Kirby",
//				"Lamar",
//				"NaDario",
//				"Preston",
//				"Raymond",
//				"Rina",
//				"Rob",
//				"Victoria"
//				};
		LinkedList<String> names = readNames("./src/day02/names.csv");
		createGroups(names);

	}// end of main
	
	// GOAL: read the names in the file
	public static LinkedList<String> readNames(String path) {
		LinkedList<String> names = new LinkedList<>();
		// using scanner bc small file
		try (Scanner scanner = new Scanner(new File(path))) {
			while (scanner.hasNextLine()) {
				String name = scanner.nextLine();
				names.add(name);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return names;
	}
	
	
	
	
	
	public static void createGroups(LinkedList<String> names) {
		int numPeoplePerGroup = 4;
		int peopleHere = 22;
		int numGroups = (int) Math.ceil((double) peopleHere / numPeoplePerGroup); // 22 / 4 = 5.5 --> 6 rooms
		// HashMap -- use whatever key type you want -- 
		HashMap<Integer, LinkedList<String>> groups = new HashMap<>(); // KEY-VALUE pairs -- KEY - INTEGER, VALUE - LINKEDLIST
		for (int i = 1; i <= numGroups; i++) {
			groups.put(i, new LinkedList<String>());
		}
		Random randomGenerator = new Random();
		int groupNumber = 0;
		while (!names.isEmpty() ) {
			groupNumber = ++groupNumber % numGroups; // 0 -> 0 , 1 -> 1, ... , 10 -> 10, 11 -> 0
			String name = names.remove(randomGenerator.nextInt(names.size()));
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
