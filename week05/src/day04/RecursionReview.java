package day04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecursionReview {
	
	// EXAMPLE 1
	
	/*
	 * What does this code do?
	 */
	public static int countTeamFans(LinkedList<SportsFan> fans, String team) { // Rt click -> Refactor -> Rename
		if (fans == null || fans.isEmpty())
			return 0;
		else {
			SportsFan fan = fans.remove();
			if (fan.getTeam().equals(team))
				return 1 + countTeamFans(fans, team);
			else
				return countTeamFans(fans, team);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// EXAMPLE 2 - find the longest String recursively (LinkedList vs ArrayList)
	
	public static int findLongestLength(LinkedList<String> words) {
		// BASE CASE
		if (words.isEmpty()) {
			return 0;
		}
		// RECURSIVE CALL
		else {
			// compare current to winner 
			int current= words.remove().length(); // look at the item, take it off the list
			int winner = findLongestLength(words);
			return Math.max(current, winner);
		}
	}
	
	// Returns the longest word
	// If there are equals, returns the first found
	public static String findLongest(LinkedList<String> words) {
		// BASE
		if (words.isEmpty())
			return "";
		// RECURSIVE CALL
		else {
			// get current String
			String current = words.remove();
			// get longest String winner so far
			String winner = findLongest(words);
			// compare the two
			if (current.length() >= winner.length()) {
				return current;
			} else {
				return winner;
			}
			
		}
	}
	
	// find the longest String recursively
	// METHOD 1 - use index
	public static String findLongest(ArrayList<String> words) { // why can I reuse this name? METHOD OVERLOADING! -- diff parameters
		// METHOD 1 -- set up start index
		return helpFindLongest(words, 0);
	}
	
	private static String helpFindLongest(ArrayList<String> words, int index) {
		// BASE CASE
		if (index > words.size() - 1) {
			return "";
		// RECURSIVE CALL
		} else {
			// COMPARE CURRENT
			String current = words.get(index);
			// WINNER
			String winner = helpFindLongest(words, index + 1);
			//               -----------
			//                 MAGIC!
			if (current.length() >= winner.length()) {
				return current;
			} else {
				return winner;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// EXAMPLE 3 - find IF the list contains a given String 
	public static boolean contains(List<String> words, String searchTerm) {
		return helpSearch(words, searchTerm, 0);
	}
	
	private static boolean helpSearch(List<String> words, String searchTerm, int index) {
		// BASE CASE
		if (index > words.size() - 1)
			// failure
			return false;
		else if (searchTerm.equals(words.get(index)))
			// success
			return true;
		// RECURSIVE CALL
		else {
			// if it's not me, KEEP CHECKING ...
			return helpSearch(words, searchTerm, index + 1);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	public static void main(String[] args) {
		SportsFan fanA = new SportsFan("Astros");
		SportsFan fan = new SportsFan();
		SportsFan fan1 = new SportsFan();
		SportsFan fanA0 = new SportsFan("Astros");
		SportsFan fan2 = new SportsFan();
		SportsFan fanA1 = new SportsFan("Astros");
		SportsFan fanA2 = new SportsFan("Astros");
		SportsFan fanA3 = new SportsFan("Astros");
		SportsFan fan3 = new SportsFan();
		SportsFan fanA4 = new SportsFan("Astros");
		SportsFan fanA5 = new SportsFan("Astros");
		SportsFan fan4 = new SportsFan();
		SportsFan fan5 = new SportsFan();
		SportsFan fan6 = new SportsFan();
		SportsFan fan7 = new SportsFan();
		LinkedList<SportsFan> fans = new LinkedList<>();
		fans.add(fanA);
		fans.add(fan);
		fans.add(fan1);
		fans.add(fan2);
		fans.add(fanA0);
		fans.add(fan3);
		fans.add(fanA1);
		fans.add(fanA2);
		fans.add(fanA3);
		fans.add(fan4);
		fans.add(fan5);
		fans.add(fan6);
		fans.add(fanA4);
		fans.add(fanA5);
		fans.add(fan7);
		System.out.println("Phillies fans: " + countTeamFans(new LinkedList<SportsFan>(fans), "Phillies"));
		System.out.println("Astros fans: " + countTeamFans(new LinkedList<SportsFan>(fans), "Astros"));
		
		
		// EXAMPLE 2 TESTS
		LinkedList<String> names = new LinkedList<>();
		names.add("Doug Dimidome");
		names.add("Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.");
		names.add("Valientebarrientos");
		names.add("Jo Jo");
		System.out.println("Expecting " + "Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.".length());
		System.out.println("Found " + findLongestLength(new LinkedList<String>(names)));
		
		
		
		
		// all the same 
		LinkedList<String> sameNames = new LinkedList<>();
		sameNames.add("Joe");
		sameNames.add("Tom");
		sameNames.add("Ben");
		sameNames.add("Rob");
		System.out.println(findLongest(sameNames));
		
		// empty
		System.out.println(findLongest(new LinkedList<String>()));
		
		// various
		System.out.println(findLongest(new LinkedList<String>(names))); // HAND IN COPY! -- don't mutate original so we can reuse it
		
		
		
		
		// test ArrayList version
		ArrayList<String> arrayOfNames = new ArrayList<String>();
		arrayOfNames.add("Doug Dimidome");
		arrayOfNames.add("Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.");
		arrayOfNames.add("Valientebarrientos");
		arrayOfNames.add("Jo Jo");
		System.out.println(findLongest(arrayOfNames));
		
		
		
		
		
		
		// test search for String
		List<String> namesToSearch = new ArrayList<>();
		namesToSearch.add(null);
		namesToSearch.add("Dory");
		namesToSearch.add("Bruce");
		namesToSearch.add("Nemo");
		namesToSearch.add("Darla");
		System.out.println("Found nemo? " + contains(namesToSearch, "Nemo"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end main

} // end class
