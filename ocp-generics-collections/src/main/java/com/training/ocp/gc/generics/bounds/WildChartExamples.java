package com.training.ocp.gc.generics.bounds;

import java.io.*;
import java.util.*;

/**
 * 
 * Why we need Lower bound? -> Unbounded generics and Upper bounded (List<?
 * extends Object>) are immutable, so it is not possible to modify particular
 * collection. With lowerBounded it is possible to modify (add, remove elements
 * etc.).
 * 
 * @author Pavel Seda
 *
 */
public class WildChartExamples {

	public static void main(String[] args) {
		unboundedWildcardExample();
		upperBoundedExample();
	}

	private static void unboundedWildcardExample() {
		List<?> l = new ArrayList<String>();
	}

	private static void upperBoundedExample() {
		List<? extends Number> nums1 = new ArrayList<Number>();
		List<? extends Number> nums2 = new ArrayList<Integer>();
		List<? extends Number> nums3 = new ArrayList<>();

		// not possible to modify the list..
		// nums1.add(new Integer(5));
	}

	/**
	 * Why we need lower bound?
	 */
	private static void lowerBoundExample() {
		List<? super Integer> nums1 = new ArrayList<Integer>();
		List<? super Integer> nums2 = new ArrayList<Number>();
		List<? super Integer> nums3 = new ArrayList<Object>();

		// possible to modify the list
		nums1.add(new Integer(1));

		// Could be: List<IOException>, List<Exception> or List<Object>
		List<? super IOException> exceptions = new ArrayList<Exception>();
		// Why this one does not compile?
		// exceptions.add(new Exception());
		exceptions.add(new IOException());
		exceptions.add(new FileNotFoundException());
	}

}
