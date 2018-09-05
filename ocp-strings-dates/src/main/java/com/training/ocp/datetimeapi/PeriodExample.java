package com.training.ocp.datetimeapi;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * A date-based amount of time in the ISO-8601 calendar system, such as '2
 * years, 3 months and 4 days'.This class models a quantity or amount of time in
 * terms of years, months and days.
 * 
 * @author Pavel Seda
 *
 */
public class PeriodExample {

	public static void main(String[] args) {
		init();
		methods();
	}

	/**
	 * See differences in what is printed.
	 */
	private static void init() {
		Period p = Period.of(1, 3, 6);
		System.out.println(p); // P1Y3M6D

		Period p2 = Period.ofDays(10);
		System.out.println(p2); // P10D

	}

	private static void methods() {
		// Period of 3 days only - chainining does not work as expected
		Period p = Period.ofYears(1).ofDays(3);
		System.out.println(p);

		Period p2 = Period.between(LocalDate.now(), LocalDate.now().plusDays(2));
		System.out.println(p2);

	}

}
