package com.training.ocp.acd.designprinciples;

import java.util.Objects;

/**
 * 
 * This is class which is using encapsulation and also this class is called Java
 * Bean.
 * 
 * @author Pavel Šeda
 *
 */
public class EmployeeEncapsulated {

	private long id;
	private String email;

	public EmployeeEncapsulated(long id, String email) {
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
		Objects.requireNonNull(email);
		this.email = email;
	}

}
