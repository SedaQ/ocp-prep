package com.training.ocp.l;

import java.util.Arrays;
import java.util.Locale;

/**
 * This class prints available locales.
 * 
 * @author Pavel Seda
 *
 */
public class PrintAvailableLocales {

	/**
	 * Prints available locales. It is useful to set up appropriate messages.properties file name,
	 * e.g. messages_en_US.properties
	 * 
	 * en_US
	 * 
	 * en -> language; US -> country
	 * 
	 */
	public static void main(String[] args) {
		Locale[] locales = Locale.getAvailableLocales();
		Arrays.sort(locales, (l1, l2) -> l1.toString().compareTo(l2.toString()));
		for (Locale l : locales) {
			System.out.println(l.toString());
		}
	}

}
