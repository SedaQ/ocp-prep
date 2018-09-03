package com.training.ocp.buildinfunctionalinterfaces;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Employee {

	private long id;
	private String name;
	private String email;
	private int age;
	private String note;
	private String position;

	public Employee(long id, String name, String email, int age, String note, String position) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.note = note;
		this.position = position;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", note=" + note
				+ ", position=" + position + "]";
	}

}
