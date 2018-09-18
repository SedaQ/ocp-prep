package com.training.ocp.sd.datetimeapi;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoField;

/**
 * Handles more complex formatters as DateTimeFormatter
 * 
 * @author Pavel Seda
 *
 */
public class DateTimeFormatterBuilderExample {

	public static void main(String[] args) {
		DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
		DateTimeFormatter formatter = builder.appendLiteral("Day is:").appendValue(ChronoField.DAY_OF_MONTH)
				.appendLiteral(", month is:").appendValue(ChronoField.MONTH_OF_YEAR).appendLiteral(", and year:")
				.appendPattern("u").appendLiteral(" with the time:").appendValue(ChronoField.HOUR_OF_DAY)
				.appendLiteral(":").appendText(ChronoField.MINUTE_OF_HOUR, TextStyle.NARROW_STANDALONE).toFormatter();
		LocalDateTime dateTime = LocalDateTime.now();
		String str = dateTime.format(formatter);
		System.out.println(str); // Day is:5, month is:9, and year:2018 with the time:19:9

	}
}
