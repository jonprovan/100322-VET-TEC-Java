package com.skillstorm;

// this is the class that our "owner" class HAS one of
public class MixingApparatus {
	
	public Candy mixCandy(int cupsOfSugar) {
		
		// must cast cupsOfSugar to a double, or we get the wrong calculation sometimes
		// COULD solve this by changing the input parameters to doubles here and in CandyMachine
		double weight = (double)cupsOfSugar / 2;
		
		return new Candy(weight);
	}

}
