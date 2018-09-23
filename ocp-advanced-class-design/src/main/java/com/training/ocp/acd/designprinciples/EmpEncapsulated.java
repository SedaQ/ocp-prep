package com.training.ocp.acd.designprinciples;

/**
 * 
 * @author Pavel Seda
 *
 */
public class EmpEncapsulated {

	private int age;

	public void setAge(int age) {
		if (age < 0)
			throw new IllegalArgumentException("...");
		this.age = age;
	}

	public static void main(String[] args) {
		EmpEncapsulated emp = new EmpEncapsulated();
		emp.setAge(100);
	}

}
