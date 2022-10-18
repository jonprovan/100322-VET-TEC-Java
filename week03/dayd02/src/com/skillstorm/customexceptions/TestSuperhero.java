package com.skillstorm.customexceptions;

public class TestSuperhero {
	
	public static void main(String[] args) throws Exception {
		SuperHero superman = new SuperHero();
		superman.setIndestructable(true);
		superman.fly("Beautiful fall day");
//		superman.fly("Rainy");
		
		superman.fightCrime();
		
		superman.setIndestructable(false); 
		superman.fightCrime();
	}

}
