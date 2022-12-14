package com.skillstorm.practice;

import java.util.List;

public class Driver {
	
	public static void main(String[] stuff) {
		InventoryDAO dao = new InventoryDAO();
		List<Item> results = dao.findAll();
		
		results.stream().forEach(i -> System.out.println(i));
//		results.stream().forEach(System.out::print); // another alternative to passing a lambda explicitly
		
		Item item = dao.findById(1);
		System.out.println("Item found " + item);
		dao.findById(100);
		
		 dao.findByName("bread");
		
		Item cheese = new Item();
		cheese.setItemId(10);
		dao.delete(cheese);
	}

}
