package com.training.ocp.gc.sorting;

import java.util.Comparator;

/**
 * 
 * Scenario: We want to sort Employee by name. If two employee have same name,
 * we want to sort them by age.
 * 
 * @author Pavel Seda
 *
 */
public class EmployeeMultiFieldComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		int result = e1.getEmail().compareTo(e2.getEmail());
		if (result != 0)
			return result;
		return e1.getAge() - e2.getAge();
	}

}
