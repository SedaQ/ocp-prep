package com.training.ocp.sd.datetimeapi;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Contains just a time no date and no time zone. A good example of LocalTime is
 * midnight. It is midnight at the same time every day.
 * 
 * 
 * @author Pavel Seda
 *
 */
public class LocalTimeExample {

	public static void main(String[] args) {
		init();
		localTimeMethods();
	}

	private static void init() {
		LocalTime lt = LocalTime.now(); // 16:00:33.976
		LocalTime lt2 = LocalTime.ofSecondOfDay(10000); // 02:46:40
		LocalTime lt3 = LocalTime.of(12, 13); // 12:13 (hours and minutes)

		System.out.println(lt);
		System.out.println(lt2);
		System.out.println(lt3);
	}

	private static void localTimeMethods() {
		LocalTime lt = LocalTime.now();
		lt.plusMinutes(5); // plusNanos, plusSeconds, plusMinutes, plusHours
		lt.plus(5, ChronoUnit.NANOS);
	}

}
