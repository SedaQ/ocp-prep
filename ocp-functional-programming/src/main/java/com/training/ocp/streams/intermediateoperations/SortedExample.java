package com.training.ocp.streams.intermediateoperations;

import java.util.stream.Stream;

/**
 * Returns Stream with sorted elements. Uses natural ordering unless we specify
 * a comparator.
 * 
 * <pre>
	</code>
		Stream<T> sorted()
		Stream<T> sorted(Comparator<? super T> comparator)
	</code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class SortedExample {

	public static void main(String[] args) {
		Stream<String> employees = Stream.of("Petr Novak", "Pavel Seda");
		employees.sorted().forEach(System.out::println);
	}
}
