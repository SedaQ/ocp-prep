package com.training.ocp.designpatterns.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Pavel Šeda
 *
 */
public final class EmployeeImmutable {

	private final long id;
	private final String email;
	private final List<Company> companies;

	public EmployeeImmutable(long id, String email, List<Company> companies) {
		super();
		this.id = id;
		this.email = email;
		this.companies = new ArrayList<>(companies);
	}

	public long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	/**
	 * This is method makes that class mutable
	 * 
	 * @return
	 */
	public List<Company> getCompaniesMutable() {
		return companies; // this one make this class mutable
	}

	public List<Company> getCompanies() {
		return Collections.unmodifiableList(this.companies);
		// or
		// return new ArrayList<>(this.companies);
	}

}
