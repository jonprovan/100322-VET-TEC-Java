package day03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class FileReaderPractice {
	
	/*
	 * What are we going to use to read from files?
	 * 
	 * Option 1: BufferedReader
	 * 
	 * Option 2: Scanner
	 */
	public static void main(String[] args) {
		readClassTimeFromFileUsingBR("./src/day03/myfiles/classtime.txt");
		
		readAllFromFileUsingBR("./src/day03/myfiles/groceries.txt"); // relative path using ./ to indicate start at current directory
		
		readAllFromFileUsingScanner("./src/day03/myfiles/groceries.txt");
		
		System.out.println(parseCarData("./src/day03/myfiles/cars.csv"));
	}
	
	/*
	 * Goal 1: Read start time from classtime.txt
	 */
	public static void readClassTimeFromFileUsingBR(String path) {
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) { // try-with-resources
			reader.readLine(); // I have to start at the first line of the file
			
			// I want the second line, so I store it
			String line = reader.readLine(); 
			System.out.println("Class starts at " + line);
		} catch (FileNotFoundException e) { // file does not exist
			e.printStackTrace();
		} catch (IOException e) { // if the file is corrupted etc.
			e.printStackTrace();
		}
	}
	
	/*
	 * Goal 2: Print out all the groceries in groceries.txt
	 */
	public static void readAllFromFileUsingBR(String path) {
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) { // try-with-resources closes the reader for us
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readAllFromFileUsingScanner(String path) {
		try (Scanner scanner = new Scanner(new File(path))) {
			// loop through the lines of the file
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * Goal 3: Read in data, create objects 
	 */
	// create some objects -- create a Car class
	// read from the file -- create a Scanner
	public static LinkedList<Car> parseCarData(String path) {
		// create list
		LinkedList<Car> cars = new LinkedList<>();
		// use a scanner
		try (Scanner scanner = new Scanner(new File(path))) {
			// throw away the first line (bc it's just the column names)
			if (scanner.hasNext()) 
				scanner.nextLine();
			// loop over the data
			while (scanner.hasNext()) {
				// read a line
				String row = scanner.nextLine();
				if (!row.isEmpty()) {
					// parse the line
					String[] cols = row.split(","); // [ "Mazda", "2017" ]
					if (cols.length >= 2) {
						// create a car object
						String name = cols[0];
						int year = Integer.parseInt(cols[1]);
						Car car = new Car(name, year);
						// add to list
						cars.add(car);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// return the list
		return cars;
	}
}
