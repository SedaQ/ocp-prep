package com.training.ocp.cd.iinstanceof;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Employee {

	public static void main(String[] args) {
		Employee e1 = new Manager();
		boolean b1 = e1 instanceof Manager; // true
		boolean b2 = e1 instanceof Employee; // true
		boolean b3 = e1 instanceof Secretary; // false
		boolean b4 = e1 instanceof Object; // all classes inherits from Object class
		Employee e2 = null;
		boolean b5 = e2 instanceof Object; // false

		Manager m1 = new Manager();
		// this one is interesting it does not compile! compiler knows that this one is
		// not possible to occur
		// boolean b6 = m1 instanceof Secretary;

		// the compiler allows this because in future it could implement this interface
		Employee e3 = new Employee();
		boolean b7 = e3 instanceof SuperEmployee;
	}

	/**
	 * Example usage of <code>instanceof</code> operator. Too call particular method we need to
	 * downcast the object and thus we need to check if we could do it safely with instanceof
	 * operator.
	 * 
	 * @param employee
	 */
	void makeMyJob(Employee employee) {
		if (employee instanceof Manager) {
			((Manager) employee).increaseEmployeeSalary();
		} else if (employee instanceof Secretary) {
			((Secretary) employee).prepareDocuments();
		} else {
			throw new RuntimeException("Unsupported employee operation.");
		}
	}
}

class Manager extends Employee {

	void increaseEmployeeSalary() {}
}

class Secretary extends Employee {

	void prepareDocuments() {}
}

interface SuperEmployee {
}
