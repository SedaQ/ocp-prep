package com.training.ocp.designpatterns.builder;

/**
 * Builder pattern is used in case that we have a lot of parameters in class.
 * With builder pattern we prevent creating too many constructors with different
 * fields.
 * 
 * @author Pavel Šeda
 *
 */
public class Employee {

	private long id;
	private String email;
	private String nickname;
	private int age;
	private String hobbies;
	private String note;

	public Employee(EmployeeBuilder employeeBuilder) {
		this.id = employeeBuilder.id;
		this.email = employeeBuilder.email;
		this.nickname = employeeBuilder.nickname;
		this.age = employeeBuilder.age;
		this.hobbies = employeeBuilder.hobbies;
		this.note = employeeBuilder.note;
	}

	public static class EmployeeBuilder {
		// required attributes
		private long id;
		private String email;
		// optional attributes
		private String nickname;
		private int age;
		private String hobbies;
		private String note;

		public EmployeeBuilder(long id, String email) {
			this.id = id;
			this.email = email;
		}

		public EmployeeBuilder setNickname(String nickname) {
			this.nickname = nickname;
			return this;
		}

		public EmployeeBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilder setHobbies(String hobbies) {
			this.hobbies = hobbies;
			return this;
		}

		public EmployeeBuilder setNote(String note) {
			this.note = note;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", email=").append(email).append(", nickname=")
				.append(nickname).append(", age=").append(age).append(", hobbies=").append(hobbies).append(", note=")
				.append(note).append("]");
		return builder.toString();
	}

}
