package com.training.ocp.fp.streams.intermediateoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Returns a Stream with elements that match a given expression
 * 
 * <pre>
	</code>
		Stream<T> filter(Predicate<? super T> predicate)
	</code>
 * </pre>
 * 
 * 
 * @author Pavel Seda
 *
 */
public class FilterExample {

	public static void main(String[] args) {
		Stream<String> employees = Stream.of("Pavel Seda", "Roman Podolny", "Katka Novakova", "John Smith", "John Doe");
		List<String> employeesList = employees.filter(str -> str.startsWith("Pavel"))
				.collect(Collectors.toCollection(ArrayList::new));

	}
}
