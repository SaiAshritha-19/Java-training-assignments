package org.example.assignment4;

import java.util.Arrays;
import java.util.List;

public class LongestCountryName {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList(
                "United States of America",
                "United Kingdom",
                "South Africa",
                "New Zealand",
                "India",
                "Canada",
                "United Arab Emirates"
        );

        String countryWithLongestName = countries.stream()
                .reduce((country1, country2) -> country1.length() > country2.length() ? country1 : country2)
                .orElse(null);
        System.out.println("Country with the longest name: " + countryWithLongestName);
    }
}

