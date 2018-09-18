package com.training.ocp.fp.streams.intermediateoperations;

import java.util.stream.Stream;

/**
 * Creates one-to-one mapping, e.g. converts list of employees to the list of
 * longs (retrieving only salary from the employee objects)
 * 
 * <pre>
	</code>
		<R> Stream<R> map(Function<? super T, ? extends R> mapper)
	</code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class MapExample {

	public static void main(String[] args) {
		Stream<String> employees = Stream.of("Pavel Seda", "Roman Podolny", "Katka Novakova", "John Smith", "John Doe");
		employees.map(String::length);
	}
}
