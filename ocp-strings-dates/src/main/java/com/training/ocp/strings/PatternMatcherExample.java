package com.training.ocp.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * The java.util.regex.Pattern.compile(String regex) method compiles the given
 * regular expression into a pattern.
 * 
 * 
 * 
 * Difference between matches() and find() methods.
 * 
 * public boolean matches()
 * 
 * Attempts to match the entire region against the pattern. If the match
 * succeeds then more information can be obtained via the start, end, and group
 * methods.
 * 
 * public boolean find()
 * 
 * Attempts to find the next subsequence of the input sequence that matches the
 * pattern.
 * 
 * 
 * @author Pavel Seda
 *
 */
public class PatternMatcherExample {

	private static final String TEST_STRING = "Hello my name is: John Doe";
	private static final String PATTERN = ".*:\\s(.*)";

	public static void main(String[] args) {
		patternMatcher();

		System.out.println();

		stringMatches();

		stringMatchesVsPatternMatcher();
	}

	private static void patternMatcher() {
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(TEST_STRING);
		if (matcher.find()) {
			System.out.println("Found value for group(0): " + matcher.group(0));
			System.out.println("Found value for group(1): " + matcher.group(1));
		}
	}

	private static void stringMatches() {
		if (TEST_STRING.matches(PATTERN)) {
			System.out.println(TEST_STRING);
		}
	}

	/**
	 * String.matches("\\d+") is internally converted to:
	 * Pattern.compile("\\d+").matcher(s).matches())
	 */
	private static void stringMatchesVsPatternMatcher() {
		String[] myStringList = { "34hello", "234hello" };
		for (String s : myStringList)
			if (s.matches(PATTERN)) {
				// do something
			}
		// is equivalent to:
		for (String s : myStringList)
			if (Pattern.compile("\\d+").matcher(s).matches()) {
				// doSomething()
			}
	}

}
