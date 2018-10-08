package com.training.ocp.c.parallelstreams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 
 * @author Pavel Seda
 *
 */
public class CreatingParallelStreams {

	public static void main(String[] args) {

	}

	private static void parallel() {
		Stream<Integer> stream = Arrays.asList(1, 2, 3, 4).stream();
		Stream<Integer> parallelStream = stream.parallel();
	}

	private static void parallelStream() {
		Stream<Integer> parallelStream = Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream();
	}
}
