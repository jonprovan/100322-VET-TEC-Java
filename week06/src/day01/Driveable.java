package day01;

/*
 * Example: User-defined Functional Interface
 * 
 */
@FunctionalInterface // tells the compiler
public interface Driveable {
	void drive(String name);
}

class Motorcycle implements Driveable {

	@Override
	public void drive(String name) {
		System.out.println(name + " vroom vroom");
		
	}
}
