package com.skillstorm;

public class OrderOfOperations {
	static int myNumber = 10;

	public static void main(String[] args) {
		// Order of operations
		
		// What will this equal?
		int x = 3 + 4 * 5;
		System.out.println(x); // x is 23
		
//		int y = x++; // this is the same as saying y = x; x = x + 1;
		int y = ++x; // this is the same as saying y = x + 1; x = x; or think of it as x = x + 1; y = x;
		System.out.println("y = " + y); // 24 because ++ adds 
		System.out.println("x = " + x); // 24 because ++ adds 

		// remember we are reusing x and y here
		// x = 24 to start
		// y = 24 to start 
		int z = x++ + ++y; // old value of x + new value of y
		// unary operators are first before the additon
		// x = 24 + 1 = 25
		// y = 24 + 1 = 25
		// z = 24 + 25 = 49
		System.out.println("z = " + z);
		
		// here x is not reassigned
		z = x + 1;
		System.out.println("z is now " + z + " and x is now " + x);
		
		
		System.out.println("x is " + x++);
		boolean isValid = true;
		if (isValid) 
		{
			System.out.println("It is valid");
		}
		
		boolean isOk = false;
		if (isOk)
		{
			System.out.println("This code should not run!");
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("Using a unary operator in an if condition");
		System.out.println("x starts as " + x);
		if (x++ > myNumber && true) {
			// runs if above condition is true
			System.out.println("x = " + x);
			System.out.println("myNumber = " + myNumber);
			System.out.println("x is greater than myNumber");
		} else {
			// runs this code if the above condition is false
			System.out.println("x = " + x);
			System.out.println("myNumber = " + myNumber);
			System.out.println("x is NOT greater than myNumber");
		}
		
		// Logic Operators
		// > greater than
		// < less than
		// >= greater than or equal to
		// <= less than or equal to
		// == equals to 
		// ! not
		// != is not equal to
		
		// AND uses the & symbol
		// OR uses the | symbol 
		
		// AND with && symbol uses short circuit evaluation 
		//     ___ && ____ 
		int someNumber = 9;
		if (someNumber > 10 && ++someNumber < 20 ) {
			
		}
		System.out.println("someNumber is now " + someNumber );
		
		// OR with || uses short circuit evaluation
	}
	
	public static void anotherMethod() {
		int someNumber = 2;
//		int answer = someNumber + x;
		int answer = someNumber + myNumber;
	}
}
