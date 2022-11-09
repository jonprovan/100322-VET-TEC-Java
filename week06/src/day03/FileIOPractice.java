package day03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.stream.Stream;

public class FileIOPractice {
	
	/*
	 * What is IO? input/output aka reading/writing to a file or anything else
	 */
	
     /*
      * How can we read/write to/from a file?
      * 
      * writing to a file:
      * - BufferedWriter    -- good for large files (buffering = fills buffer, flushes buffer, fills buffer, flushes buffer, etc.)
      *                     -- loading/writing all at once would take too much time and too much memory
      *                     -- "wraps" other writers (adding buffering functionality)
      * (other options PrintWriter, Files, FileWriter, etc.)
      */
	
	public static void main(String[] args) {
		writeToFileOldWay();
		
		// TRY-WITH-RESOURCE -- Java handles closing the resource for me
		//                   -- use anytime creating an instance of an AutoCloseable class (AutoCloseable is an interface)
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("stuff.txt")) ) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// call methods with same file
		LinkedList<String> lines = new LinkedList<>();
		lines.add("never");
		lines.add("gonna");
		lines.add("give");
		lines.add("you");
		writeMultipleLinestToFile("./src/day03/myfiles/test.txt", lines);
		writeStringToFile("./src/day03/myfiles/test.txt", "up");
		
		saveCar("./src/day03/myfiles/cars.csv", new Car("Maserati", 2015));
		
		LinkedList<Car> cars = FileReaderPractice.parseCarData("./src/day03/myfiles/cars.csv");
		
		saveCars("./src/day03/myfiles/cars.csv", cars);
	}
	
	public static void writeMultipleLinestToFile(String path, LinkedList<String> lines) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true)) ) { // append mode for FileWriter
			// how do I get a line from my list?
			for (String line : lines) {
				// how do I write my line to my file?
				writer.write(line);
				writer.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void writeStringToFile(String path, String word) {
		// step 1: create my writer
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
			// step 2: write the word to the file
			writer.write(word);
			writer.write("\n"); // \n is a newline character
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void writeToFileOldWay() {
		BufferedWriter writer = null; // delare it here and store null
		// VERBOSE WAY
		try {
			//writer = new BufferedWriter(new FileWriter("output.txt", true)); // initialize it inside your try
			writer = new BufferedWriter(new FileWriter("C:/Users/ehicks/Desktop/output2.txt")); // default mode is WRITE -- writes over all the contents
			                                                           // to put in APPEND mode -- use a second parameter and set it to true
			
			writer.write("Hello world!"); // WHERE? the current folder our program is running in
			                              // ./ means the current directory
			                              // ../ means the parent directory
			                              // ./src/day03/output.txt will put it under the diretory day03 under src
			                              // "relative" vs "absolute" paths
			
			
			// IMPORTANT
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException | NullPointerException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	/* 
	 * Goal: Write a car to our csv file
	 */
	public static void saveCar(String path, Car car) {
		// to write to a file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) { // use APPEND mode -- second parameter true in FileWriter constructor
			// String carString = car.toString(); // useful? no, wrong format
			String carString = car.getCommaSeparatedValues();
			// store it
			writer.write("\n" + carString );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	/*
	 * Goal: Store all the Car objects in our list of cars to a .csv file
	 */
	public static void saveCars(String path, LinkedList<Car> cars) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
			// loop through the list
			Stream<Car> carStream = cars.stream();
			carStream.forEach(car -> { // FUN PRACTICE WITH LAMBDAS -- feel free to stick to LOOPS!
				// convert obj to string
				String carString = car.getCommaSeparatedValues();
				// store string
				try {
					writer.write("\n" + carString);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
