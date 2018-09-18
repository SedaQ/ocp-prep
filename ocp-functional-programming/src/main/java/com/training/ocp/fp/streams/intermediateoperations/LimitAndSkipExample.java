package com.training.ocp.fp.streams.intermediateoperations;

import java.util.stream.Stream;

/**
 * 
 * Limit number of elements or skip particular elements.
 * 
 * <pre>
	</code>
		Stream<T> limit(int maxSize)
		Stream<T> skip(int n)
	</code>
 * </pre>
 * 
 * 
 * @author Pavel Seda
 *
 */
public class LimitAndSkipExample {

	public static void main(String[] args) {
		Stream<String> employees = Stream.of("Pavel Seda", "Roman Podolny", "Katka Novakova", "John Smith", "John Doe");
		employees.skip(1).limit(2).forEach(System.out::println);
	}
}
