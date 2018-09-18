package com.training.ocp.sd.datetimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoUnit;

/**
 * 
 * Contains just a date no time and no time zone. A good example of LocalDate is
 * your birthday this year. It is your birthday for a full day, regardless of
 * what time it is.
 * 
 * 
 * @author Pavel Seda
 *
 */
public class LocalDateExample {

	public static void main(String[] args) {
		init();
		localDateMethods();
	}

	private static void init() {
		LocalDate ld = LocalDate.now();
		LocalDate ld2 = Year.of(2019).atMonth(Month.JANUARY).atDay(4);
		LocalDate ld3 = LocalDate.of(2019, Month.JANUARY, 4);

		System.out.println(ld);
		System.out.println(ld2);
		System.out.println(ld3);
	}

	private static void localDateMethods() {
		LocalDate ld = LocalDate.now();

		ld.plusDays(1); // plusDays, plusWeeks, plusMonths, plusYears
		ld.minusWeeks(3); // minusDays, minusWeeks, minusMonths, minusYears

		// not supported to work with seconds only days, weeks, months, years
		// ld.plus(5, ChronoUnit.SECONDS);

		ld.plus(5, ChronoUnit.WEEKS);
	}

}
