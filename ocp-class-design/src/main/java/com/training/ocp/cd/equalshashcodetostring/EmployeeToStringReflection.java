package com.training.ocp.cd.equalshashcodetostring;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ToString method should be used in all data classes (DTO, DAO etc.).
 * 
 * To use reflection with toString you have to include apache commons library (or any other if you
 * know).
 * 
 * <pre>
	<code>
		<dependency>
		<groupId>org.apache.commons</groupId>
		<artifactId>commons-lang3</artifactId>
		<version>3.8</version>
		</dependency>
	</code>
 * </pre>
 * 
 * @author Pavel Šeda
 *
 */
public class EmployeeToStringReflection {

	private String name;
	private int salary;

	public EmployeeToStringReflection(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
