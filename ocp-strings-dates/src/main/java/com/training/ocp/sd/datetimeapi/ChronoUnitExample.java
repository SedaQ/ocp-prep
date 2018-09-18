package com.training.ocp.sd.datetimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Commonly used to get time between some dates.
 * 
 * @author Pavel Seda
 *
 */
public class ChronoUnitExample {

	public static void main(String[] args) {
		init();
		chronoUnitVsDuration();
		chronoUnitVsPeriod();
	}

	private static void init() {
		long milis = ChronoUnit.MILLIS.between(LocalDateTime.now(), LocalDateTime.now().plusSeconds(100));
	}

	private static void chronoUnitVsDuration() {
		Instant i1 = Instant.now();
		Instant i2 = Instant.now().plusSeconds(10);
		long milis = ChronoUnit.MILLIS.between(i1, i2);
		Duration duration = Duration.between(i1, i2);
		duration.getSeconds(); // 10
		duration.getNano();
		duration.get(ChronoUnit.SECONDS); // not supported only seconds and nanos
	}

	private static void chronoUnitVsPeriod() {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);

		Period p = Period.between(birthday, today);
		long p2 = ChronoUnit.DAYS.between(birthday, today);
		System.out.println("You are " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays()
				+ " days old. (" + p2 + " days total)");
	}

}
