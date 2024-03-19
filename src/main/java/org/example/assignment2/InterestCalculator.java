package org.example.assignment2;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter rate of interest:");
        double rate = scanner.nextDouble();

        System.out.println("Enter time (in years):");
        int time = scanner.nextInt();

        try {
            double simpleInterest = calculateSimpleInterest(principal, rate, time);
            double compoundInterest = calculateCompoundInterest(principal, rate, time);

            System.out.println("Simple Interest: " + simpleInterest);
            System.out.println("Compound Interest: " + compoundInterest);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double calculateSimpleInterest(double principal, double rate, int time) {
        if (principal <= 0 || rate <= 0 || time <= 0) {
            throw new IllegalArgumentException("Principal, rate, and time must be greater than 0");
        }
        return (principal * rate * time) / 100;
    }

    public static double calculateCompoundInterest(double principal, double rate, int time) {
        if (principal <= 0 || rate <= 0 || time <= 0) {
            throw new IllegalArgumentException("Principal, rate, and time must be greater than 0");
        }
        return principal * Math.pow(1 + (rate / 100), time) - principal;
    }
}

