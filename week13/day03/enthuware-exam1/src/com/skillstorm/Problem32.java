package com.skillstorm;

public class Problem32 {

	public static void main(String args[]) {
		char i; // char is the same under the hood as a short, so the below assignment will work
		LOOP: for (i = 0; i < 5; i++) {
			switch (i++) { // postfix returns the value of i before incrementing
			case '0':
				System.out.println("A");
			case 1:
				System.out.println("B");
				break LOOP; // breaks the for loop
			case 2:
				System.out.println("C");
				break; // breaks the switch so it does not fall through to the next case
			case 3:
				System.out.println("D");
				break;
			case 4:
				System.out.println("E");
			case 'E':
				System.out.println("F");
			}
		}
	}

}
