package com.training.ocp.additions;

import java.util.Arrays;
import java.util.List;

/**
 * Loop through collection using forEach method.
 * 
 * @author Pavel Seda
 *
 */
public class LoopThroughCollection {

	public static void main(String[] args) {
		loopingThroughList();

		System.out.println();

		loopingThroughListMethodReference();
	}

	private static void loopingThroughList() {
		List<String> myList = Arrays.asList("string1", "string2", "string3");
		myList.forEach(listElement -> System.out.println(listElement));
	}

	private static void loopingThroughListMethodReference() {
		List<String> myList = Arrays.asList("string1", "string2", "string3");
		myList.forEach(System.out::println);
	}

}
