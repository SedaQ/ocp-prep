package com.training.ocp.equalshashcodetostring;

import lombok.ToString;

/**
 * Lombok project is good for avoiding boilereplate code.
 * 
 * @author Pavel Šeda
 *
 */
@ToString(exclude = "salary")
public class EmployeeToStringLombok {
	private String name;
	private int salary;

	public EmployeeToStringLombok() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public EmployeeToStringLombok(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}
