package com.training.ocp.part2.buildinfunctionalinterfaces.function;

import java.util.function.Function;

/**
 * 
 * @author Pavel Seda
 *
 */
public class FunctionExample {

	public static void main(String[] args) {
		checkStringLength();
	}

	private static void checkStringLength() {
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		System.out.println(f1.apply("Pavel")); // 5
		System.out.println(f2.apply("Petr")); // 4
	}
}
