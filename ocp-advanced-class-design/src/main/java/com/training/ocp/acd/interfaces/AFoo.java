package com.training.ocp.acd.interfaces;

/**
 * 
 * @author Pavel Šeda
 *
 */
public interface AFoo {

	public static final int AFOO_CONSTANT = 100_000;

	void print() throws Exception;

	default void sing() {
		System.out.println("This is example of default method in the interface");
	}

	static void song() {
		System.out.println("This is example of static method in the interface");
	}
}
