package day03;

public class Car {
	
	private String name;
	private int year;
	
	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return year + " " + name;
	}
	
	public String getCommaSeparatedValues() {
		return name + "," + year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	
}
