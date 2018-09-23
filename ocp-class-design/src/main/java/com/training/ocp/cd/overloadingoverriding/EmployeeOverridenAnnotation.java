package com.training.ocp.cd.overloadingoverriding;

/**
 * 
 * @author Pavel Seda
 *
 */
public class EmployeeOverridenAnnotation {

	void increaseSalary() {}
}

class ManagerOverridenAnnotation extends EmployeeOverridenAnnotation {

	/**
	 * This annotation is type of meta-data about
	 */
	@Override
	void increaseSalary() {}

	/**
	 * In the exam <code> @Override </code> annotation is not used frequently, so please pay special
	 * attention on that topic.
	 * 
	 * @param oldSalary
	 */
	// @Override
	void increaseSalary(int oldSalary) { // does not compile if @Override is included
	}

}
