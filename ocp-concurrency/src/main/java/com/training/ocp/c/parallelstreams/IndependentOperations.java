package com.training.ocp.c.parallelstreams;

import java.util.Arrays;

/**
 * 
 * @author Pavel Seda
 *
 */
public class IndependentOperations {

	public static void main(String[] args) {
		independentOperation();
	}

	/**
	 * When using streams avoid any lambda expressions that can produce side effects!
	 */
	private static void independentOperation() {
		Arrays.asList("pavel", "petr", "zdenka").parallelStream()
				// .map(s -> s.toUpperCase())
				.map(String::toUpperCase).forEach(System.out::println);

	}
}
