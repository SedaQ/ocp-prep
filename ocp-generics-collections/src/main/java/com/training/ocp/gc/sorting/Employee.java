package com.training.ocp.gc.sorting;

/**
 * Comparable is used in case of natural ordering, e.g. sorting by name.
 * 
 * If we implement interface Comparable please think about consistency with
 * equals() method, because not all collection classes behave predictably if the
 * compareTo() and equals() methods are not consistent.
 * 
 * @author Pavel Seda
 *
 */
public class Employee implements Comparable<Employee> {

	private long id;
	private String email;
	private String name;
	private int age;
	private String description;

	public Employee(long id, String email, String name, int age, String description) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.age = age;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee employee) {
		return name.compareTo(employee.getName());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", email=" + email + ", name=" + name + ", age=" + age + ", description="
				+ description + "]";
	}

}
