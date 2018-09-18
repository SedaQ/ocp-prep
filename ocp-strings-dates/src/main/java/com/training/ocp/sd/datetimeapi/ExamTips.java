package com.training.ocp.sd.datetimeapi;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * @author Pavel Seda
 *
 */
public class ExamTips {

	public static void main(String[] args) {
		dateToString();
		considerImmutability();

		methodChaining();
	}

	private static void newKeywordNotAllowed() {
		// not allowed
		// LocalDate ld = new LocalDate();
	}

	private static void methodsOnSpecificDateType() {
		LocalDate ld = LocalDate.now();
		// ld.plusSeconds(4);
	}

	private static void dateToString() {
		Period p1 = Period.between(LocalDate.now(), LocalDate.now().plusDays(1));
		System.out.println(p1);
	}

	private static void considerImmutability() {
		LocalDate ld = LocalDate.of(2019, 1, 1);
		ld.plusDays(4); // does not matter
		System.out.println(ld);
	}

	private static void methodChaining() {
		// LocalDate allows chaining everything accepted
		LocalDate ld = LocalDate.of(2019, 1, 1);
		ld = ld.minusDays(5).plusDays(6);
		System.out.println(ld);

		// Period of 3 days only
		Period p = Period.ofYears(1).ofDays(3);
		System.out.println(p);
	}
}
