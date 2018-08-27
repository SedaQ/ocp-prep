package com.training.ocp.overloadingoverriding;

import java.util.Arrays;

/**
 * 
 * What is the difference between varArgs and standard array? When to use which
 * one?
 * 
 * Result:
 * 
 * <pre>
 * <code>
 * 		public <T> void foo(T... params) { ... }
 * 
 * 		int[] arr = {1, 2, 3};
 * 
 * 		foo(arr); // passes an int[][] array containing a single int[] element
 * </code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class VarArgsVsArray {

	// public void doSomething(int... someArray) {
	//
	// }

	public void doSomething(int[] someArray) {
	}

	public static void main(String[] args) {
		VarArgsVsArray v = new VarArgsVsArray();
		int[] digits = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 4 };

		System.out.println(Arrays.asList(digits));
	}
}
