package day03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
		BufferedWriter writer = null; // delare it here and store null
		try {
			//writer = new BufferedWriter(new FileWriter("output.txt", true)); // initialize it inside your try
			writer = new BufferedWriter(new FileWriter("./src/day03/output.txt")); // default mode is WRITE -- writes over all the contents
			                                                           // to put in APPEND mode -- use a second parameter and set it to true
			
			writer.write("Hello world!"); // WHERE? the current folder our program is running in
			                              // ./ means the current directory
			                              // ../ means the parent directory
			                              // ./src/day03/output.txt will put it under the diretory day03 under src
			
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
}
