package day03;

public class RecursionPractice {
	
	/*
	 * What is recursion?
	 * - when a method calls itself
	 * 
	 * DANGER!
	 * - you can get yourself into a neverending loop 
	 * Exception in thread "main" java.lang.StackOverflowError
	 * 
	 * BASE CASE 
	 * - havea road when to stop
	 */
	
	/*
	 * WHEN TO USE RECURSION?
	 * - anything you can do recursively you can do iteratively
	 * - file system searches are a good example
	 * - tree traversal is a good example
	 * - divide and conquer to solve the problem
	 * - 
	 */
	public static void main(String[] args) {
//		doStuff();
//		factorial(3);
		System.out.println(factorial(3));
//		System.out.println(reverse("hello"));
		
		
		
		
		// We need the substring exculding the last letter
		String hello = "hello";
		System.out.println(hello.substring(0, hello.length() - 1));
		
		
		
		
		// EXAMPLE 2 - reverse a string
		
		
		recursiveReverseV2(hello, hello.length() - 1);
		
		
		
		
		// EXAMPLE 3 - sum an array
		int[] nums = { 1, 3, 8, 20, 2, 7 } ;
		
		System.out.println(sumArrayRecursive(nums, 0));
		
	}
	
	// DRY = don't repeat yourself
	// -- REFACTOR YOUR CODE -- before giving your code to someone else, clean it up!
	
	public static void doStuff() {
		int x = 1 + (7 * 10); // 1 + ___ is put on stack --> (7 * 10) is put on the stack
		System.out.println("doing stuff");
		doStuff();
	}
	
	public static int factorial(int n) {
		// System.out.println("n = " + n);
		if (n == 0)
			return 1;
		else 
			return n * factorial(n - 1);
	}
	
	public static int interativeFactorial(int n) {
		int answer = 1;
		for (int i = 1; i <= n; i++) {
			answer = answer * i;
		}
		return answer;
	}
	
	// A method to reverse a string
	public static String reverse(String word) {
		// reverse the string
		// base case
		if (word.isEmpty())
			return word; // is empty, so "" 
		else {
			// step 1: find the index of the last character
			int lastIndex = word.length() - 1;
			// step 2: get the substring excluding the last character
			String substring = word.substring(0, lastIndex);
			// step 3: concatenate lasta character to result of reversing the rest
			String result = word.charAt(word.length() - 1) + reverse(substring);
			//                                               ----------------
			//                                                 MAGIC!
		}
		return word;
	}
	
	
	
	
	
	
	// REVERSE MORE LIKE A WHILE LOOP --- RECURSIVE VERSION
	public static String recursiveReverseV2(String word, int index) {
		System.out.println("index = " + index);
		if (index < 0) {// STOPS when index = -1
			System.out.println("");
			return "";
		} else {
			String result =  word.charAt(index) +  recursiveReverseV2(word, index - 1);
			//         ------------------    -------------------
			//                                   MAGIC!
			System.out.println(result);
			return result;
		}
	}
	
	
	
	
	/// XAMPLE 3 ---- SUM AN ARRAY!!!!
	public static int sumArrayRecursive(int[] nums, int index) {
		System.out.println("index = " + index);
		/// BASE CASE!
		if (index > nums.length - 1) {
			System.out.println(0);
			return 0;
		} else {
		/// DEFINITION
			int current = nums[index];
			int restOfIt = sumArrayRecursive(nums, index + 1);
			//              -------------------------------- 
			System.out.print(current + " + " + restOfIt + " = ");
			int result = current + restOfIt;
			System.out.println(result);
			return result;
		}
	}
	
	// 

}
