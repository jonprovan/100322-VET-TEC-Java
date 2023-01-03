package com.skillstorm.practice;

import com.skillstorm.practice.models.Dinosaur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Simulates a race between dinosaurs. The dinosaur that has the furthest position when the raceDuration ends will be the winner.
 * @author ehicks
 *
 */
public class DinoRace {
	
	// properties
	
	public static final int MIN_NUM_RACERS = 2; 
	public static final int MAX_NUM_RACERS = 20;
	
	
	private ArrayList<Dinosaur> dinos;
	
	private int raceDuration; // duration of race in seconds
	
	
	// constructors
	
	public DinoRace(int duration, ArrayList<Dinosaur> dinos) {
		this.raceDuration = duration;
		setDinos(dinos);
	}


	////////////////////////////////////////////////////////////////////////
	// getters and setters
	public ArrayList<Dinosaur> getDinos() {
		return dinos;
	}


	public void setDinos(ArrayList<Dinosaur> dinos) {
		if (dinos == null) {
			throw new IllegalArgumentException("List of dinosaurs cannot be null.");
		}
		if (dinos.size() < MIN_NUM_RACERS) {
			throw new IllegalArgumentException("List of dinosaurs cannot be null.");
		}
		if (dinos.size() > MAX_NUM_RACERS) {
			throw new IllegalArgumentException("List of dinosaurs cannot be null.");
		}
		this.dinos = dinos;
	}


	public int getRaceDuration() {
		return raceDuration;
	}


	public void setRaceDuration(int raceDuration) {
		if (raceDuration <= 0) {
			throw new IllegalArgumentException("Race duration cannot be zero or negative.");
		}
		this.raceDuration = raceDuration;
	}

	// Methods
	
	public void start() {
		// 1 ___ is in the lead
		// 2 ___ is in the lead
		// 3 ___ is in the lead
		// Race finished!
		int currentTime = 0;
		while (currentTime < raceDuration) {
			moveRacers();
			displayRaceStatus(currentTime);
			currentTime++;
		}
		displayWinner();
	}
	
	private void displayWinner() {
		Collections.sort(dinos);
		System.out.println("The winner is " + dinos.get(0).getName());
	}
	
	private void displayRaceStatus(int currentTime) {
		Collections.sort(dinos);
		System.out.printf("%d %s is in the lead", currentTime, dinos.get(0).getName());
	}
	
	private void moveRacers() {
		for (Dinosaur dino : dinos) {
			dino.setPosition(0);
		}
	}
	
	// Overriden methods

	@Override
	public String toString() {
		return "DinoRace [dinos=" + dinos + ", raceDuration=" + raceDuration + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(dinos, raceDuration);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DinoRace other = (DinoRace) obj;
		return Objects.equals(dinos, other.dinos) && raceDuration == other.raceDuration;
	}
	

	
}
