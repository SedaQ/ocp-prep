package com.training.ocp.l;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ResourceBundle in Java class instead of property files.
 * 
 * @author Pavel Seda
 *
 */
public class Person_cs_CZ extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] {{"person.email", new PersonEmailValidator()}, {"person.password", "something"}};
	}

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.training.ocp.l.Person", new Locale("cs", "CZ"));
		System.out.println(rb.getObject("person.email"));
	}

	private static class PersonEmailValidator {

		private String emailValidatorRegex = "someRegex";

		@Override
		public String toString() {
			return "PersonEmailValidator [emailValidatorRegex=" + emailValidatorRegex + "]";
		}

	}

}
