package day05;

public class Person extends Organism {
	
	// properties
	private String name;
	private int age;
	
	// constructors
	public Person() {
		super();
	}
	
	public Person(boolean alive, String name, int age) {
		super(alive);
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}
