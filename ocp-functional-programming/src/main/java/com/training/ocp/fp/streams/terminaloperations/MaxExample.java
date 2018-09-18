package com.training.ocp.fp.streams.terminaloperations;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * The min() and max() methods allow you to pass a custom comparator and find
 * the smallest or largest value in a finite stream according to that sort
 * order.
 * 
 * 
 * <pre>
	</code>
		Optional<T> max(<? super T> comparator)
	</code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class MaxExample {
	public static void main(String[] args) {
		// what if stream will be changed to Strea<?>
		Stream<String> employees = Stream.of("Pavel Seda", "Roman Podolny", "Katka Novakova", "John Smith", "John Doe");
		Optional<String> shortestName = employees.max((s1, s2) -> s1.length() - s2.length());
		shortestName.ifPresent(System.out::println);

		emptyStreamExample();
	}

	/**
	 * Since the stream is empty, the comparator is never called and no value is
	 * present in the Optional.
	 */
	private static void emptyStreamExample() {
		Optional<?> maxEmpty = Stream.empty().max((s1, s2) -> 0);
		System.out.println(maxEmpty.isPresent()); // false
	}

}
