package day03;

public class State {
	String name;
	int population;
	double size;
	public State(String name, int population, double size) {
		super();
		this.name = name;
		this.population = population;
		this.size = size;
	}
	@Override
	public String toString() {
		return "State [name=" + name + ", population=" + population + ", size=" + size + "]";
	}

}
