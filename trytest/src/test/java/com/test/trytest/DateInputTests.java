package com.test.trytest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DateInputTests {

    @Test
    public void testValidDateFormat() {
        assertTrue(DateInput.isValidDateFormat("01-01-2022"));
        assertFalse(DateInput.isValidDateFormat("01-01"));
        assertFalse(DateInput.isValidDateFormat("01-01-2022-05"));
        assertFalse(DateInput.isValidDateFormat("01/01/2022"));
        assertFalse(DateInput.isValidDateFormat("aa-bb-cccc"));
    }

    @Test
    public void testIsValidDate() {
        assertTrue(DateInput.isValidDate(1, 1, 2022));
        assertFalse(DateInput.isValidDate(0, 1, 2022));
        assertFalse(DateInput.isValidDate(32, 1, 2022));
        assertFalse(DateInput.isValidDate(31, 2, 2022));
        assertFalse(DateInput.isValidDate(29, 2, 2021));
        assertTrue(DateInput.isValidDate(29, 2, 2020));
        assertTrue(DateInput.isValidDate(30, 4, 2022));
        assertFalse(DateInput.isValidDate(31, 4, 2022));
        assertTrue(DateInput.isValidDate(31, 12, 2022));
        assertFalse(DateInput.isValidDate(1,14,2022));
        assertFalse(DateInput.isValidDate(12,6,2025));
        assertTrue(DateInput.isValidDate(12,6,2024));
    }

    @Test
    public void testLeapYear() {
        assertFalse(DateInput.isLeapYear(2021));
        assertTrue(DateInput.isLeapYear(2020));
        assertFalse(DateInput.isLeapYear(1900));
        assertTrue(DateInput.isLeapYear(2000));
    }

}