package com.training.ocp.acd.designpatterns.factory;

public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
