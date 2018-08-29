package com.training.ocp.sorting;

/**
 * 
 * If we implement this interface without Generics (Legacy code) we need to cast
 * objects in compareTo method.
 * 
 * @author Pavel Seda
 *
 */
public class EmployeeComparableWithoutGenerics implements Comparable {

	private long id;
	private String email;
	private String name;
	private int age;
	private String description;

	public EmployeeComparableWithoutGenerics(long id, String email, String name, int age, String description) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	/**
	 * It is necessary to cast
	 */
	@Override
	public int compareTo(Object o) {
		EmployeeComparableWithoutGenerics employee = (EmployeeComparableWithoutGenerics) o;
		return email.compareTo(employee.getEmail());
	}

}
