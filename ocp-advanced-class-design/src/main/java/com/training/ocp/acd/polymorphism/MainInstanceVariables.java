package com.training.ocp.acd.polymorphism;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class MainInstanceVariables {

	public static void main(String[] args) {
		EmployeeInstanceVariable employee1 = new EmployeeInstanceVariable();
		EmployeeInstanceVariable employee2 = new Programmer();
		Programmer employee3 = new Programmer();

		employee1.printName();
		employee2.printName();
		employee3.printName();
	}
}
