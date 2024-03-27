package org.example.assignment5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");


        String formattedDate = currentDate.format(formatter);
        System.out.println("Formatted current date: " + formattedDate);

        // Get before date (one day before current date)
        LocalDate beforeDate = currentDate.minusDays(1);
        String formattedBeforeDate = beforeDate.format(formatter);
        System.out.println("Before date: " + formattedBeforeDate);

        // Get after date (one day after current date)
        LocalDate afterDate = currentDate.plusDays(1);
        String formattedAfterDate = afterDate.format(formatter);
        System.out.println("After date: " + formattedAfterDate);
    }
}
