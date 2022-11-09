package day03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountingFileContents {
	
	public static void main(String[] args) {
		String path = "./src/day03/myfiles/crimeandpunishment.txt";
		System.out.println("There are " + countLines(path) + " lines");
		System.out.println("There are " + countWords(path) + " words");
		System.out.println("There are " + countWordsCrimeAndPunishment(path) + " occurences of \"crime\" and \"punishment\"");
	}
	
	/*
	 * Goal #1: Count the number of lines in the file
	 */
	public static int countLines(String path) {
		int count = 0;
		// read from file
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line = reader.readLine();
			int counter = 0; // testing reading part of file first
			
			// loop through lines
			while (line != null && counter++ < 30) {
				if (!line.isEmpty()) { // not counting empty lines (you can decide to count all lines if you want)
					count++;
				}
				line = reader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	/*
	 * Goal #2 Count the number of words in the file
	 */
	public static int countWords(String path) {
		int count = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line = reader.readLine();
			while (line != null) {
				line = reader.readLine();
				if (line != null && !line.isEmpty())
					count += countWordsInLine(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	/*
	 * Helper: Count the number of words in a line
	 * (I excluded non-letter characters
	 */
	private static int countWordsInLine(String line) {
		// split on white space
		// remove punctuation so "crime" and "crime." and "crime?" will all be recognized
		String[] words = line.trim().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+"); // "\\s+" ---> "\","s" ---> all space  characters
		
		// for testing purposes only
//		for (String word : words) {
//			System.out.print("\"" + word + "\" ");
//		}
//		System.out.println();
		return words.length;
	}
	
	/*
	 * Goal #3: Count the number of times "crime" and "punishment" occurs in the file
	 */
	public static int countWordsCrimeAndPunishment(String path) {
		int count = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line = reader.readLine();
			int counter = 0;
			while (line != null && counter < 50) {
				line = reader.readLine();
				if (line != null && !line.isEmpty())
					count += countWordsCrimeAndPunishmentInLine(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	/*
	 * Helper: Count the number of occurrences of the words "crime" and "punishment" in a line
	 * (I excluded non-letter characters
	 */
	private static int countWordsCrimeAndPunishmentInLine(String line) {
		int count = 0;
		// split on white space
		// remove punctuation so "crime" and "crime." and "crime?" will all be recognized
		String[] words = line.trim().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
		for (String word : words) {
			if (word.toLowerCase().equals("crime") || word.toLowerCase().equals("punishment")){
//				System.out.print("\"" + word + "\" ");
				count++;
			}
		}
		return count;
	}

}
