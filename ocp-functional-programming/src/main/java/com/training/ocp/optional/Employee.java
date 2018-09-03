package com.training.ocp.optional;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Employee {

	private long id;
	private String email;

	public Employee() {
	}

	public Employee(long id, String email) {
		super();
		this.id = id;
		this.email = email;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", email=" + email + "]";
	}

}
