package com.training.ocp.designpatterns.factory;

/**
 * This example is from page:
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 * 
 * @author Seda
 *
 */
public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("circle");
		// call draw method of Circle
		shape1.draw();
		// get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("rectangle");
		// call draw method of Rectangle
		shape2.draw();
		// get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("square");
		// call draw method of square
		shape3.draw();
	}

}
