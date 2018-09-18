package com.training.ocp.sd.datetimeapi;

import java.time.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class DayLightSavings {

	public static void main(String[] args) {
		plusHour();

		System.out.println();

		minusHour();
	}

	private static void plusHour() {
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(dateTime); // 2016–03–13T01:30–05:00[US/Eastern]
		dateTime = dateTime.plusHours(1);
		System.out.println(dateTime); // 2016–03–13T03:30–04:00[US/Eastern]
	}

	private static void minusHour() {
		LocalDate date = LocalDate.of(2016, Month.NOVEMBER, 6);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(dateTime); // 2016–11–06T01:30–04:00[US/Eastern]
		dateTime = dateTime.plusHours(1);
		System.out.println(dateTime); // 2016–11–06T01:30–05:00[US/Eastern]
		dateTime = dateTime.plusHours(1);
		System.out.println(dateTime); // 2016–11–06T02:30–05:00[US/Eastern]
	}
}
