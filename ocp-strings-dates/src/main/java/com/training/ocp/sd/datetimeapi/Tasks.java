package com.training.ocp.sd.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Tasks {

	private static LocalDate personBorn = Year.of(1823).atMonth(Month.APRIL).atDay(3);

	public static void main(String[] args) {

		testPersonCharacteristics();
		workingWithTimeZones();

		System.out.println();

		chronoUnit();
	}

	private static void testPersonCharacteristics() {
		personBorn.isLeapYear();
		personBorn.plusWeeks(5).plusDays(3);
	}

	private static void workingWithTimeZones() {
		LocalTime time = LocalTime.of(13, 10);
		ZoneId usEastern = ZoneId.of("US/Eastern");
		ZoneId pacificWake = ZoneId.of("Pacific/Wake");
		ZoneId europeMinsk = ZoneId.of("Europe/Minsk");

		LocalTime usEasternLocalTime = LocalDateTime.of(LocalDate.now(), time).atZone(usEastern)
				.withZoneSameInstant(ZoneOffset.UTC).toLocalTime();

		LocalTime pacificWakeLocalTime = LocalDateTime.of(LocalDate.now(), time).atZone(pacificWake)
				.withZoneSameInstant(ZoneOffset.UTC).toLocalTime();

		LocalTime europeMinskLocalTime = LocalDateTime.of(LocalDate.now(), time).atZone(europeMinsk)
				.withZoneSameInstant(ZoneOffset.UTC).toLocalTime();

		System.out.println(usEasternLocalTime);
		System.out.println(pacificWakeLocalTime);
		System.out.println(europeMinskLocalTime);
	}

	private static void chronoUnit() {
		LocalDate ld1 = Year.of(1922).atMonth(Month.JANUARY).atDay(3);
		LocalDate ld2 = Year.of(1911).atMonth(3).atDay(8);
		long betweenDates = ChronoUnit.DAYS.between(ld1, ld2);
		System.out.println(betweenDates);
	}
}
