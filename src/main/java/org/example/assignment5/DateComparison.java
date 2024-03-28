package org.example.assignment5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (yyyy-MM-dd):");
        String inputDateString = scanner.nextLine();
        scanner.close();


        LocalDate inputDate = LocalDate.parse(inputDateString);


        LocalDate currentDate = LocalDate.now();


        if (inputDate.isEqual(currentDate)) {
            System.out.println("Given input date is equal to the current date.");
        } else if (inputDate.isBefore(currentDate)) {
            System.out.println("Given input date is before the current date.");
        } else {
            System.out.println("Given input date is after the current date.");
        }
    }
}
