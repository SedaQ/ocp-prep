package com.training.ocp.datetimeapi;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Quiz {

	public static void main(String[] args) {
		periodExample();

		localDateChaining();
	}

	private static void dateImmutability() {
//		LocalDate ld = new LocalDate(1922,25,3);
//		ld.plusDays(3);
	}

	private static void periodExample() {
		Period p = Period.of(1992, 36, 1);
		Period p2 = Period.ofYears(1222);
		System.out.println(p);
		System.out.println();
	}

	private static void localDateChaining() {
		LocalDate ld = LocalDate.of(1992, 0, 1);
		ld.plusMonths(3).plusDays(4);
	}
}
