package com.skillstorm.practice.models;

public class Dinosaur implements Comparable<Dinosaur> {
	
	// properties
	private String name;
	
	private Dinosaur.Type type;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dinosaur.Type getType() {
		return type;
	}

	public void setType(Dinosaur.Type type) {
		this.type = type;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	int position; // position
	
	// enum
	enum Type {
		THEROPOD, SAUROPOD, STEGOSAUR, ANKYLOSAUR, ORNITHOPOD, CERATOPSIAS, PACHYCEPHALOSAUR
	}

	
	// This method returns negative if this < other, 0 if this == other, positive if this > other
	@Override
	public int compareTo(Dinosaur other) {
		return this.position - other.position;
	}
	

}
