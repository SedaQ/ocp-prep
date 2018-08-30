package com.training.ocp.interfaces.lambda;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class CheckManager {

	public CheckManager() {
	}

	public boolean isManager(Employee employee, MyPredicateFunctIface<Employee> employeePredicate) {
		if (employeePredicate.test(employee)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		CheckManager te = new CheckManager();
		Employee y1 = new Employee(3, "pavelseda@email.cz", true);

		boolean isManager = te.isManager(y1, employee -> employee.isManager());

		System.out.println("Given employee is manager: " + isManager);
	}

}
