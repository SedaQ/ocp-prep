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

	// This example does not compile it must include <T> before return type
	// public static T wrongGenericMethod(T t) {
	// return t;
	// }

}
