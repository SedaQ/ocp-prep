package com.training.ocp.sd.datetimeapi.tasks;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
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

        Locale locale = new Locale("en", "EN");
//        Locale locale = Locale.getDefault();
        m.printHeader(givenDate, locale);


        m.startDate = givenDate.withDayOfMonth(1);
        m.endDate = givenDate.withDayOfMonth(givenDate.lengthOfMonth());
        List<LocalDate> streamIterator = m.daysBetween(m.startDate, m.endDate);

        for (int i = 0; i < streamIterator.size(); i++) {
            if (i % 7 == 0) System.out.println();
            System.out.format("%4s", streamIterator.get(i).getDayOfMonth());
        }
        System.out.println();

        m.counting();
    }

    private List<LocalDate> daysBetween(LocalDate startDate, LocalDate endDate) {
        if (startDate.getDayOfWeek() != DayOfWeek.MONDAY)
            startDate = startDate.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        if (endDate.getDayOfWeek() != DayOfWeek.MONDAY)
            endDate = endDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        return Stream.iterate(startDate, date -> date.plusDays(1))
                .limit(ChronoUnit.DAYS.between(startDate, endDate))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private void counting() {
        // When your program starts up
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        // then, when you want to schedule a task
        executor.scheduleWithFixedDelay(() ->
                        System.out.print("\r Actual time: " + LocalTime.now().truncatedTo(ChronoUnit.SECONDS).format(DateTimeFormatter.ISO_LOCAL_TIME)),
                0,
                1,
                TimeUnit.SECONDS);
        // and finally, when your program wants to exit
        if (executor == null) {
            executor.shutdown();
        }
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


    private void printHeader(LocalDate givenDate, Locale locale) {
        System.out.format("%4s", "  " +
                givenDate.getDayOfWeek().getDisplayName(TextStyle.FULL, locale).toLowerCase() + " " +
                givenDate.getDayOfMonth() + ". " +
                givenDate.getMonth().getDisplayName(TextStyle.FULL, locale) + " " +

                givenDate.getYear() + System.lineSeparator());

        System.out.format("%4s%4s%4s%4s%4s%4s%4s",
                DayOfWeek.MONDAY.getDisplayName(TextStyle.SHORT, locale),
                DayOfWeek.TUESDAY.getDisplayName(TextStyle.SHORT, locale),
                DayOfWeek.WEDNESDAY.getDisplayName(TextStyle.SHORT, locale),
                DayOfWeek.THURSDAY.getDisplayName(TextStyle.SHORT, locale),
                DayOfWeek.FRIDAY.getDisplayName(TextStyle.SHORT, locale),
                DayOfWeek.SATURDAY.getDisplayName(TextStyle.SHORT, locale),
                DayOfWeek.SUNDAY.getDisplayName(TextStyle.SHORT, locale)
        );
    }
}
