package com.training.ocp.cd.overloadingoverriding;

/**
 * Overriding occurs only when the method signature (method name and the
 * parameter list) is the same.
 * 
 * Overrloading occurs when method parameters vary by type and/or number. When
 * multiple overloaded methods are present, Java looks for the closest match
 * first. It tries to find the following.
 * 
 * @author Pavel Seda
 *
 */
public class Manager extends Employee {

	public void doSomething() {
		// ...
	}

	public void doSomething(int someInput) {
		// something
	}

	public <T> void doSomething(T someInput) {
		// something
	}

	public int dosomething() throws Exception {
		return 0;
	}

	// public int doSomething() throws Exception {
	// return 0;
	// }
}
