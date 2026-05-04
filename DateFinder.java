package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFinder {
    /**
     * Finds all dates in a string and returns them in an array.
     * Supported formats:
     * - MM/DD/YY, MM/DD/YYYY
     * - M/D/YY, M/D/YYYY
     * - MM-DD-YY, MM-DD-YYYY
     * - M-D-YY, M-D-YYYY
     */
    public static List<String> findDates(String input) {
        List<String> dates = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d{1,2}[/-]\\d{1,2}[/-]\\d{2,4}");
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        
        return dates;
    }

    public static void main(String[] args) {
        String testString = "I have a dentist appointment on 11/14/2023 and book club on 12-1-23";
        List<String> foundDates = findDates(testString);
        System.out.println("Found dates: " + foundDates);
    }
}