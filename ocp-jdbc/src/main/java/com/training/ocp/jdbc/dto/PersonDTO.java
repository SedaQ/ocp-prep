package com.training.ocp.jdbc.dto;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PersonDTO {

	private long id;
	private int age;
	private LocalDate birthday;
	private String email;
	private String firstName;
	private String nickName;
	private char[] pwd;
	private String surname;

	public PersonDTO() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public char[] getPwd() {
		return pwd;
	}

	public void setPwd(char[] pwd) {
		this.pwd = pwd;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", age=" + age + ", birthday=" + birthday + ", email=" + email + ", firstName=" + firstName
				+ ", nickName=" + nickName + ", pwd=" + new String(pwd) + ", surname=" + surname + "]";
	}

}
