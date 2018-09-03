package com.training.ocp.streams.intermediateoperations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Method takes each element in the stream and makes any elements it contains
 * top-level elements in a single stream.
 * 
 * It means that -> if you have a stream where every element contains its own
 * sequence of elements and you want to create a stream of these inner elements,
 * you should use the flatMap() method.
 * 
 * <pre>
	</code>
		<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
	</code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class FlatMapExample {

	public static void main(String[] args) {
		List<String> employees1 = Arrays.asList("Pavel Seda");
		List<String> employees2 = Arrays.asList("Katka Novotna");

		Stream<List<String>> employeesLists = Stream.of(employees1, employees2);
		List<String> employees = employeesLists.flatMap(emp -> emp.stream()).collect(Collectors.toList());
		employees.forEach(System.out::println);

	}
}
