package com.training.ocp.acd.polymorphism;

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

	public static void main(String[] args) {
		EmployeeInstanceVariable eiv = new Programmer();
		System.out.println(eiv.name);
		eiv.printName();
	}
}

class Programmer extends EmployeeInstanceVariable {

	String name = "Karlos";

	/**
	 * Try to comment this method and check what will be printed.
	 */
	public void printName() {
		System.out.println(name);
	}

}
