package com.training.ocp.fp.primitivestreams.mappingstreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author Pavel Seda
 *
 */
public class MappingStreams {

	public static void main(String[] args) {
//		streamToIntStream();

		System.out.println();

//		intStreamToStream();

		System.out.println();

		intStreamToStreamBoxed();
	}

	private static void streamToIntStream() {
		Stream<Integer> nums = Stream.of(1, 2, 3);
		IntStream is = nums.mapToInt(num -> num);
		is.forEach(System.out::print);
	}

	private static void intStreamToStream() {
		IntStream is = IntStream.of(1, 2, 3);
		Stream<Integer> stream = is.mapToObj(num -> num);
		stream.forEach(System.out::print);
	}

	private static void intStreamToStreamBoxed() {
		IntStream is = IntStream.of(1, 2, 3);
		is.forEach(System.out::print);
		Stream<Integer> stream = is.boxed();
		stream.forEach(System.out::print);

	}

}
