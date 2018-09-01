package com.training.ocp.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Invoking Comparable and Comparator examples (including Comparator with
 * lambda).
 * 
 * @author Pavel Seda
 *
 */
public class Main {

	public static void main(String[] args) {
		sortingWithComparable();
		sortingWithComparator();
		sortingWithComparatorUsingLambda();
	}

	private static void sortingWithComparable() {
		List<Employee> employees = initializeData();
		Collections.sort(employees);
		employees.forEach(System.out::println);

	}

	private static void sortingWithComparator() {
		System.out.println(System.lineSeparator() + "Sorting with Comparator:");

		List<Employee> employees = initializeData();
		Collections.sort(employees, new EmployeeEmailComparator());
		employees.forEach(System.out::println);
	}

	private static void sortingWithComparatorUsingLambda() {
		System.out.println(System.lineSeparator() + "Sorting with Comparator using lambda:");

		List<Employee> employees = initializeData();
		Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		employees.forEach(System.out::println);
	}

	/**
	 * BTW: interesting initialization of ArrayList with values isn't it?
	 * 
	 * This is called "double brace initialization" -> makes an anonymous inner
	 * class with an instance initializer
	 */
	private static List<Employee> initializeData() {
		List<Employee> employees = new ArrayList<Employee>() {
			{
				add(new Employee(1, "azebra@email.cz", "Zebra", 11, "Zebra has stripes."));
				add(new Employee(2, "adam@email.cz", "Adam", 42, "Adam is a man"));
				add(new Employee(3, "pepa@email.cz", "Pepa", 44, "Adam is a man"));
			}
		};
		return employees;
	}
}
