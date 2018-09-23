package com.training.ocp.l;

import java.util.Locale;

/**
 * 
 * @author Pavel Seda
 *
 */
public class LocaleExample {

	public static void main(String[] args) {
		defaultLocale();

		System.out.println();

		returningSpecificLocale();

		System.out.println();

		localeBuilder();
	}

	private static void defaultLocale() {
		Locale l = Locale.getDefault();
		System.out.println(l);
	}

	private static void returningSpecificLocale() {
		System.out.println(Locale.FRENCH);
		System.out.println(new Locale("en", "US"));
	}

	private static void localeBuilder() {
		Locale localeBuilder = new Locale.Builder().setLanguage("en").setRegion("US").build();
		System.out.println(localeBuilder);
	}
}
