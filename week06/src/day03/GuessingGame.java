package day03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		// Prompt user for their name
		System.out.println("Let's play a game. What is your name? ");
		Scanner input = new Scanner(System.in);
		String playerName = input.nextLine();
		
		// Prompt user to guess a number
		System.out.println(playerName +", guess a number between 1 and 10: ");
		int randomNumber = new Random().nextInt(10) + 1; // number between 1 and 10
		int guess = input.nextInt();
		
		// Check if they won, and print results
		boolean won = guess == randomNumber;
		if (won) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose! The number was " + randomNumber);
		}
		
		// Record the results in a file
		recordResults(playerName, won);
		input.close();
	}
	
	
	
	
	
	
	
	
	
	
	// write the results to a file
	public static void recordResults(String name, boolean won) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt", true))) {
			writer.write(name + " " + (won ? "won" : "lost") + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
