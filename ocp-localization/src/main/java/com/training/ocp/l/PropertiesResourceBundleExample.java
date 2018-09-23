package com.training.ocp.l;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PropertiesResourceBundleExample {

	public static void main(String[] args) {
		addKeyAndValuesToProperties();
	}

	private static void addKeyAndValuesToProperties() {
		Properties props = new Properties();
		Locale localeCZE = new Locale.Builder().setLanguage("cs").setRegion("CZ").build();
		ResourceBundle rb = ResourceBundle.getBundle("person", localeCZE);
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));

		System.out.println(props.getProperty("person.email"));
		System.out.println(props.getProperty("fakeProperty", "You have to do something..."));
	}
}
