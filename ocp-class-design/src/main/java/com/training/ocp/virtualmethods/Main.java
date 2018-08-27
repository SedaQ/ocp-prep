package com.training.ocp.virtualmethods;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class Main {

	public static void main(String[] args) {
		Employee employee = new Secretary();
		doEmployeeJob(employee);
	}

	public static void doEmployeeJob(Employee employee) {
		employee.doMyJob();
	}

}
