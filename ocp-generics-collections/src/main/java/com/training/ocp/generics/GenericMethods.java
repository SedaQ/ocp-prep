package com.training.ocp.generics;

/**
 * Generic methods must include <T> or any other letter in the method signature.
 * 
 * @author Pavel Seda
 *
 */
public class GenericMethods {

	public static <T> void work(T t) {
	}

	public static <T> T sound(T t) {
		return t;
	}

	/**
	 * Compilation error due to type erasure Object is the same as T
	 * 
	 * @param obj
	 */
	// public static void work(Object obj) {}

	// This example does not compile it must include <T> before return type
	// public static T wrongGenericMethod(T t) {
	// return t;
	// }

	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		GenericMethods.<String>work("hello");
		GenericMethods.work(1);
		GenericMethods.<String[]>work(new String[5]);
	}
}
