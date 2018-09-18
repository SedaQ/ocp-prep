package com.training.ocp.acd.designprinciples;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class ChildFooEncapsulated extends AFooEncapsulated {

	private int age;

	public ChildFooEncapsulated(long id, String email) {
		super(id, email);
	}

	public long getId() {
		return super.getId();
	}

	public void setId(long id) {
		super.setId(id);
	}

	public String getEmail() {
		return super.getEmail();
	}

	public void setEmail(String email) {
		super.setEmail(email);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
