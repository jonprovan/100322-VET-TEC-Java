package com.skillstorm;

// to use the Collections.sort() method, our class must implement Comparable
// to designate which type of objects we'll be comparing to, put it in the <>
public class Person implements Comparable<Person> {
	
	// properties
	private String name;
	private int age;
	
	// constructors
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
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
	public int compareTo(Person person) {
		
		// using ages, which are ints
		
		// this is the logic behind the cleaner version
		
//		if (this.age > person.age) {
//			return 1;
//		} else if (this.age == person.age) {
//			return 0;
//		} else if (this.age < person.age) {
//			return -1;
//		} else {
//			return 0;
//		}
		
		// a cleaner way of doing it, since this method works with any positive/negative return
		return this.age - person.age;
		
		// using Strings
		
		// return this.name.compareToIgnoreCase(person.name);
		
	}

	@Override
	public String toString() {
		return "\nPerson [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	

}
