package com.training.ocp.cd.overloadingoverriding;

/**
 * 
 * @author Pavel Seda
 *
 */
public class OverloadingExample {

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
		OverloadingExample ex = new OverloadingExample();
		ex.doSomething();
	}

}
