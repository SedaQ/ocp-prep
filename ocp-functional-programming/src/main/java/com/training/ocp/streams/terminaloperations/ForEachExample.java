package com.training.ocp.streams.terminaloperations;

import java.util.stream.Stream;

/**
 * This is terminal operation with return type void. Commonly used for printing
 * something.
 * 
 * <pre>
	</code>
		void forEach(Consumer<? super T> action)
	</code>
 * </pre>
 * 
 * 
 * @author Pavel Seda
 *
 */
public class ForEachExample {

	public static void main(String[] args) {
		Stream<String> employees = Stream.of("Pavel Seda", "John Smith", "John Doe");
		employees.forEach(emp -> System.out.print(emp + ", "));
	}
}
