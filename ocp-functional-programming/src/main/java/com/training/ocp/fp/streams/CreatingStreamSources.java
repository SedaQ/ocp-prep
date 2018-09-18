package com.training.ocp.fp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * Additional merge options to create stream source are listed in the following
 * link: https://www.baeldung.com/java-merge-streams
 * 
 * @author Pavel Seda
 *
 */
public class CreatingStreamSources {

	public static void main(String[] args) {

		streamArray();

		createStreamFromlist();

		generateStreamValues();

		concatStreams();

		concatStreamsUsingFlatMap();
	}

	private static void concatStreams() {
		Stream<Integer> stream1 = Stream.of(1, 3, 5);
		Stream<Integer> stream2 = Stream.of(2, 4, 6);

		Stream<Integer> resultingStream = Stream.concat(stream1, stream2);

		resultingStream.forEach(System.out::print);
	}

	private static void concatStreamsUsingFlatMap() {
		Stream<Integer> stream1 = Stream.of(1, 3, 5);
		Stream<Integer> stream2 = Stream.of(2, 4, 6);
		Stream<Integer> stream3 = Stream.of(18, 15, 36);
		Stream<Integer> stream4 = Stream.of(99);
		Stream<Integer> resultingStream = Stream.of(stream1, stream2, stream3, stream4).flatMap(i -> i);

	}

	private static void streamArray() {
		Stream<Integer> array = Stream.of(10, 20, 30);
	}

	private static void createStreamFromlist() {
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
	}

	private static void generateStreamValues() {
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 3);
	}
}
