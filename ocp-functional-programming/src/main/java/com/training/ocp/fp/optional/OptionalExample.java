package com.training.ocp.fp.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Provide a type-level solution for representing optional values instead of
 * using null references.
 * 
 * @author Pavel Seda
 *
 */
public class OptionalExample {

	public static void main(String[] args) {
//		optionalOf();
		optionalOfNullable();
		optionalVsNullHandling();
	}

	private static void optionalVsNullHandling() {
//		Optional<Employee> employee = Optional.ofNullable(createEmployeeNull());
		Optional<Employee> employee = Optional.ofNullable(createEmployee());

		employee.orElse(new Employee());
		employee.orElseGet(Employee::new);
		Employee e1 = employee.orElseThrow(() -> new NullPointerException("Employee is not present"));

		// possibility to call other lambda functions
		if (employee.isPresent()) {
			employee.map(Employee::getId).ifPresent(System.out::println);
		}

		// standard null pointer handling
		Employee employeeNullHandling = createEmployee();
		if (employeeNullHandling == null) {
			// do something
		}

	}

	/**
	 * Why use Optional.of() factory method? When it does handle null -> Some
	 * methods need to return Optional and if you are sure that the value will never
	 * be null then it is much better to use Optional.of
	 */
	private static void optionalOf() {
		Optional<Employee> employee = Optional.of(createEmployeeNull());
		if (employee.isPresent()) {
			System.out.println(employee.get());
		} else {
			System.out.println("Employee is not present");
		}
	}

	private static void optionalOfNullable() {
		Optional<Employee> employee = Optional.ofNullable(createEmployeeNull());
		if (employee.isPresent()) {
			System.out.println(employee.get());
		} else {
			System.out.println("Employee is not present");
		}
	}

	private static Employee createEmployeeNull() {
		return null;
	}

	private static Employee createEmployee() {
		return new Employee(1, "pavelseda@gmail.com");
	}

	private static List<Employee> createEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "pavelseda@email.cz"));
		employees.add(new Employee(2, "zdenkasedova@seznam.cz"));
		employees.add(new Employee(3, "something@gmail.com"));
		return employees;
	}
}
