package com.training.ocp.staticfinal;

/**
 * 
 * Test: Add final and static keywords to name member variable and to
 * doSomething() method.
 * 
 * Static cannot be added to subclass method doSomething() independenctly
 * 
 * @author Pavel Seda
 *
 */
public abstract class Employee {

	String name = "something";

	void doSomething() {
	}
}

class Manager extends Employee {

	String name = "something";

	void doSomething() {
	}

}
