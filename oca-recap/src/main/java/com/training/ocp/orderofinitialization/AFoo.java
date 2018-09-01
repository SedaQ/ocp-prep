package com.training.ocp.orderofinitialization;

/**
 * 
 * @author Pavel Seda
 *
 */
public class AFoo {

	private String s;

	public AFoo() {
		System.out.println("Class AFoo is called.");
	}

	public AFoo(String s) {
		this.s = s;
		System.out.println("Class AFoo is called.");
	}

	public static void main(String[] args) {
		AFoo a = new CFoo();
	}
}

class BFoo extends AFoo {

	static {
		System.out.println("Static block initialization in class BFoo.");
	}
	{
		System.out.println("Instance block initialization in class BFoo.");
	}

	public BFoo() {
		System.out.println("Class BFoo is called.");
	}

	public BFoo(String s) {
		super(s);
		System.out.println("Class BFoo is called.");
	}
}

class CFoo extends BFoo {
	public CFoo() {
		System.out.println("Class CFoo is called.");
	}
}
