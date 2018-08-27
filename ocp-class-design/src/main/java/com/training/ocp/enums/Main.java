package com.training.ocp.enums;

/**
 * Enums could be used in switch statements.
 * 
 * @author Pavel Šeda
 *
 */
public class Main {

	public static void main(String[] args) {
		EmployeeState es = EmployeeState.ACTIVE;
		System.out.println(EmployeeState.ACTIVE);
		System.out.println(es == EmployeeState.ACTIVE);

		System.out.println();
		loopingThroughEnum(es);

		EmployeeState es2 = EmployeeState.valueOf("ACTIVE");
		// EmployeeState es3 = EmployeeState.valueOf("active"); // this one will throw
		// IllegalArgumentException
	}

	public static void loopingThroughEnum(EmployeeState employeeState) {
		for (EmployeeState es : EmployeeState.values()) {
			System.out.println(es.name() + " " + es.ordinal());
		}
	}

	public static void enumInSwitchStatement(EmployeeState employeeState) {
		switch (employeeState) {
		// case 0: // does not compile
		case ACTIVE: // do not call EmployeeState.ACTIVE
			System.out.println("Active employee...");
			break;
		case MATERNAL_LEAVE:
			System.out.println("Employee on maternal leave");
			break;
		}
	}
}
