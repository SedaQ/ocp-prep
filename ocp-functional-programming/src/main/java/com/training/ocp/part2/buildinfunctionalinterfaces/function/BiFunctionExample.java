package com.training.ocp.part2.buildinfunctionalinterfaces.function;

import java.util.function.BiFunction;

/**
 * 
 * @author Pavel Seda
 *
 */
public class BiFunctionExample {

	public static void main(String[] args) {
		sumNumbers();
	}

	private static void sumNumbers() {
		BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result: " + (num1 + num2);
		System.out.println(biFunction.apply(20, 25));
	}
}
