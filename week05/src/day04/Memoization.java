package day04;

public class Memoization {
	
	/* 
	 * What is memoization? -- memorizing (aka caching) the values to avoid re-caluculating them over and over
	 */
	public static Long[] fibs = new Long[100]; // defaults to filled with null values
	
	
	// initialize the values we know from the definition
	static { // this is OK bc it runs when the class loads
		fibs[0] = 0L; // long literal needs L
		fibs[1] = 1L;
	}
	
	
	// Memoized version
	public static long fibonacciMemoized(int n) {
		// BASE CASE
		if (n < 2) {
			return n;
		}
		// RECURSION
		long fibNm1;
        long fibNm2;
		if (fibs[n - 1] == null) {//do i have n - 1 calculated)
			// make recursive call
			fibNm1 = fibonacciMemoized(n - 1);
		} else {
			 fibNm1 = fibs[n - 1];
		}
		
		
		
		if (fibs[n - 2] == null) {// do I have n - 2 calculated)
			// check if HAVE already before calling again
			 fibNm2 = fibonacciMemoized(n - 2);
		} else {
			 fibNm2 = fibs[n - 2];
		}
		
		
		
		
		return fibNm1 + fibNm2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// Recursive Fibonacci code from yesterday
	public static long fibonacci(int n) {
		// BASE CASE
		if (n < 2) 
			return n;
		// recursive call
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		long result = fibonacci(48);
		long endTime = System.nanoTime();
		double seconds = ((double) (endTime - startTime)) / 1_000_000_000;
		System.out.println("result was " + result);
		System.out.println("time take was " + (endTime - startTime) + " nano seconds!");
		System.out.println("time take was " + seconds + " seconds!");
		
		System.out.println();
		System.out.println();
		System.out.println("Using Memoization: ");

		startTime = System.nanoTime();
		result = fibonacciMemoized(48);
		endTime = System.nanoTime();
		seconds = ((double) (endTime - startTime)) / 1_000_000_000;
		System.out.println("result was " + result);
		System.out.println("time take was " + (endTime - startTime) + " nano seconds!");
		System.out.println("time take was " + seconds + " seconds!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
