package com.training.ocp.io.emp;

import java.io.Serializable;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Employee implements Serializable {

	private String email;
	private String name;
	private int age;

	public Employee() {}

	public Employee(String email, String name, int age) {
		super();
		this.email = email;
		this.name = name;
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [email=" + email + ", name=" + name + ", age=" + age + "]";
	}

}
