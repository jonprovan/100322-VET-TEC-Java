package day05;

public class ActionExample {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		// SLOW METHOD: 
		// 1) declare functional interface 
		// 2) declare class implementint it 
		// 2b) define method 
		// 3) create an instance
		doStuff(nums, new DoubleAction()); 
		doStuff(nums, (num) -> num * 2); // NO SEMICOLON at the end of lambda's body bc implied
		int[] result = doStuff(nums, (a) -> {return a * 2;});
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int n : result) {
			System.out.print(n + " ");
		}
		
		
		// Define a different action
		// squared
		Action square = num -> num * num; // I can store a lambda in a variable!
		// Equivalent to:
//		 Action square = public int act(int num) {
//		   return num * num;
//		 }
		result = doStuff(nums, square);
		System.out.println();
		for (int n : result) {
			System.out.print(n + " ");
		}
		
	}
	

	public static int[] doStuff(int[] nums, Action someCalculation) {
		int[] newArray = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			newArray[i] = someCalculation.act(nums[i]);
		}
		return newArray;
	}
	

}
