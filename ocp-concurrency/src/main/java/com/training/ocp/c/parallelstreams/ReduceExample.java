package com.training.ocp.c.parallelstreams;

import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Pavel Šeda
 */
public class ReduceExample {

	public static void main(String[] args) {
		summingNumbers();
		summingNumbersInParallel();
	}

	/**
	 * Explain the difference on the table
	 */
	private static void summingNumbers() {
		int result = IntStream.rangeClosed(1, 100).reduce(0, (sum, element) -> sum + element);
	}

	/**
	 * Explain the difference on the table
	 */
	private static void summingNumbersInParallel() {
		int result = IntStream.rangeClosed(1, 100).parallel().reduce(0, (sum, element) -> sum + element);
	}

	private static void concatReduceExample() {
		Stream<String> reduceExample = Stream.generate(() -> UUID.randomUUID().toString()).limit(10);
		// reduceExample.reduce(accumulator).ifPresent(s -> System.out.println(s));
		// String s = reduceExample.map(Object::toString).collect(Collectors.joining(","));

		reduceExample.reduce(",", String::concat);
	}
}
