package com.training.ocp.acd.designprinciples;

/**
 * 
 * @author Pavel Seda
 *
 */
public class EmpNotEncapsulated {

	public int age;

	public static void main(String[] args) {
		EmpNotEncapsulated emp = new EmpNotEncapsulated();
		emp.age = -100;
	}
}
