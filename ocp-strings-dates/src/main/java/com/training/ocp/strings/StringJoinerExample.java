package com.training.ocp.strings;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 
 * StringJoiner (since Java 8) is used to construct a sequence of characters
 * separated by a delimiter and optionally starting with a supplied prefix and
 * ending with a supplied suffix.
 * 
 * 
 * Collectors.joining() internally uses StringJoiner
 * 
 * @author Pavel Seda
 *
 */
public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		sj.add("George").add("Sally").add("Fred");
		System.out.println(sj.toString());

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		String commaSeparatedNumbers = numbers.stream().map(i -> i.toString()).collect(Collectors.joining(", "));
		System.out.println(commaSeparatedNumbers);

	}

}
