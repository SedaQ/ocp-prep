package com.training.ocp.cd.equalshashcodetostring;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class MainToString {

	public static void main(String[] args) {
		EmployeeToStringLombok employeeToStringLombok = new EmployeeToStringLombok("Pavel Seda", 100_000);
		System.out.println(employeeToStringLombok);
	}
}
