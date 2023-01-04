package com.skillstorm.practice2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

// JUnit test classes are not marked public
// they are package private
class DinoRaceTests {

	// This is a unit test
//	@Test
//	void test() {
//		// this line causes the test to fail
//		// we have not actually checked anything before failing
//		fail("Not yet implemented");
//	}
	
	@Test
	void createDinoRaceAndSetNullRacers() {
		// create a dino race which calls the setter
		// DinoRace race = new DinoRace(3, new ArrayList<Dinosaur>()); 
		
		// check it throws the expected error
		
		// Method 1: Wrong way
//		try {
//			DinoRace race = new DinoRace(3, new ArrayList<Dinosaur>());
//			// if it does not throw an error the test should fail
//			fail("A race should not  be created with less than 2 racers");
//		} catch (IllegalArgumentException e) {
//			// test passes bc it did what we wanted
//		}
		
		// Method 2: Right way to do this
		// takes two parameters
		// the class type of the exception that should be thrown
		// a lambda function containing the code you want to test
		assertThrows(IllegalArgumentException.class, () -> {
			DinoRace race = new DinoRace(3, null);
		});

		// You can have multiple asserts in the same test
		// TODO add an assert to check the Exception thrown has the message "List of dinosaurs cannot be null."
		
	}
	
	@Test
	void createDinoRaceWithTwoRacers() {
		ArrayList<Dinosaur> dinos = new ArrayList<Dinosaur>();
		dinos.add(new Dinosaur());
		dinos.add(new Dinosaur());
		
		assertDoesNotThrow(() -> { 
			DinoRace race = new DinoRace(3, dinos);
		});
	}
	
	@Test
	void createDinoRaceAndSetEmptyRacers() {
		assertThrows(IllegalArgumentException.class, () -> {
			DinoRace race = new DinoRace(3, new ArrayList<Dinosaur>());
		});
		// You can have multiple asserts in the same test
		// TODO add an assert to check the Exception thrown has the message "List of dinosaurs cannot be null."
	}
	
	@Test
	void createDinoRaceAndSetTooManyRacers() {
		ArrayList<Dinosaur> dinos = new ArrayList<Dinosaur>();
		for (int i = 0; i < 21; i++) {
			dinos.add(new Dinosaur());
		}
		
		assertThrows(IllegalArgumentException.class, () -> {
			DinoRace race = new DinoRace(3, dinos);
		});
		
	}

}
