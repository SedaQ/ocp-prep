package com.training.ocp.generics;

import java.util.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class WhatIsNotAllowed<T> {

	/**
	 * Create a static variable as a generic type parameter
	 */
	// private static T data;

	/**
	 * Use a primitive type as a generic type parameter
	 */
	// private List<int> listofInts;

	/**
	 * Call the constructor. new T() is not allowed because at runtime it would be
	 * new Object().
	 */
	// private T data = new T();

	/**
	 * Call instanceof
	 */
	// private List<String> strArray = new ArrayList<>();
	// private boolean test = strArray instanceof List<T>;

}
