package com.test.trytest;

import java.time.LocalDate;
import java.util.Scanner;

public class DateInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir une date au format JJ-MM-AAAA :");

        String dateString = scanner.nextLine();

        if (!isValidDateFormat(dateString)) {
            throw new RuntimeException("Le format de la date n'est pas valide.");
        }

        String[] dateParts = dateString.split("-");
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        if (!isValidDate(day, month, year)) {
            throw new RuntimeException("La date n'est pas valide.");
        }

        System.out.println("Date saisie : " + day + "-" + month + "-" + year);

        scanner.close();
    }

    public static boolean isValidDateFormat(String dateString) {
        if (countOccurrences(dateString, '-') != 2)
            return false;

        String[] dateParts = dateString.split("-");
        for (String part : dateParts) {
            try {
                Integer.parseInt(part);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12)
            return false;

        int currentYear = LocalDate.now().getYear();
        if (year < 2000 || year > currentYear)
            return false;

        switch (month) {
            case 2:
                if (isLeapYear(year))
                    return day >= 1 && day <= 29;
                else
                    return day >= 1 && day <= 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return day >= 1 && day <= 30;
            default:
                return day >= 1 && day <= 31;
        }
    }

    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
