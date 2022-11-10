package rentalcarproject;

import static rentalcarproject.CustomerType.*;

import java.time.LocalDate;

public class Customer {
	
	private String name;
	private LocalDate dob; //-- date of birth
	private CustomerType type; //-- are they picking up a car or returning a car?
	private CarType request; //-- type of car they are requesting
	private Car rentalCar; //-- car they rent
	
	// TODO add some validation in the setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public CustomerType getType() {
		return type;
	}
	
	public void setType(CustomerType type) {
		this.type = type;
	}
	
	public CarType getRequest() {
		return request;
	}
	
	public void setRequest(CarType request) {
		this.request = request;
	}
	
	public Car getRentalCar() {
		return rentalCar;
	}
	
	public void setRentalCar(Car rentalCar) {
		this.rentalCar = rentalCar;
	}

	// TODO constructors
	
	// TODO toString
}
