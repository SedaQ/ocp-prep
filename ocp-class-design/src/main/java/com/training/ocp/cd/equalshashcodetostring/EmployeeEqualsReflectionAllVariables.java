package com.training.ocp.cd.equalshashcodetostring;

import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class EmployeeEqualsReflectionAllVariables {

	private long id;
	private String email; // unique

	public EmployeeEqualsReflectionAllVariables() {
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

	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj); // all variables
	}
}
