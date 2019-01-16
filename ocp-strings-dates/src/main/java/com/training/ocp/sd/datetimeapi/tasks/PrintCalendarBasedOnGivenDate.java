package com.training.ocp.sd.datetimeapi.tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 */
public class PrintCalendarBasedOnGivenDate {

    // in Java 9 List<LocalDate> dates = startDate.datesUntil(endDate).collect(Collectors.toList());

    private LocalDate startDate;
    private LocalDate endDate;

    public static void main(String[] args) {
        PrintCalendarBasedOnGivenDate m = new PrintCalendarBasedOnGivenDate();

        System.out.println("Give me a date in ISO format YYYY-MM-DD");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        LocalDate givenDate = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);

        m.startDate = givenDate.withDayOfMonth(1);
        m.endDate = givenDate.withDayOfMonth(givenDate.lengthOfMonth());

        List<LocalDate> streamIterator = m.daysBetween(m.startDate, m.endDate);

        System.out.println(
                givenDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()) + ", " +
                        givenDate.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()) + " " +
                        givenDate.getDayOfMonth() + ", " +
                        givenDate.getYear());
        for (int i = 0; i < streamIterator.size(); i++) {
            if (i % 7 == 0) System.out.println();
            System.out.print(streamIterator.get(i).getDayOfMonth() + " ");
        }
    }

    private List<LocalDate> daysBetween(LocalDate startDate, LocalDate endDate) {
        return Stream.iterate(startDate, date -> date.plusDays(1))
                .limit(ChronoUnit.DAYS.between(startDate, endDate) + 1)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Baeldung solution: https://www.baeldung.com/java-between-dates
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static List<LocalDate> getDatesBetweenUsingJava8(
            LocalDate startDate, LocalDate endDate) {
        long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        return IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startDate.plusDays(i))
                .collect(Collectors.toList());
    }
}
