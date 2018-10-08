package com.training.ocp.c.parallelstreams;

import java.util.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class OldProcessingVsNewProcessing {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("pavel", 10000), new Employee("pavel", 23000), new Employee("petr", 15000),
				new Employee("karel", 12000), new Employee("maruska", 11000));

		sumSalariesOldWayOfProcessing(employees);
		sumSalariesNewWayOfProcessing(employees);

	}

	private static void sumSalariesOldWayOfProcessing(List<Employee> employees) {
		double sumSalary = 0.0;
		for (Employee emp : employees) {
			if (emp.getName().equals("pavel")) {
				sumSalary += emp.getSalary();
			}
		}
		System.out.println("Total salary for employees with name Pavel is..: " + sumSalary);
	}

	private static void sumSalariesNewWayOfProcessing(List<Employee> employees) {
		double sumSalary = employees.parallelStream().filter(emp -> emp.getName().equals("pavel")).mapToDouble(emp -> emp.getSalary()).sum();
		System.out.println("Total salary for employees with name Pavel is..: " + sumSalary);
	}

	static class Employee {

		private String name;
		private double salary;

		public Employee(String name, double salary) {
			super();
			this.name = name;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + "]";
		}

	}
}
