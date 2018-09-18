package com.training.ocp.fp.streams.tasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PuttingItAllTogetherStreamTasks {

	public static void main(String[] args) {
		usingFlatMap();

		onlyNumbersLimitedToTwoElements();

		System.out.println();

		getRandomWordUsingChainedFilter();

		System.out.println();

		convertStringsToIntegers();

		System.out.println();

		findMinAndMax();
	}

	/**
	 * Create two List of Strings and initialize them with some values, e.g.
	 * ("a","b","c") and ("d","e","f"); and convert them to Stream<String>
	 */
	private static void usingFlatMap() {
		List<String> s1 = Arrays.asList("a", "b", "c");
		List<String> s2 = Arrays.asList("d", "e", "f");
		Stream<String> result = Stream.of(s1, s2).flatMap(l -> l.stream());
	}

	private static void useCount() {
		List<String> strs = generateData();
		long result = strs.stream().count();
		System.out.println(result);
	}

	/**
	 * Use distinct and find min and max value.
	 */
	private static void findMinAndMax() {
		List<Double> myList = Arrays.asList(3.4, 5.3, 1.0, 1.0, 8.9, 22.1, 11.3, 123.4, 110.2, 10.1);
		Optional<Double> myMinOpt = myList.stream().distinct().min((n1, n2) -> n1.compareTo(n2));
		Optional<Double> myMaxOpt = myList.stream().distinct().max((n1, n2) -> n1.compareTo(n2));

		System.out.println("min value: " + myMinOpt.get());
		System.out.println("max value: " + myMaxOpt.get());
	}

	/**
	 * Use distinct and find min and max value.
	 */
	private static void findMinAndMaxWithGenericsList() {
		List<? extends Number> myListGen = Arrays.asList(3.4, 5.3, 1.0, 1.0, 8.9, 22.1, 11.3, 123.4, 110.2, 10.1);
		// TO BE IMPLEMENTED
	}

	/**
	 * Filter data to contains only numbers then limit this only to 2 elements and
	 * print it.
	 */
	private static void onlyNumbersLimitedToTwoElements() {
		List<String> strs = generateData();
		strs.stream().filter(s -> s.matches("-?\\d+(\\.\\d+)?")).sorted().limit(2).forEach(System.out::println);
	}

	/**
	 * Filter data to contains only strings starting with "R" letter and ends with
	 * "m" letter.
	 */
	private static void getRandomWordUsingChainedFilter() {
		List<String> strs = generateData();
		strs.stream().filter(s -> s.startsWith("R")).filter(s -> s.endsWith("m")).forEach(System.out::println);
	}

	/*
	 * Filter data to contains only numbers and then convert them to Integer,
	 * collect the result to the List of Integers (consider boxing performance issue
	 * Integer.parseInt() vs Integer.valueOf())
	 */
	private static void convertStringsToIntegers() {
		List<String> strs = generateData();
		List<Integer> ints = strs.stream().filter(s -> s.matches("-?\\d+(\\.\\d+)?")).map(num -> Integer.valueOf(num))
				.sorted().collect(Collectors.toCollection(ArrayList::new));
		ints.forEach(System.out::println);
	}

	/**
	 * Implement reduce function using the following method signature:
	 * 
	 * <pre>
	 * <code>
	 *  Optional<T> reduce(BinaryOperator<T> accumulator)
	 * </code>
	 * </pre>
	 */
	private static void useReductionOptional() {
		Stream<String> stream = Stream.of("O", "C", "P");
		Optional<String> str = stream.reduce((s, c) -> s + c);
		if (str.isPresent()) {
			System.out.println(str.get());
		} else {
			System.out.println("ocp is not present");
		}
	}

	/**
	 * Implement reduce function using the following method signature:
	 * 
	 * <pre>
	 * <code>
	 *  T reduce(T identity, BinaryOperator<T> accumulator)
	 * </code>
	 * </pre>
	 */
	private static void useReductionIdentity() {
		Stream<String> stream = Stream.of("O", "C", "P");
		String str = stream.reduce("", (s, c) -> s + c);
		System.out.println(str);
	}

	private static List<String> generateData() {
		List<String> strs = new ArrayList<>();
		strs.add("one");
		strs.add("two");
		strs.add("three");
		strs.add("3");
		strs.add("2");
		strs.add("1");
		strs.add("Pepa");
		strs.add("Tomas");
		strs.add("Random");
		strs.add("Karel");
		strs.add("OCP");
		strs.add("OCA");
		return strs;
	}
}
