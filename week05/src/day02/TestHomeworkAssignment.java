package day02;

import java.util.HashMap;
import java.util.Random;
//import java.util.*; // imports EVERYTHING

public class TestHomeworkAssignment {
	
	public static void main(String[] args) {
		HomeworkAssignment hardAssignment = new HomeworkAssignment();
		System.out.println(hardAssignment.getGrades());
		String[] names = {

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
		// fill the hash map with names and grades 
		// use random grades
		// NOT NECESSARY -- USE EMPTY ONE WE JUST GOT
		// HashMap<String, Integer> studentGrades = new HashMap<>();
		Random generator = new Random(System.currentTimeMillis());
		for (String name : names) {
			hardAssignment.getGrades().put(name, generator.nextInt(100));
		}
		// print it out
		System.out.println(hardAssignment.getGrades());
		// findMax
		System.out.println("The high score was: " + hardAssignment.findHighest());
		System.out.println("Top scorer(s): " + hardAssignment.findTopStudent());
		System.out.println("Avg score: " + hardAssignment.findAverage());
	}

}
