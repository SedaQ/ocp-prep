package com.training.ocp.cd.overloadingoverriding;

/**
 * Overriding occurs only when the method signature (method name and the parameter list) is the
 * same.
 * 
 * Overrloading occurs when method parameters vary by type and/or number. When multiple overloaded
 * methods are present, Java looks for the closest match first. It tries to find the following.
 * 
 * @author Pavel Seda
 *
 */
public class Manager extends Employee {

	public void doSomething() {
		System.out.println("doSomething1");
	}

	public void doSomething(int someInput) {
		System.out.println("doSomething2: " + someInput);
	}

	public <T> void doSomething(T someInput) {
		System.out.println("doSomething3: " + someInput);
	}

	public int dosomething() throws Exception {
		System.out.println("doSomething4:");
		return 0;
	}

	// public int doSomething() throws Exception {
	// return 0;
	// }

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.doSomething();
	}
}
