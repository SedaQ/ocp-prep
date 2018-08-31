package com.training.ocp.corejavaapis;

/**
 * 
 * @author Pavel Seda
 *
 */
public class StringExample {

	public static void main(String[] args) {
		stringEquality();

		System.out.println();

		stringConcatenation();
	}

	private static void stringEquality() {
		String s1 = "Fluffy";
		String s2 = new String("Fluffy");
		String s3 = "Fluffy";

		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s3); // true
	}

	private static void stringConcatenation() {
		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c"); // 3c
	}
}
