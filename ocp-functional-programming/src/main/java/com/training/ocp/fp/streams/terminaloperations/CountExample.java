package com.training.ocp.fp.streams.terminaloperations;

import java.util.stream.Stream;

/**
 * Determines the number of elements in finite stream.
 * 
 * <pre>
	</code>
		long count()
	</code>
 * </pre>
 * 
 * 
 * @author Pavel Seda
 *
 */
public class CountExample {

	public static void main(String[] args) {
		Stream<Integer> nums = Stream.of(1, 2, 3);
		System.out.println(nums.count()); // 3
	}
}
