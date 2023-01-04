package com.skillstorm;

public class Problem13 {

	// To run this from the command line, you must do javac Problem13.java 
	// and then java Test closed
	// or java Test open someone
	// or java Test open
	// etc.
	
	// To run this in spring tool suite, click the drop down next to the green arrow in the top bar menu
	// select run configuration
	// switch from the main tab to the argument tab
	// type whatever arguments separated by spaces in the text box
	// click run
	public static void main(String[] args) {
		if (args[0].equals("open")) {
			if (args[1].equals("someone")) {
				System.out.println("Hello!");
			} else {
				System.out.println("Go away " + args[1]);
			}
		}
	}

}
