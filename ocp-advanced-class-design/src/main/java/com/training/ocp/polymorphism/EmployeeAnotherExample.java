package com.training.ocp.polymorphism;

/**
 * 
 * @author Pavel Šeda
 *
 */
abstract class EmployeeExample {
	public void workFor() {
		work();
	}

	public void work() {
		System.out.println("Standard working routines.");
	}
}

class DevOps extends EmployeeExample {
	public void work() {
		System.out.println("Working on continuous delivery");
	}
}

class Marketer extends EmployeeExample {
	public void work() {
		System.out.println("Creating marketing strategy.");
	}
}

public abstract class EmployeeAnotherExample {

	public static void main(String[] args) {
		EmployeeExample employee = new DevOps();
		employee.workFor();
	}
}
