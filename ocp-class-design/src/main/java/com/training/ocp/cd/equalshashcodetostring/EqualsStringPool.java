package com.training.ocp.cd.equalshashcodetostring;

/**
 * 
 * String has its own implementation of equals method which checks if values are
 * the same, while StringBuilder uses equals method provided by Objects which
 * basically checks if two references are the same.
 * 
 * @author Pavel Šeda
 *
 */
public class EqualsStringPool {

	public static void main(String[] args) {
		String string1 = new String("employee");
		String string2 = "employee";
		String string3 = "employee";
		System.out.println(string1 == string2); // false
		System.out.println(string2 == string3); // string pool -> true

		String s1 = new String("employee");
		String s2 = new String("employee");
		System.out.println(s1.equals(s2)); // true

		StringBuilder sb1 = new StringBuilder("employee");
		StringBuilder sb2 = new StringBuilder("employee");

		System.out.println(sb1.equals(sb2)); // false
	}
}
