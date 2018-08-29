package com.training.ocp.generics.bounds;

import java.util.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class WhyNotUseObject {

	public static void main(String[] args) {
		List<String> employees = new ArrayList<>();
		employees.add("Pavel Seda");

		// DOES NOT COMPILE .. List types must match
		// printList(employees);

		// DOES NOT compile
		// List<Object> objs = employyes;

		// objs.add("the best employee");

		// not allowed
		// List<Object> objs = new ArrayList<String>();
		List<? extends Object> objs = new ArrayList<String>();
	}

	/**
	 * If we want to pass a List<String> we must change this method signature to
	 * List<?> then it will works as expected.
	 * 
	 * @param list
	 */
	private static void printList(List<Object> list) {
		list.forEach(System.out::println);
	}

	// private static void printList(List<?> list) {}

	// private static void printList(List<? extends Exception> list) {}
}
