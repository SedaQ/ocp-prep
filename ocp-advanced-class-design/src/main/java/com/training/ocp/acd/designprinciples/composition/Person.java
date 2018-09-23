package com.training.ocp.acd.designprinciples.composition;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Person {

	// composition has-a relationship
	private Job job;

	public Person() {
		this.job = new Job();
		job.setSalary(1000L);
	}

	public long getSalary() {
		return job.getSalary();
	}

}
