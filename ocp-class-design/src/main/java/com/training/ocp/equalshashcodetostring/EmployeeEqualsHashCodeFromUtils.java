package com.training.ocp.equalshashcodetostring;

import java.util.Objects;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class EmployeeEqualsHashCodeFromUtils {

	private long id;
	private String email; // unique

	public EmployeeEqualsHashCodeFromUtils() {
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

	/**
	 * Objects.hash(...) creates internal array of objects, so for one element it is
	 * better to use Objects.hashCode method
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof EmployeeEqualsHashCodeFromUtils))
			return false;
		EmployeeEqualsHashCodeFromUtils other = (EmployeeEqualsHashCodeFromUtils) obj;
		return Objects.equals(email, other.getEmail());
	}

}
