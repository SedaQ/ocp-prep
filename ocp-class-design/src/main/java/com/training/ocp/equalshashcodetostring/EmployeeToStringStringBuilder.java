package com.training.ocp.equalshashcodetostring;

/**
 * ToString method should be used in all data classes (DTO, DAO etc.).
 * 
 * @author Pavel Šeda
 *
 */
public class EmployeeToStringStringBuilder {

	private String name;
	private int salary;

	public EmployeeToStringStringBuilder() {
	}

	public EmployeeToStringStringBuilder(String name, int salary) {
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
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeToStringStringBuilder [name=").append(name).append(", salary=").append(salary)
				.append("]");
		return builder.toString();
	}

}
