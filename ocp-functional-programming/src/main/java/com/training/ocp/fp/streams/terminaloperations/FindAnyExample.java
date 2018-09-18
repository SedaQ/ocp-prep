package com.training.ocp.fp.streams.terminaloperations;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Returns any element of the stream.
 * 
 * <pre>
	</code>
		Optional<T> findAny()
	</code>
 * </pre>
 * 
 * 
 * @author Pavel Seda
 *
 */
public class FindAnyExample {

	public static void main(String[] args) {
		Stream<String> employees = Stream.of("Pavel Seda", "John Smith", "John Doe");
		Stream<String> infiniteStream = Stream.generate(() -> "Seda");
		Optional<String> someEmployee = employees.findAny();
		someEmployee.ifPresent(System.out::println);
		infiniteStream.findAny().ifPresent(System.out::println);
	}
}
