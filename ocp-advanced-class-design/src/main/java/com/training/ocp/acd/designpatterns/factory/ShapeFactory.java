package com.training.ocp.acd.designpatterns.factory;

public class ShapeFactory {
	// use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		switch (shapeType) {
		case "circle":
			return new Circle();
		case "rectangle":
			return new Rectangle();
		case "square":
			return new Square();
		default:
			throw new IllegalArgumentException();
		}
	}

}
