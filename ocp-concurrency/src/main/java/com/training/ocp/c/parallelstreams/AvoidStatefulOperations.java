package com.training.ocp.c.parallelstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Side effects can also appear in parallel streams if your lambda expressions are stateful. A
 * stateful lambda expression is one whose result depends on any state that might change during the
 * execution of a pipeline. On the other hand, a stateless lambda expression is one whose result
 * does not depend on any state that might change during the execution of a pipeline. Let’s take a
 * look an example to see why stateful lambda expressions should be avoided in parallel streams:
 * 
 * @author Pavel Šeda
 */
public class AvoidStatefulOperations {

	public static void main(String[] args) {
		// statefulOperation();
		useConcurrentCollectionsInParallelStreams();
	}

	/**
	 * The forEachOrdered() method displays the numbers in the stream sequentially, whereas the order
	 * of the elements in the data list is completely random. You can see that a stateful lambda
	 * expression, which modifies the data list in parallel, produces unpredictable results at
	 * runtime.
	 */
	private static void statefulOperation() {
		List<Integer> data = Collections.synchronizedList(new ArrayList<>());
		// List<Integer> data = new CopyOnWriteArrayList<>();
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13).parallelStream().map(i -> {
			data.add(i); // AVOID STATEFUL LAMBDA EXPRESSIONS!
			return i;
		}).forEachOrdered(i -> System.out.print(i + " "));

		System.out.println();
		for (Integer e : data) {
			System.out.print(e + " ");
		}
	}

	/**
	 * For an ArrayList object, the JVM internally manages a primitive array of the same type. As the
	 * size of the dynamic ArrayList grows, a new, larger primitive array is periodically required. If
	 * two threads both trigger the array to be resized at the same time, a result can be lost,
	 * producing the unexpected value shown here. As briefly mentioned earlier, and also discussed
	 * later in this chapter, the unexpected result of two tasks executing at the same time is a race
	 * condition.
	 */
	private static void useConcurrentCollectionsInParallelStreams() {
		List<Integer> data = new ArrayList<>();
		// List<Integer> data = new CopyOnWriteArrayList<>();
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13).parallelStream().map(i -> {
			data.add(i);
			return i;
		}).forEachOrdered(i -> System.out.print(i + " "));

		System.out.println();
		for (Integer e : data) {
			System.out.print(e + " ");
		}
	}
}
