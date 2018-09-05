package com.training.ocp.datetimeapi;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * 
 * Similar as Period but works with days, hours, minutes, seconds.
 * 
 * Suitable in situations that measure machine-based time.
 * 
 * Does not track time zones or daylight saving time.
 * 
 * @author Pavel Seda
 *
 */
public class DurationExample {

	public static void main(String[] args) {
		init();
		methods();
	}

	private static void init() {
		Duration oneHour = Duration.ofHours(1); // PT1H
		Duration oneHour2 = Duration.of(1, ChronoUnit.HOURS); // PT1H
		System.out.println(oneHour);
		System.out.println(oneHour2);
	}

	private static void methods() {
		Duration daily = Duration.ofDays(1); // PT24H
		Duration hourly = Duration.ofHours(1); // PT1H
		Duration everyMinute = Duration.ofMinutes(1); // PT1M
		Duration everyTenSeconds = Duration.ofSeconds(10); // PT10S
		Duration everyMilli = Duration.ofMillis(1); // PT0.001S
		Duration everyNano = Duration.ofNanos(1); // PT0.000000001S
	}

}
