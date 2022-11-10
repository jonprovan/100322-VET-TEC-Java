package rentalcarproject;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RentalCarBusiness {
	
	HashMap<CarType, LinkedList<Car>> inventory;
	Queue<Customer> customersLine;
	double moneyEarned;

	public void helpNextCustomer() {
		// check if Queue empty
		if (customersLine.isEmpty()) 
			return; // TODO print out warning
		Customer customer = customersLine.poll();
		// check if customer is too young
		if (tooYoung(customer))
			return; // TODO print out warning
		// check if customer's requested car type is available
		if (!available(customer.getRequest()))
			return; // TODO print out warning
		// do the stuff
		
		// before renting it to them, check if you need to add the young-driver-fee
		
		
	}
	
	private boolean tooYoung(Customer customer) {
		LocalDate currentDate = LocalDate.now();
		LocalDate dob = customer.getDob();
		Period age = Period.between(currentDate, dob);
		return age.getYears() >= 21;
	}
	
	private boolean available(CarType type) {
		LinkedList<Car> cars = inventory.get(type);
		return !cars.isEmpty();
	}
	
	private boolean youngDriver(Customer customer) {
		LocalDate currentDate = LocalDate.now();
		LocalDate dob = customer.getDob();
		Period age = Period.between(currentDate, dob);
		return age.getYears() >= 21 && age.getYears() < 25;
	}
	
	public void addCar(Car car) {
		
	}
	
	public void removeCar(Car car) {
		
	}
	
}
