package com.training.ocp.sorting;

import java.util.Comparator;

/**
 * Comparator is used when you want to sort objects in different ways at
 * different times.
 * 
 * @author Pavel Seda
 *
 */
public class EmployeeEmailComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmail().compareTo(e2.getEmail());
	}

}
