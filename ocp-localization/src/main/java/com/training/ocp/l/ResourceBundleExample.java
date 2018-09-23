package com.training.ocp.l;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * 
 * ResourceBundle is working with property files (files with extension .properties). These files
 * consists of key-value pairs. This key value pair could be written in the following ways:
 * 
 * <pre>
 * <code>
		1) person.email=Some message
		2) person.email:Some message
		3) person.email Some message
 * </code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class ResourceBundleExample {

	public static void main(String[] args) {
		printResourceBundleStrings();

		System.out.println();

		loopThroughList();
	}

	/**
	 * Pay special attention that ResourceBundle is not instantiate using new keyword.
	 */
	private static void printResourceBundleStrings() {
		Locale localeUS = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale localeCZE = new Locale.Builder().setLanguage("cs").setRegion("CZ").build();

		// replace localeUS with localeCZE and check the result
		ResourceBundle rb = ResourceBundle.getBundle("person", localeUS);
		System.out.println(rb.getString("person.email"));
		System.out.println(rb.getString("person.password"));
	}

	private static void loopThroughList() {
		Locale localeCZE = new Locale.Builder().setLanguage("cs").setRegion("CZ").build();

		ResourceBundle rb = ResourceBundle.getBundle("person", localeCZE);
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> "key: " + k + " - Value: " + rb.getString(k)).forEach(System.out::println);
	}
}
