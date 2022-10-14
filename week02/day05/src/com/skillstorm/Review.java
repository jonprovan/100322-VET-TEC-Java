package com.skillstorm;

public class Review {

	public static void main(String[] args) {
		
		CoffeeMug myMug = new CoffeeMug(400, "What if the Hokie-Pokie *is* what it's all about?", false);
		
		System.out.println(myMug);
		
		myMug.setMessage("Dad Jokes 4 Life");
		
		System.out.println(myMug);
		
		myMug.setMessage("Jokes?");
		
		System.out.println(myMug);
		
		System.out.println(myMug.getVolumeInOunces());

	}

}
