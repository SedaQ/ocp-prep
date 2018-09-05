package com.training.ocp.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoUnit;

/**
 * Contains both a date and time but no time zone. A good example of
 * LocalDateTime is “the stroke of midnight on New Year’s Eve.” Midnight on
 * January 2 isn’t nearly as special, making the date relatively unimportant,
 * and clearly an hour after midnight isn’t as special either.
 * 
 * @author Pavel Seda
 *
 */
public class LocalDateTimeExample {

	public static void main(String[] args) {
		init();
		localDateTimeMethods();
	}

	private static void init() {
		LocalDateTime ldt = LocalDateTime.now(); // 2018-09-05T16:24:31.483
		LocalDateTime ldt2 = Year.of(2019).atMonth(Month.APRIL).atDay(20).atTime(5, 3); // 2019-04-20T05:03
		LocalDateTime ldt3 = LocalDateTime.of(LocalDate.now(), LocalTime.now()); // 2018-09-05T16:24:31.494
		System.out.println(ldt);
		System.out.println(ldt2);
		System.out.println(ldt3);

	}

	private static void localDateTimeMethods() {
		LocalDateTime ldt = LocalDateTime.now();
		ldt.plusDays(1); // plusDays, plusWeeks, plusMonths, plusYears
		ldt.minusWeeks(3); // minusDays, minusWeeks, minusMonths, minusYears

		// not supported to work with seconds only days, weeks, months, years
		// ldt.plus(5, ChronoUnit.SECONDS);

		ldt.plus(5, ChronoUnit.WEEKS);
	}

}
