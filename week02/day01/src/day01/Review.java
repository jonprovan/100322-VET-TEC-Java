package day01;

public class Review {

	public static void main(String[] args) {
		
		int one = 1;
		int two = 2;
		
		String[] names = { "Joe", "Mary", "Zulmak" };
		int[] numbers = { 3, 7, 10, 2, 50 };
		// indices of elements = { 0, 1, 2 }
		// but .length == 3, because there are three elements
		
		// LOOPS review
		
		/*
		 * while
		 * for
		 * for each (enhanced for)
		 * do/while
		 */

		// while (condition) {
		//	code
		//}
		
		// checks the condition BEFORE running the first time
		while (one == two) {
			System.out.println("Foreeeeeever...");
		}
		
		/*
		 * do {
		 * 	some code
		 * } while (condition) 
		 */
		
		do {
			System.out.println("Code to do...");
		} while (one == two);
		
		System.out.println();
		
		/*
		 * for (data type variable name : collection name) {
		 * 	some code
		 * }
		 * 
		 */
		
		System.out.println("For each:");
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println();
		
		/*
		 * for (variable value; condition; what to do after each loop) {
		 * 	some code
		 * }
		 */
		
		System.out.println("For:");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		
		System.out.println("For backward:");
		for (int i = names.length - 1; i >= 0; i--) {
			System.out.println(names[i]);
		}
		
		System.out.println("For (numbers):");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for (int number : numbers ) {
			System.out.println(number);
		}
		
		
		
		// Boolean structure
		
		/*
		 * if (condition) {
		 *   does this code if condition is true
		 *   }
		 *   
		 * if (condition) {
		 *   does this code if condition is true
		 *   } else {
		 *   	does this code if condition is false
		 *   }
		 *   
		 * if (condition) {
		 * 	 does this code if condition is true
		 * 	 } else if (another condition) {
		 * 		does this code if another condition is true
		 * 	} else {
		 * 		does this code if neither of the other conditions are true
		 * }
		 * 
		 * if (condition) {
		 * 
		 * 	does this code if condition is true
		 * 
		 * 		if (other condition) {
		 * 			does this code if both conditions are true
		 * 		}
		 * 
		 *	ALSO does this code if condition is true
		 *
		 *}
		 * 
		 */
		
		
	}

}
















