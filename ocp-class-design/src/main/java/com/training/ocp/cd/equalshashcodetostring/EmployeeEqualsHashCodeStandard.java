package com.training.ocp.cd.equalshashcodetostring;

/**
 * In hibernate it is better to replace
 * 
 * <pre>
	<code>
		(getClass() != obj.getClass())
	</code>
 * </pre>
 * 
 * with
 * 
 * <pre>
	<code>
		(!(obj instanceof  EmployeeEqualsHashCodeStandard))
	</code>
 * </pre>
 * 
 * 
 * 
 * @author Pavel Šeda
 *
 */
public class EmployeeEqualsHashCodeStandard {

	private long id;
	private String email; // unique

	public EmployeeEqualsHashCodeStandard() {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEqualsHashCodeStandard other = (EmployeeEqualsHashCodeStandard) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}
