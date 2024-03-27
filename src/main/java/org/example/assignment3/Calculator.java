package org.example.assignment3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double result = calculate(operator, num1, num2);
        System.out.println("Result: " + result);
    }

    public static double calculate(char operator, double num1, double num2) {
        ArithmeticOperation operation;
        switch (operator) {
            case '+':
                operation = (a, b) -> a + b;
                break;
            case '-':
                operation = (a, b) -> a - b;
                break;
            case '*':
                operation = (a, b) -> a * b;
                break;
            case '/':
                operation = (a, b) -> a / b;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        return operation.operate(num1, num2);
    }

    @FunctionalInterface
    interface ArithmeticOperation {
        double operate(double num1, double num2);
    }
}

