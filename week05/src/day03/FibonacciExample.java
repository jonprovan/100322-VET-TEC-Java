package day03;

public class FibonacciExample {
	
	public static void main(String[] args) {
		int result = fibonacci(0);
		result = fibonacci(1);
		result = fibonacci(2);
		result = fibonacci(7);
//		result = fibonacci(-1);
		System.out.println(result);
	}
	
	public static int fibonacci(int n) {
		if (n < 0)
			throw new IllegalArgumentException("n must be >= 0");
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
		
	}

}
