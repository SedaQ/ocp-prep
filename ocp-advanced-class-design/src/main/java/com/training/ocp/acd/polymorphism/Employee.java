package com.training.ocp.acd.polymorphism;

/**
 * 
 * Example showing virtual methods invocation with virtual methods.
 * 
 * Java looks for an overriden method rathen than necessarily using the one in
 * the class that the compiler says we have.
 * 
 * @author Pavel Šeda
 *
 */
public abstract class Employee {
	abstract void doMyJob();
}

class Manager extends Employee {
	/**
	 * must be public, protected or default (access modifier could not be more
	 * restrictive)
	 */
	public void doMyJob() {
		doSomething();
	}

	private void doSomething() {
		System.out.println("Manager is doing something");
	}
}

class Secretary extends Employee {
	protected void doMyJob() {
		prepareDocuments();
	}

	private void prepareDocuments() {
		System.out.println("Secretary is preparing documents.");
	}
}