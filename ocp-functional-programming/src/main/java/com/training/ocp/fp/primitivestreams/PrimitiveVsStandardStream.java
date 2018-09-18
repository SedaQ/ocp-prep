package com.training.ocp.fp.primitivestreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PrimitiveVsStandardStream {

	private static final int intEnding = 100_000_000;

	public static void main(String[] args) {

		standardStreamOfInts();

		System.out.println();

		primitiveIntStream();

	}

	private static void standardStreamOfInts() {
		long t = System.currentTimeMillis();
		System.out.println("Starting standard stream:" + 0);
		Stream<Integer> is = Stream.iterate(0, i -> i++).limit(intEnding);
		is.limit(intEnding).forEach((num) -> System.out.print(""));
		System.out.println("End  stream:" + (System.currentTimeMillis() - t));
	}

	private static void primitiveIntStream() {
		long t = System.currentTimeMillis();
		System.out.println("Starting int stream:" + 0);
		// range or rangeClosed
		IntStream is = IntStream.rangeClosed(1, intEnding);
		is.limit(intEnding).forEach((num) -> System.out.print(""));
		System.out.println("End int stream:" + (System.currentTimeMillis() - t));

	}

}
