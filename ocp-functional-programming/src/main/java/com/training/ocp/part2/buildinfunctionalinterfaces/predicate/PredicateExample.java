package com.training.ocp.part2.buildinfunctionalinterfaces.predicate;

import java.util.function.Predicate;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PredicateExample {

	public static void main(String[] args) {
		testIfStringIsEmpty();
	}

	private static void testIfStringIsEmpty() {
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();

		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
	}
}
