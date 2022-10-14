package com.skillstorm;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		// FACTORY DESIGN PATTERN
		
		/*
		 * The factory design pattern is a "creational design pattern"
		 * -- it deals with the creation of an Object
		 * -- an example of a deeper usage of the abstraction pillar
		 * 
		 * The factory will create Objects for us
		 * -- how it does so and which Objects it's going to create are hidden from us
		 * -- we don't know how, we don't know why, and we don't care
		 */
		
		// by using an interface to group classes, we can collect them in an array
		Shape[] shapes = { new Circle(), new Triangle(), new Rhombus(), new Octagon() };
		
		// by forcing them all to implement declareMyself(), we can also run the same method on each one
		// each has its own implementation of that method, with different results
		for (Shape shape : shapes) {
			shape.declareMyself();
		}
		
		System.out.println();
		System.out.println();
		
		// create a new ShapeFactory
		ShapeFactory myShapeFactory = new ShapeFactory();
		
		// CAN just run the method, but can't really do anything with the return
		System.out.println(myShapeFactory.createShape(4));
		
		// saving the output of the ShapeFactory to a variable
		Shape myFreshShape = myShapeFactory.createShape(90);
		
		// calling a method on our newly created Shape
		myFreshShape.declareMyself();

	}

}
