package com.training.ocp.part2.buildinfunctionalinterfaces.operator;

import java.util.function.UnaryOperator;

/**
 * 
 * @author Pavel Seda
 *
 */
public class UnaryOperatorExample {

	public static void main(String[] args) {
		makeStringsUpperCase();
	}

	private static void makeStringsUpperCase() {
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();
		System.out.println(u1.apply("Pavel"));
		System.out.println(u2.apply("Pavel"));
	}
}
