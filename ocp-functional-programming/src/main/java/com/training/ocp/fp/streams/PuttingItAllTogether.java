package com.training.ocp.fp.streams;

import java.util.stream.Stream;

/**
 * Just one intersting example to test the understanding of intermediate and
 * terminal operations.
 * 
 * @author Pavel Seda
 *
 */
public class PuttingItAllTogether {

	public static void main(String[] args) {
		streamPipelineFinite();
		// streamPipelineInfinite();
	}

	private static void streamPipelineInfinite() {
		Stream.generate(() -> "pavel")
			.filter(n -> n.length() == 5)
			.sorted()
			.limit(2)
			.forEach(System.out::println);
	}

	private static void streamPipelineFinite() {
		Stream.generate(() -> "pavel")
			.filter(n -> n.length() == 5)
			.limit(2)
			.sorted()
			.forEach(System.out::println);
	}
}
