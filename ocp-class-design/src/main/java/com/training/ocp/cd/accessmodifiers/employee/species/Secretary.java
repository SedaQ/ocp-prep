package com.training.ocp.cd.accessmodifiers.employee.species;

import com.training.ocp.cd.accessmodifiers.employee.Employee;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Secretary extends Employee {

	/**
	 * What is the difference for protected modified in these two scenarios ?
	 * 
	 */
	public static void main(String[] args) {
		scenario1();
		scenario2();
	}

	public static void scenario1() {
		// Employee employee2 = new Secretary();
		// employee2.name = "something";
		// employee2.isMarried = true;
		// employee2.age = 33;
		// employee2.salary = 100_000L;
	}

	public static void scenario2() {
		// Secretary employee = new Secretary();
		// employee.name = "something";
		// employee.isMarried = true;
		// employee.age = 33;
		// employee.salary = 100_000L;
	}

}
