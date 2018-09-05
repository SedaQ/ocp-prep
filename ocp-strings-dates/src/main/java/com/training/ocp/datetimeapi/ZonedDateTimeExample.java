package com.training.ocp.datetimeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Contains a date, time, and time zone. A good example of ZonedDateTime is “a
 * conference call at 1:00 p.m. at New York.” If you live in Brno, you’ll have
 * to get up early since the call is at 7:00 a.m. local time!
 * 
 * @author Pavel Seda
 *
 */
public class ZonedDateTimeExample {

	public static void main(String[] args) {
		init();
		zonedDateTimeMethods();

		// getAvailableTimeZones();
	}

	private static void init() {
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Prague"));
		System.out.println(zdt);
	}

	private static void zonedDateTimeMethods() {
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Prague"));
		ZoneId zi = zdt.getZone();
	}

	/**
	 * Method to retrieve available time zones.
	 */
	private static void getAvailableTimeZones() {
		ZoneId.getAvailableZoneIds().stream()
				// .filter(z -> z.contains("EU") || z.contains("Europe"))
				.sorted().forEach(System.out::println);
	}

}
