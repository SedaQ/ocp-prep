package com.training.ocp.cd.equalshashcodetostring;

/**
 * ToString method should be used in all data classes (DTO, DAO etc.).
 * 
 * @author Pavel Šeda
 *
 */
public class EmployeeToStringConcat {

	private String name;
	private int salary;

	public EmployeeToStringConcat() {}

	public EmployeeToStringConcat(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
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

	@Override
	public String toString() {
		return "EmployeeToStringStringBuilder [name=" + name + ", salary=" + salary + "]";
	}

}
