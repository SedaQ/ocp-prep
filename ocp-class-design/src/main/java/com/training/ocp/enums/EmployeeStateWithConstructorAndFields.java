package com.training.ocp.enums;

/**
 * 
 * @author Pavel Šeda
 *
 */
public enum EmployeeStateWithConstructorAndFields {
	ACTIVE("Active employee") {
		public void printEmployees() {
			System.out.println("Karel, Pepa, Pavel");
		}
	},
	MATERNAL_LEAVE("Employee on maternal leave") {
		public void printEmployees() {
			System.out.println("Jaromira, Zdenka, Lenka");
		}
	},
	LEAVE_OF_ABSENCE("Employee on leave of absence") {
		public void printEmployees() {
			System.out.println("Milos, Tomas");
		}
	},
	TEST_TIME("Employee in test time period (3 months)") {
		public void printEmployees() {
			System.out.println("Martin, Michal");
		}
	};

	private String description;

	// must be private or default
	private EmployeeStateWithConstructorAndFields(String description) {
		this.description = description;
	}

	/**
	 * If enum contains abstract method than all items must override this
	 */
	abstract void printEmployees();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
