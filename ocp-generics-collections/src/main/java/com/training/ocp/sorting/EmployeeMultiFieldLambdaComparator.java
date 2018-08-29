package com.training.ocp.sorting;

import java.util.Comparator;

/**
 * Scenario: We want to sort Employee by name. If two employee have same name,
 * we want to sort them by age.
 * 
 * This is implemented using lambda expression.
 * 
 * @author Pavel Seda
 *
 */
public class EmployeeMultiFieldLambdaComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		Comparator<Employee> c = Comparator.comparing(employee -> employee.getEmail());
		c = c.thenComparing(employee -> employee.getAge());
		return c.compare(e1, e2);
	}

}
