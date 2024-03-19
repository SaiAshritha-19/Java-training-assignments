package org.example.assignment1;

import java.util.Scanner;

public class SimpleInterest {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter principal amount:");
            double principal = scanner.nextDouble();

            System.out.println("Enter rate of interest:");
            double rate = scanner.nextDouble();

            System.out.println("Enter time (in years):");
            int time = scanner.nextInt();

            double simpleInterest = calculateSimpleInterest(principal, rate, time);
            double compoundInterest = calculateCompoundInterest(principal, rate, time);

            System.out.println("Simple Interest: " + simpleInterest);
            System.out.println("Compound Interest: " + compoundInterest);
        }

        public static double calculateSimpleInterest(double principal, double rate, int time) {
            return (principal * rate * time) / 100;
        }

        public static double calculateCompoundInterest(double principal, double rate, int time) {
            return principal * Math.pow(1 + (rate / 100), time) - principal;
        }
    }



