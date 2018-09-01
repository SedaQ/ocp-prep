package com.training.ocp.part2.buildinfunctionalinterfaces.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import com.training.ocp.part2.buildinfunctionalinterfaces.Employee;

/**
 * 
 * @author Pavel Seda
 *
 */
public class BiPredicateExample {

	public static void main(String[] args) {
		testStartsWith();

		filterEmployees(createEmployees());
	}

	private static void testStartsWith() {
		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

		System.out.println(b1.test("Pavel", "Pav"));
		System.out.println(b2.test("Pavel", "Pet"));
	}

	/**
	 * This method filters employees only to Pavel Seda using Predicate 
	 * 
	 * @param employees represents List of Employees
	 */
	private static void filterEmployees(List<Employee> employees) {
		List<Employee> pavels = employees.stream()
										 .filter(e -> e.getName().equals("Pavel Seda"))
										 .collect(Collectors.toList());
		System.out.println(pavels);
	}

	private static List<Employee> createEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Pavel Seda", "pavelseda@email.cz", 33, "employee", "lector"));
		employees.add(new Employee(2, "Petr Seda", "petrseda@email.cz", 35, "employee", "director"));
		employees.add(new Employee(3, "Milos Seda", "milosseda@email.cz", 60, "employee", "profesor"));
		return employees;
	}
}
