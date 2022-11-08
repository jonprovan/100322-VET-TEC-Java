package day02;

import java.util.Scanner;
import day02.Day;

public class EnumPractice {
	
	/*
	 * What is an Enum?
	 * 
	 * = Enumeration
	 * - Constants stored in a Set
	 * 
	 * Ex: days of the week
	 * 
	 * What is the benefit?
	 * - restrict the values that can be stored in a variable
	 * - comparison is faster compared to String (== instead of comparing each character)
	 * - better than using int because encapsulates more information
	 * 
	 * 
	 * What is a con?
	 * - can't add more to the Enum's set of values as the program is running
	 * ---- for example: our IceCream assignment we had a set of flavors BUT we wanted to be able to add to it
	 */
	
	public static void main(String[] args) {
		
	
		Day today = Day.MONDAY; // instead of "Monday" or int 1 
		
		// for each - print out all the values of Day
		for (Day day : Day.values()) {
			System.out.println(day);
		}
		
		// using valueOf to convert a String to an Enum
		// Day tomorrow = Day.valueOf("wed"); // throws error if does not exist
		// Wednesday or wednesday -- what string method could I use to sanitize this?
		String userEntered = " Wednesday   ";
		Day tomorrow = Day.valueOf(userEntered.toUpperCase().trim());
		System.out.println("User entered: " + tomorrow);
		
		// anywhere I use Day, I don't need to do validation anymore like I would with String day
		
		Color userColor = promptUserForColor();
		
		Color[] colors = Color.values();
		Color color = colors[0];
		
	}
	
	public static Color promptUserForColor() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a color, out of ");
		for (Color color: Color.values()) {
			System.out.print(color + " ");
		}
		String userEntry = input.nextLine();
		// sanitize the string
		userEntry = userEntry.toUpperCase().trim(); // store the result
		return Color.valueOf(userEntry);
	}
	
	
}
