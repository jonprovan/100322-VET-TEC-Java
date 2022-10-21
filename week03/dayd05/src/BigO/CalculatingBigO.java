package BigO;

public class CalculatingBigO {
	
	// STEP 1: count the operations
	// STEP 2: find the pattern 
	// STEP 3: find the category
	
	// Categories
	//-------------\
	// O(1)   <   O(log n)   < O(n)   <   O(n logn)   <  O(n^2)   < O(2^2)   <    O(n^n)
	
	
	// What is the time complexity?
	//  -- How does the number of OPERATIONS increase with input
	
	
	public static void main(String[] args) {
//		// Example 1:
//		System.out.println("Hello"); // O(1)
//		System.out.println(1 + 3); // 3 or 2 -- O(1)
		
		// Example 2:
		int n = 1;
		for (int i = 0; i < n ; i++) { // 0, 1, 2, 3, ... 9 = 10 times
			System.out.println("meow");  // O(n)
			System.out.println("meow"); // 2n -- O(n)
		}
		
		// input         :  1    2     3  ... n   
		// operations run:  2    4     6  ... 2n  --- O(n)
		
		// 
		int n = 10000000;
		for (int i = 0; i < n; i += 2) { // the loop executes n/2 ---O(n)
			System.out.println(i); // one instruction is run in the loop
		}
		
		int n = 1000;
		for (int i = 1; i < n; i *= 2) { // the loop executes i = 1, 2, 4, 16, ... i = 1024 --> the loop runs 2 * 2 * 2 * 2 ... = 1024  ---> 2^? = 1024 -->logx(n)
			System.out.println(i); // one instruction is run in the loop
		}
		
		
		// workout example
		for (int rounds = 0; rounds < x; rounds++) {
			// each exercise we did a different number of times
			for (int pushupRep = 0; pushupRep < y; pushUpRep++) {
				System.out.println("pushup");
			}
			for (int situpRep = 0; situpRep < z; sitUpRep++ ) {
				System.out.println("situp");
			}
		}
		
		n = 10;
		int m = 100;
		for (int i = 0; i < n; i++) { // runs how many times? depending on n
			for (int j = 0; j < m; j++) { // runs how many times? depends on m    -- O(n * m) --- rule number 3, 
				System.out.println("hi"); // one instruction
			}
		}
		
	}
	
	// What is the changing value? 
	// while loops that wait for a condition -- are not quantifiable 
	//                                       -- we can control how efficiently we do things with their input
	//                                        -- we can't control how many things they input
}
