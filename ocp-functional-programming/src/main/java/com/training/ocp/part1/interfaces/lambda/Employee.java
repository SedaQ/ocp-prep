package com.training.ocp.part1.interfaces.lambda;

/**
 *
 * @author Pavel Šeda
 * 
 */
public class Employee {

	private long id;
	private String email;
	private boolean manager;

	public Employee() {
	}

	public Employee(long id, String email, boolean manager) {
		super();
		this.id = id;
		this.email = email;
		this.manager = manager;
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

	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

}
