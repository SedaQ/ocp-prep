package com.training.ocp.acd.polymorphism;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PolymorphismExample {

	void someMethod() {
		System.out.println("Parent class implementation");
	}

	public static void main(String[] args) {
		PolymorphismExample p = new ChildClass();
		p.someMethod();
	}
}

class ChildClass extends PolymorphismExample {

	void someMethod() {
		System.out.println("Child class implementation");
	}

}
