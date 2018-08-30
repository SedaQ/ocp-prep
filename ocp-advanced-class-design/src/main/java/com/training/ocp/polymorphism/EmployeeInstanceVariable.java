package com.training.ocp.polymorphism;

/**
 * 
 * Instance variables works in different way.
 * 
 * @author Pavel Šeda
 *
 */
public class EmployeeInstanceVariable {
	String name = "Pavel";

	public void printName() {
		System.out.println(name);
	}
}

class Programmer extends EmployeeInstanceVariable {
	String name = "Karlos";

	// public void printName() {
	// System.out.println(name);
	// }

}
