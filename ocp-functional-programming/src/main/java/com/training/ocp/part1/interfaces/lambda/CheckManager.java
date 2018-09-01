package com.training.ocp.part1.interfaces.lambda;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class CheckManager {

	public CheckManager() {
	}

	public boolean checkManager(Employee employee, MyPredicateFunctIface<Employee> employeePredicate) {
		if (employeePredicate.test(employee)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		CheckManager te = new CheckManager();
		Employee y1 = new Employee(3, "pavelseda@email.cz", true);

		boolean manager = te.checkManager(y1, employee -> employee.isManager());

		System.out.println("Given employee is manager: " + manager);
	}

}
