package com.training.ocp.fp.buildinfunctionalinterfaces.supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

import com.training.ocp.fp.buildinfunctionalinterfaces.Employee;

/**
 * 
 * Supplier is commonly used for logging purposes.
 * 
 * @author Pavel Seda
 *
 */
public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Employee> employee = createEmployee();
		System.out.println(employee.get());

		Supplier<LocalDate> localDate = actualDate();
		System.out.println(localDate.get());

		actualDateMethodReference();
	}

	private static Supplier<Employee> createEmployee() {
		Supplier<Employee> employee = () -> new Employee(1, "Pavel Seda", "pavelseda@email.cz", 33, "employee",
				"lector");
		return employee;
	}

	private static Supplier<LocalDate> actualDate() {
		return () -> LocalDate.now();
	}

	private static Supplier<LocalDate> actualDateMethodReference() {
		return LocalDate::now;
	}
}
