package com.skillstorm.arraylists;

public class TestMyArrayList {
	
	public static void main(String[] args) {
		MyArrayList<String> animals = new MyArrayList<>();
		animals.add("cat");
		animals.add("giraffe");
		animals.add("naked mole rat");
		animals.add("lions");
		animals.add("tigers");
		animals.add("bears");
		System.out.println(animals);
		
		// index < 0
		try {
			animals.add(-1, "dog");
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		// valid index
		animals.add(2, "platypus");
		System.out.println(animals);
		// index > size
		System.out.println(animals.size());
		animals.add(15, "dragon");
		System.out.println(animals);
		System.out.println(animals.size());
		
		// Remove all elements test
		animals.remove("cat");
		System.out.println(animals);
		animals.remove(null);
		System.out.println(animals);	
		}

}
