package com.training.ocp.accessmodifiers;

import com.training.ocp.accessmodifiers.employee.Employee;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Main {

	/**
	 * Which one is accessible and why?
	 * 
	 */
	public static void main(String[] args) {
		Employee employee = new Employee();
		// employee.name = "something";
		// employee.isMarried = true;
		// employee.age = 33;
		// employee.salary = 100_000L;
	}
}
