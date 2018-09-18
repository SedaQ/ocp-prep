package com.training.ocp.fp.streams.intermediateoperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Returns a stream without duplicates.
 * 
 * <pre>
	</code>
		Stream<T> distinct()
	</code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class DistinctExample {

	public static void main(String[] args) {
		Stream<String> employees = Stream.of("Pavel Seda", "Pavel Seda", "John Doe");
		List<String> employeesList = employees.distinct().collect(Collectors.toList());
		System.out.println(employeesList);
	}
}
