package com.training.ocp.streams.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * It is mutable reduction, we use the same mutable object to accumulate the
 * final value. Commonly used to collect the results (after intermediate
 * operations like filter) to the final collection).
 * 
 * <pre>
	</code>
		<R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)
		<R,A> R collect(Collector<? super T, A,R> collector)
	</code>
 * </pre>
 * 
 * 
 * @author Pavel Seda
 *
 */
public class CollectExample {

	public static void main(String[] args) {
		Stream<String> employees = Stream.of("Pavel Seda", "Roman Podolny", "Katka Novakova", "John Smith", "John Doe");
		List<String> employeesList = employees.collect(Collectors.toCollection(ArrayList::new));
	}
}
