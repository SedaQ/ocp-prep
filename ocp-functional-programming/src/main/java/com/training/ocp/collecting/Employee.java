package com.training.ocp.collecting;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Employee {

	private long id;
	private long salary;
	private String name;
	private String position;

	public Employee() {
	}

	public Employee(long id, long salary, String name, String position) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.position = position;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", position=" + position + "]";
	}

}
