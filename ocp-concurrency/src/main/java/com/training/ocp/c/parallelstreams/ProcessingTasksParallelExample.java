package com.training.ocp.c.parallelstreams;

import java.util.Arrays;

/**
 * 
 * @author Pavel Seda
 *
 */
public class ProcessingTasksParallelExample {

	public static void main(String[] args) {
		withoutParallel();

		System.out.println(System.lineSeparator());

		withParallel();

		System.out.println(System.lineSeparator());

		withParallelOrdered();
	}

	private static void withoutParallel() {
		Arrays.asList(1, 2, 3, 4).stream().forEach(s -> System.out.print(s + " "));
	}

	private static void withParallel() {
		Arrays.asList(1, 2, 3, 4).parallelStream().forEach(s -> System.out.print(s + " "));
	}

	private static void withParallelOrdered() {
		Arrays.asList(1, 2, 3, 4).parallelStream().forEachOrdered(s -> System.out.print(s + " "));
	}
}
