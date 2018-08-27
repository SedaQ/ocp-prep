package com.training.ocp.accessmodifiers.employee;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Employee {

	private long id;
	private long salary; // private modified
	boolean isMarried; // default modified
	protected int age; // protected modified
	public String name = "Pavel Seda";

	public Employee() {
	}

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
