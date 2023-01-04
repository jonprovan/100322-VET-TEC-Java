package com.skillstorm;

public class Problem5 {
	public static void main(String[] args) {
		// INSERT CODE HERE //2
		new Node().print();
	}
}

class Node {
	static final int TYPE = 100;

	public static void print() {
		System.out.println(TYPE); // 1
	}
}
