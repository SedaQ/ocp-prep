package com.training.ocp.sd.datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

/**
 * The Instant class represents a specific moment in time in the GMT time zone.
 * 
 * @author Pavel Seda
 *
 */
public class InstantExample {

	public static void main(String[] args) {
		init();
		methods();
	}

	private static void init() {
		Instant now = Instant.now();
		// do something time consuming
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant later = Instant.now();

		System.out.println("Before something time consuming: " + now + System.lineSeparator()
				+ "After something time consuming: " + later);
	}

	private static void methods() {
		LocalDate date = LocalDate.of(2015, 5, 25);
		LocalTime time = LocalTime.of(11, 55, 00);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		Instant instant = zonedDateTime.toInstant(); // 2015–05–25T15:55:00Z
		System.out.println(zonedDateTime); // 2015–05–25T11:55–04:00[US/Eastern]
		System.out.println(instant); // 2015–05–25T15:55:00Z

		instant.isAfter(Instant.now().plusMillis(2));

	}

}
