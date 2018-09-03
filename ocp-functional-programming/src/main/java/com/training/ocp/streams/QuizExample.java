package com.training.ocp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Pavel Seda
 *
 */
public class QuizExample {

	public static void main(String[] args) {
		whatIsTheOutput();
		imtermediateAfterTerminal();
		reusingStreams();
	}

	/**
	 * It will not invoke (no terminal operation) it will just print the stream
	 * reference
	 */
	private static void whatIsTheOutput() {
		System.out
				.println(Stream.generate(() -> "karel").filter(n -> n.length() == 5).map(str -> str).sorted().limit(1));
	}

	/**
	 * It is not possible to invoke peek on List or even any intermediate operation
	 * after terminal operation.
	 * 
	 */
	private static void imtermediateAfterTerminal() {
		Stream<String> employees = Stream.of("pepa", "tomas");
//		employees.collect(Collectors.toList()).peek(emp -> System.out.println(emp + " "));
		employees.collect(Collectors.toList()).forEach(emp -> System.out.println(emp + " "));
	}

	/**
	 * It is not possible to reuse same stream after this stream is operated with
	 * terminal operation.
	 * 
	 * Throws java.lang.IllegalStateException: stream has already been operated upon
	 * or closed
	 */
	private static void reusingStreams() {
		List<String> myList = Arrays.asList("one", "one", "two", "two", "three");
		Stream<String> myStream = Stream.of(myList).flatMap(l -> l.stream());
		List<String> onlyOnes = myStream.filter(str -> str.equals("one")).collect(Collectors.toList());
//		List<String> onlyTwos = myStream.filter(str -> str.equals("two")).collect(Collectors.toList());
	}

}
