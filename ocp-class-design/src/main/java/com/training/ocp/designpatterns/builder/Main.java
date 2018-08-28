package com.training.ocp.designpatterns.builder;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee.EmployeeBuilder(2, "karel@seznam.cz")
									.setAge(10)
									.setHobbies("climbing")
									.setNickname("Karlos")
									.setNote("the best")
									.build();
		
		System.out.println(employee);
	}
}
