package com.training.ocp.interfaces.lambda.anotherexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Main {

	public static void main(String[] args) {

		List<Data> nums = Arrays.asList(new Data(0), new Data(2), new Data(3), new Data(4), new Data(5), new Data(6),
				new Data(7), new Data(8), new Data(80));

		withoutLambda(nums);

		System.out.println();

		withLambda(nums);
	}

	/**
	 * Implement using Anonymous class
	 */
	private static void withoutLambda(List<Data> nums) {
		Data.printUsefulData(nums, new Predicate<Data>() {
			public boolean test(Data d) {
				return d.getValue() > 5;
			}
		});
	}

	/**
	 * Implement using lambda expression
	 */
	private static void withLambda(List<Data> nums) {
		Data.printUsefulData(nums, d -> d.getValue() > 2);
	}

}
