package com.training.ocp.cd.equalshashcodetostring;

import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class EmployeeEqualsUsingReflectionSelectedVariables {

	private long id;
	private String email; // unique

	public boolean equals(Object obj) {
		if (!(obj instanceof EmployeeEqualsUsingReflectionSelectedVariables))
			return false;
		EmployeeEqualsUsingReflectionSelectedVariables other = (EmployeeEqualsUsingReflectionSelectedVariables) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj)).append(id, other.id).append(email, other.email)
				.isEquals();
	}
}
