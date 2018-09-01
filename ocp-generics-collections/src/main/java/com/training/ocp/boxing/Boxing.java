package com.training.ocp.boxing;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Boxing {

	public static void main(String[] args) {
		unboxing();
	}

	private static void unboxing() {
		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6);
		for (Integer i : myList) {
			int num = i; // unboxing
			System.out.print(num + " ");
		}
	}
}
