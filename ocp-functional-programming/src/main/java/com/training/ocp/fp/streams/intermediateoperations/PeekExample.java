package com.training.ocp.fp.streams.intermediateoperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Used for debugging purposes, it is not changing the stream and allows to
 * perform operation on a stream.
 * 
 * <pre>
	</code>
		Stream<T> peek(Consumer<? super T> action)
	</code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class PeekExample {

	public static void main(String[] args) {
		Stream<String> str = Stream.of("pavel", "katka", "zdenka", "tomas");
		List<String> strList = str.peek(System.out::println).limit(2).collect(Collectors.toList());
	}
}
