package day01;

import java.util.Objects;

public class Person {
	
	private String name;
	private final int DOB_YEAR;
	
	public Person() {
		name = "no one";
		DOB_YEAR = 1970;
	}
	
	public Person(String name, int DOB_YEAR) {
		this.name = name;
		this.DOB_YEAR = DOB_YEAR;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDOB_YEAR() {
		return DOB_YEAR;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DOB_YEAR, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return DOB_YEAR == other.DOB_YEAR && Objects.equals(name, other.name);
	}

}
