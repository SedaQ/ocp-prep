package com.training.ocp.strings;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 
 * @author Pavel Seda
 *
 */
public class TasksExample {

	private static String line = "My name is Pavel and my surname is Seda.";

	public static void main(String[] args) {
		findNameInString();

		formatString();

		joiningNums();

		collatorExample();
	}

	private static void findNameInString() {
		Pattern p = Pattern.compile("My name is (\\w+).* my surname is (\\w+)");
		Matcher m = p.matcher(line);
		if (m.find()) {
			System.out.println(m.group(1) + " " + m.group(2));
		}
	}

	private static void formatString() {
		String name = "John Doe";
		int age = 55;
		System.out.println(String.format("%s is %d years old", name, age));
	}

	private static void joiningNums() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		String commaSeparatedNumbers = numbers.stream().map(i -> i.toString())
				.collect(Collectors.joining(",", "[", "]"));
		System.out.println(commaSeparatedNumbers);
	}

	private static void collatorExample() {
		List<String> strList = Arrays.asList("Ahoj", "Pepo", "Z", "1", "b");
		Collator c = Collator.getInstance(Locale.ENGLISH);
		Collections.sort(strList, c);
		strList.forEach(System.out::print);
	}
}
