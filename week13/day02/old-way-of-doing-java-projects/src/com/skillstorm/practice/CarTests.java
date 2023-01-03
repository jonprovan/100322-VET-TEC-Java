package com.skillstorm.practice;

public class CarTests {
	
	public static void main(String[] args) {
		Car car = new Car();
		RaceCar car2 = new RaceCar();
		
		// Am I allowed to do this?
		// Yes, bc a RaceCar IS-A car
		// Compiler would not let you call RaceCar methods
		// unless ((RaceCar) car3).method()
		Car car3 = new RaceCar();
		
		// Am I allowed to do this?
		// No, a Car is not a race car
		// RaceCar car4 = new Car();
		
		car.setExhaustLoudness(130);
		car2.setExhaustLoudness(150);
		car3.setExhaustLoudness(140);
		
		car2.addStickers(4);
		// car3.addStickers(0);
		
		
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3); // Why does this print out numOfStickers?
		                          // polymorphism -- runtime decides to call RaceCar's toString method
		// System.out.println(((Car) car3).toString()); cannot get around runtime polymorphism
		//                                              would have to create a new Car from the RaceCar
		//                                              casting is just a promise to the compiler this will work
		
		
		
	}
	

}
