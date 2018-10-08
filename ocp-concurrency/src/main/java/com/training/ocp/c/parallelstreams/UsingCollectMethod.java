package com.training.ocp.c.parallelstreams;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class UsingCollectMethod {

	public static void main(String[] args) {
		collect();
		collect2();
	}

	private static void collect() {
		Stream<String> collectParallel = Stream.of("pavel", "peters", "karel").parallel();
		ConcurrentMap<Integer, Object> map =
				collectParallel.collect(Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
		System.out.println(map); // {5=karel,pavel 6=peters}
		System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap
	}

	/**
	 * The key to applying parallel reductions is to encourage the JVM to take advantage of the
	 * parallel structures, such as using a groupingByConcurrent() collector on a parallel stream
	 * rather than a groupingBy() collector. By encouraging the JVM to take advantage of the parallel
	 * processing, we get the best possible performance at runtime.
	 */
	private static void collect2() {
		Stream<String> collectParallel = Stream.of("pavel", "peters", "karel").parallel();
		ConcurrentMap<Integer, List<String>> map = collectParallel.collect(Collectors.groupingByConcurrent(String::length));
		System.out.println(map); // {5=[pavel, karel], 6=[peters]}
	}
}
