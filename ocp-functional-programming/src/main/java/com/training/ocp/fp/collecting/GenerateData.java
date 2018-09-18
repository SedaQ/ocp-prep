package com.training.ocp.fp.collecting;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Pavel Seda
 *
 */
public class GenerateData {

	static List<Employee> mockedData() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1L, 100_000, "random100@email.cz", "People Manager"));
		employees.add(new Employee(2L, 50_000, "random50@email.cz", "Project Manager"));
		employees.add(new Employee(3L, 56_000, "random56@email.cz", "Project Manager"));
		employees.add(new Employee(4L, 61_000, "random61@email.cz", "Project Manager"));
		employees.add(new Employee(5L, 160_000, "random160@email.cz", "Executive"));
		employees.add(new Employee(6L, 35_000, "random35@email.cz", "Administrator"));
		employees.add(new Employee(7L, 25_000, "random25@email.cz", "Administrator"));
		employees.add(new Employee(8L, 31_000, "random31@email.cz", "Administrator"));
		employees.add(new Employee(9L, 43_000, "random43@email.cz", "Administrator"));
		employees.add(new Employee(10L, 37_000, "random37@email.cz", "Administrator"));
		employees.add(new Employee(11L, 100_000, "random100@email.cz", "People Manager"));
		return employees;
	}

}
