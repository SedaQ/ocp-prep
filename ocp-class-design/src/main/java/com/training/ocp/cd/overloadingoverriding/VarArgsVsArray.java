package com.training.ocp.cd.overloadingoverriding;

import java.util.Arrays;

/**
 * 
 * What is the difference between varArgs and standard array? When to use which one?
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

	public void doSomething(int[] someArray) {}

	public static void main(String[] args) {
		VarArgsVsArray v = new VarArgsVsArray();
		int[] digits = {3, 1, 4, 1, 5, 9, 2, 6, 5, 4};
		System.out.println(Arrays.asList(digits));
		System.out.println(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 4));

		min();
	}

	// The WRONG way to use varargs to pass one or more arguments!
	static int min(int... args) {
		if (args.length == 0)
			throw new IllegalArgumentException("Too few arguments");
		int min = args[0];
		for (int i = 1; i < args.length; i++)
			if (args[i] < min)
				min = args[i];
		return min;
	}
}
