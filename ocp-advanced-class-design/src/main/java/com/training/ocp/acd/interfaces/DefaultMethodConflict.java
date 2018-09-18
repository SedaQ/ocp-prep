package com.training.ocp.acd.interfaces;

/**
 * Example of conflict with default methods.
 *
 * @author Pavel Šeda
 * 
 */
interface A {
	default void someMethod() {
		// something
	}
}

interface B {
	default void someMethod() {
		// something else
	}
}

public class DefaultMethodConflict implements A, B {

	@Override
	public void someMethod() {
		A.super.someMethod();
	}

}
