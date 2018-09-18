package com.training.ocp.fp.streams.terminaloperations;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Returns first element of the stream.
 * 
 * <pre>
	</code>
		Optional<T> findFirst()
	</code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class FindFirstExample {
	public static void main(String[] args) {
		Stream<String> employees = Stream.of("Pavel Seda", "John Smith", "John Doe");
		Optional<String> someEmployee = employees.parallel().findFirst();
		someEmployee.ifPresent(System.out::println);
	}

}
