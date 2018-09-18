package com.training.ocp.fp.buildinfunctionalinterfaces.operation;

import java.util.function.BinaryOperator;

/**
 * 
 * @author Pavel Seda
 *
 */
public class BinaryOperatorExample {

	public static void main(String[] args) {
		concatStrings();
	}

	private static void concatStrings() {
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

		System.out.println(b1.apply("Pavel ", "Seda")); // baby chick
		System.out.println(b2.apply("Pavel ", "Seda")); // baby chick
	}
}
