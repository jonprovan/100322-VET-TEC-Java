package day05;

public class LambdaPractice {
	/*
	 * What is functional programming?
	 * 1. Functions are "first class"
	 * - I can treat a function like an other variable type
	 *    -- I can return a function from a method
	 *    -- I can pass in a function as a parameter
	 * 
	 * 
	 * 
	 * 2. "pure" functions
	 *  - no side-effects
	 *     -- mutating a object reference passed in or changing state of your application program -- LEAVE IT EVERYTHING AS YOU FOUND IT
	 * - deterministic = for a given input, always return the same output
	 * 
	 * 
	 */

	
	
	
	
	
	// Examples of PURE functions
	// is this "pure"? no
	static int b = 3;
	public static int add(int a) { // no-side effects
		return a + b;              // not deterministic -- 
	}
	// add(1) == 4
	// in the future if b = 1
	// add(1) == 2
	
	
	// is this "pure"? yes
	public static int add(int a, int b) { // no side-effects
		return a + b;                     // IS deterministic
	}
	
	// is this pure? no
	// add(1, 1) == 2
	// class b can change but my function my function always returns 2 for add(1,1)
	public static int addAAndOne(int a) { // NOT PURE IF RELIES ON OUTSIDE STATES THAT CAN CHANGE -- this makes your life easier to debug the function
		return a + ++b;
	}
	
	// is this pure? no
	public static int addAAndOneV2(int a) { // no side-effects but
		return a + (1 + b);                 // deterministic? no
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////
	final int stuff; // ASIDE -- IS depending on this in a pure function okay???? 

	public LambdaPractice(int stuff) {
		this.stuff = stuff;
	}
	
	public int addStuff(int a) { // IS THIS A PURE METHOD? -- if we are talking about w/in an object oriented situation
		return a + this.stuff;
	}
	
	// for a given instance
	public static void main(String[] args) {
		LambdaPractice myPractice = new LambdaPractice(1);
		myPractice.addStuff(1); 
		myPractice.addStuff(1); // I'll always the get same result -- 
	}
	////////////////////////////////////////////////////////////////////////////
	
	// PRICES in grocery shop that change
	// 
	
	
	
	// GOAL --------
//	public static int[] doStuff(int[] nums, Function someCalculation) {
//		int[] newArray = new int[nums.length];
//		for (int i; i < nums.length; i++) {
//			newArray[i] = someCalculation(nums[i]);
//		}
//		return newArray;
//	}
	
	public static int[] doStuff(int[] nums, Action someCalculation) {
		int[] newArray = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			newArray[i] = someCalculation.act(nums[i]);
		}
		return newArray;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * History of Java
	 * 
	 * - It did NOT support functional programming
	 * - Java 8 added lambdas to support functional programming
	 * 
	 * 
	 */
	
	
	
	
	
	
	/*
	 * What is a lambda?
	 * - a "function" that you can hand to a function
	 * 
	 * 
	 * Also known as 
	 * - lambda function
	 * - anonymous function --- no method signature when writing lambdas so no name declared
	 * - arrow function --- syntax we use is an -> "arrow"
	 * 
	 * 
	 */
	
	
	
	
	
	
	

	
	
	
	/*
	 * Syntax Rules
	 * 
	 * General Structure:
	 * 
	 * Ex 1: Hello world
	 * () -> System.out.println("Hello World!");
	 * 
	 * () -- parenthesis are where the parameters go just like normal
	 * -> -- arrow indicates where the method body starts
	 * the rest === what code is going to get run, up to the first semicolon ;
	 * 
	 * 
	 * Ex 2: multiple parameters
	 * (name1, name2) -> System.out.println("Hello " + name1 + ", I am " + name2);
	 * 
	 * () == parameters DONT declare a type
	 * 
	 * Ex 3: one parameter
	 * name -> System.out.println("Hi there " + name + "!");
	 * 
	 * RULE -- with ONE parameter ONLY situation can exclude the () for the parameter
	 * 
	 * 
	 * Ex 4: more complicated body
	 * (name1, name2) -> { -- just like if statements, more than one line body needs { }
	 *    System.out.println(name1);
	 *    System.out.println(name2);
	 *    return name1 + " " + name2;
	 * }
	 * 
	 * 
	 * 
	 * Ex 5: returning a value --- SPECIAL CASE
	 * (a, b) -> a + b; ----- IMPORTANT the "return" is implied
	 * 
	 * Ex 5b:
	 * a -> a.toUppercase(); // return is implied, so takes in ONE value, and RETURNS that value
	 * 
	 * 
	 * 
	 * Ex 6: BE CAREFUL
	 * a -> { -- Java ignores how many lines, and doesn't realize this is one line I want returned
	 *     return a.toUppercase(); // RETURN is NOT implied -- 
	 * }
	 *
	 * 
	 */
	
	
	
	
	/*
	 * Examples: Valid or Not Lambda syntax? If not, Fix Me
	 * 
	 * 1.  () -> 1; -- good use of parenthesis, good use of arrow, good use of implied return
	 *
	 * 
	 * 
	 * 2. a, b -> a + b; -- needs parethesis bc more than one parameter
	 * FIX (a,b) -> a + b;
	 * 
	 * 
	 * 3. (a, b, c) -> {
	 *     a = a + 1;
	 *     b = b + 2;
	 *     c = c + 3;
	 *     a + b + c; -- needs to specify return bc multiline body of method
	 *  }
	 * 
	 * FIX
	 * (a, b, c) -> {
	 *     a = a + 1;
	 *     b = b + 2;
	 *     c = c + 3;
	 *     return a + b + c; -- needs to specify return bc multiline body of method
	 *  }
	 * 
	 * 4. -> "Hello"; --- bad needs () 
	 * FIX 
	 *  () -> "Hello"; // return is implied
	 * 
	 */
	
	
}
