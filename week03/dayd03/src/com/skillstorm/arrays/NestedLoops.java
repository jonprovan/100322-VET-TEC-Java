package com.skillstorm.arrays;

public class NestedLoops {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i = " + i + ", j = " + j);
				System.out.println("hello");
			}
			System.out.println("-----------------");
		}
		
		for (int round = 0; round < 4; round++) {
			System.out.println("Round number " + (round + 1));
			// pushups
			for (int rep = 0; rep < 10; rep++) {
				System.out.println("Doing pushup number " + (rep + 1));
			}
			// high jumper
			for (int rep = 0; rep < 10; rep++) {
				System.out.println("Doing high jumper number " + (rep + 1));
			}
			// burpees
			for (int rep = 0; rep < 8; rep++) {
				System.out.println("Doing burpee number " + (rep + 1));
			}
			System.out.println("-----------------------------");
		}
	}

}
