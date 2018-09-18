package com.training.ocp.ea.assertions;

/**
 * 
 * Enabling or disabling assertion is possible in the following ways:
 * 
 * <pre>
	  <code>
		java –enableassertions MyClass
		java –ea MyClass
		java –ea:<package name>...  // enable assertions in the given package
		java –ea:... //enable assertions in the given unnamed package
		java –da MyClass // disable assertion
		java –da<package name>... // disable assertions in the given package
		java –da... // disable assertions in the given unnamed package
	  </code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class AssertExample {

	public static void main(String[] args) {
		int i = -10;
		if (i < 0) {
			// if negative value, convert into positive value
			i = -i;
		}
		System.out.println("the value of i is: " + i);
		// at this point the assumption is that i cannot be negative;
		// assert this condition since its an assumption that will always hold
		assert (i >= 0) : "impossible: i is negative!";
	}
}
