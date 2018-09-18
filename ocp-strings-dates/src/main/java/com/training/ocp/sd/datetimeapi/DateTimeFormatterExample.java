package com.training.ocp.sd.datetimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * Formatter for printing and parsing date-time objects.
 * 
 * @author Pavel Seda
 *
 */
public class DateTimeFormatterExample {

	public static void main(String[] args) {
		ofPatternExample();

		System.out.println();

		isoDateExample();

	}

	private static void ofPatternExample() {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String text = date.format(formatter);
		LocalDate parsedDate = LocalDate.parse(text, formatter);

		System.out.println(parsedDate);
	}

	private static void isoDateExample() {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		String text = date.format(formatter);
		LocalDate parsedDate = LocalDate.parse(text, formatter);

		System.out.println(parsedDate);
	}
}
