package com.skillstorm;

public class Review {

	public static void main(String[] args) {
		
		// STACK & HEAP
		
		// for the Stack, local variables and their values are stored here
		
		// the minute this for loop is complete, the i variable is removed from the Stack
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}
		
		// cannot access i here, because i was removed from the Stack after the for loop completed
		// System.out.println(i);
		
		System.out.println(add(5, 7));
		
		// cannot do either one of these, because these local variables from the add() method
		// were removed from the Stack after the add() method completed
//		System.out.println(first);
//		System.out.println(sum);
		
		// the myObject variable and its value (the memory location) live in the Stack
		// BUT the Object itself lives in the Heap
		Object myObject = new Object();
		System.out.println(myObject);
		
		// new BilliardBall object that lives in the Heap
		// its values for color, number, and solid ALSO live on the Heap
		// the local variable values for the properties that we used in the constructor were on the Stack and are now gone
		BilliardBall myBall = new BilliardBall("Black", (byte)8, true);
		
		// CAN do this if color is public because its value lives in the Heap
		// System.out.println(myBall.color);
		
		// CANNOT do this because this local constructor variable lived in the Stack and is now gone
		// System.out.println(myBall.myColor);
		
		System.out.println(myBall);
		
		BilliardBall myBall2 = myBall;
		BilliardBall myBall3 = myBall;
		
		// this does NOT remove the object from the Heap, because other references to it remain
		myBall = null;
		
		// when I do this, the BilliardBall referred to by myBall is now eligible for garbage collection
		// no references to it remain
		myBall2 = null;
		myBall3 = myBall;
				
		System.out.println(myBall);
		System.out.println(myBall2);
		System.out.println(myBall3);
		
		System.out.println();
		
		BilliardBall myNewBall = new BilliardBall("Black", (byte)8, true);
		
		System.out.println(myNewBall);
		
		myNewBall.setNumber((byte)13);
		
		
		
		System.out.println(myNewBall);
		
		
		System.out.println();
		BetterBilliardBall myBetterBall = new BetterBilliardBall((byte)13);
		
		myBetterBall.setNumber((byte)6).getPattern();
		System.out.println(myBetterBall.getColor());
		
		BetterBilliardBall myCueBall = new BetterBilliardBall((byte)-50);
		
		System.out.println(myCueBall.getColor());
		
	}
	
	public static int add(int first, int second) {
		
		int sum = first + second;
		return sum;
		
	}

}
