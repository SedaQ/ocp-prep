package com.training.ocp.fp.streams.terminaloperations;

import java.util.stream.Stream;

/**
 * The reduce() method combines a stream into a single object.
 * 
 * <pre>
	</code>
		T reduce(T identity, BinaryOperator<T> accumulator)
		Optional<T> reduce(BinaryOperator<T> accumulator)
		<U> U reduce(U identity, BiFunction<U, ? super T,U> accumulator, BinaryOperator<U> combiner)
	</code>
 * </pre>
 * 
 * 
 * @author Pavel Seda
 *
 */
public class ReduceExample {

	public static void main(String[] args) {
		reduceStandardWay();
		reduceLambdaWay();
		reduceBinaryOperatorWay();
	}

	private static void reduceStandardWay() {
		String[] array = new String[] { "p", "a", "v", "e", "l" };
		String result = "";
		for (String s : array)
			result = result + s;
		System.out.println(result); // pavel
	}

	private static void reduceLambdaWay() {
		Stream<String> stream = Stream.of("p", "a", "v", "e", "l");
		String pavel = stream.reduce("", (s, c) -> s + c);
		System.out.println(pavel); // pavel
	}

	private static void reduceBinaryOperatorWay() {
		Stream<String> stream = Stream.of("p", "a", "v", "e", "l");
		String pavel = stream.reduce("", String::concat);
		System.out.println(pavel); // pavel
	}
}
