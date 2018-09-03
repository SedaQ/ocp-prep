package com.training.ocp.primitivestreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author Pavel Seda
 *
 */
public class IntStreamExample {

	public static void main(String[] args) {
		IntStream is = IntStream.range(1, 10);
		is.forEach(System.out::print);

		Stream<Integer> si = is.boxed();
		si.forEach(System.out::print);
	}
}
