package com.training.ocp.buildinfunctionalinterfaces.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PredicateExample {

	public static void main(String[] args) {
		testIfStringIsEmpty();

		createList().stream().filter(s -> s.startsWith("Interface")).forEach(System.out::println);
	}

	private static void testIfStringIsEmpty() {
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();

		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
	}

	private static List<String> createList() {
		List<String> strings = new ArrayList<>();
		strings.add("Class");
		strings.add("Abstract Class");
		strings.add("Interface");
		return strings;
	}
}
