package day01;

public class Toy {
	
	String type;
	boolean isBroken;
	double weight;
	
	public Toy(String type, boolean isBroken, double weight) {
		this.type = type;
		this.isBroken = isBroken;
		this.weight = weight;
	}
	
	@Override
	public int hashCode() {
		final int prime = 7;
		int result = 1;
		result = prime * result  + ((type == null)? 0 : type.hashCode()); // TODO do better
		result = prime * result + (isBroken ? 1 : 31);
		result = prime * result + ((int) (weight * 100));
		return result;
	}
	
	// TERNARY OPERATOR REVIEW
	public static void main(String[] args) {
		// condition ? value-to-return-if-true : value-to-return-if-false;
		int daysInFebruary = isLeapYear(2024) ? 29 : 28;
		System.out.println(daysInFebruary);
	}
	
	private static boolean isLeapYear(int year) {
		return year % 4 == 0; // 2024 is a leap year, 2022 is not
	}

}
