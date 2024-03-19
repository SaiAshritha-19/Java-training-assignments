package org.example.assignment1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean validateEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] emails = {
                "test@123.com",
                "user123@gmail.com",
                "invalid-email",
                "test123@gmail.co.in"
        };

        for (String email : emails) {
            System.out.println(email + ": " + (validateEmail(email) ? "Valid" : "Invalid"));
        }
    }
}


