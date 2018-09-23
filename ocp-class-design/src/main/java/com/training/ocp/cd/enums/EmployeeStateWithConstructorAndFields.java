package com.training.ocp.cd.enums;

/**
 * 
 * @author Pavel Šeda
 *
 */
public enum EmployeeStateWithConstructorAndFields {
	ACTIVE("Active employee") {
		public void returnEmployees() {
			System.out.println("Karel, Pepa, Pavel");
		}
	},
	MATERNAL_LEAVE("Employee on maternal leave") {
		public void returnEmployees() {
			System.out.println("Jaromira, Zdenka, Lenka");
		}
	},
	LEAVE_OF_ABSENCE("Employee on leave of absence") {
		public void returnEmployees() {
			System.out.println("Milos, Tomas");
		}
	},
	TEST_TIME("Employee in test time period (3 months)") {
		public void returnEmployees() {
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
	abstract void returnEmployees();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
