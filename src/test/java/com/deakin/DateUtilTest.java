package com.deakin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DateUtilTest {

    @Test
    public void testIncrementDay() {
        DateUtil date = new DateUtil(28, 2, 2020); // Leap year
        date.incrementDay();
        assertEquals(29, date.getDay());
        assertEquals(2, date.getMonth());
        assertEquals(2020, date.getYear());

        date.incrementDay();
        assertEquals(1, date.getDay());
        assertEquals(3, date.getMonth());
        assertEquals(2020, date.getYear());
    }

    @Test
    public void testDecrementDay() {
        DateUtil date = new DateUtil(1, 3, 2020); // Leap year
        date.decrementDay();
        assertEquals(29, date.getDay());
        assertEquals(2, date.getMonth());
        assertEquals(2020, date.getYear());

        date.decrementDay();
        assertEquals(28, date.getDay());
        assertEquals(2, date.getMonth());
        assertEquals(2020, date.getYear());
    }

    @Test
    public void testIncrementDayEndOfYear() {
        DateUtil date = new DateUtil(31, 12, 2020);
        date.incrementDay();
        assertEquals(1, date.getDay());
        assertEquals(1, date.getMonth());
        assertEquals(2021, date.getYear());
    }

    @Test
    public void testDecrementDayStartOfYear() {
        DateUtil date = new DateUtil(1, 1, 2021);
        date.decrementDay();
        assertEquals(31, date.getDay());
        assertEquals(12, date.getMonth());
        assertEquals(2020, date.getYear());
    }

    @Test
    public void testIncrementDayNonLeapYear() {
        DateUtil date = new DateUtil(28, 2, 2021); // Non-leap year
        date.incrementDay();
        assertEquals(1, date.getDay());
        assertEquals(3, date.getMonth());
        assertEquals(2021, date.getYear());
    }

    @Test
    public void testDecrementDayNonLeapYear() {
        DateUtil date = new DateUtil(1, 3, 2021); // Non-leap year
        date.decrementDay();
        assertEquals(28, date.getDay());
        assertEquals(2, date.getMonth());
        assertEquals(2021, date.getYear());
    }

    @Test
    public void testIncrementDay30DayMonth() {
        DateUtil date = new DateUtil(30, 4, 2021);
        date.incrementDay();
        assertEquals(1, date.getDay());
        assertEquals(5, date.getMonth());
        assertEquals(2021, date.getYear());
    }

    @Test
    public void testDecrementDay30DayMonth() {
        DateUtil date = new DateUtil(1, 5, 2021);
        date.decrementDay();
        assertEquals(30, date.getDay());
        assertEquals(4, date.getMonth());
        assertEquals(2021, date.getYear());
    }

    @Test
    public void testIncrementDay31DayMonth() {
        DateUtil date = new DateUtil(31, 7, 2021);
        date.incrementDay();
        assertEquals(1, date.getDay());
        assertEquals(8, date.getMonth());
        assertEquals(2021, date.getYear());
    }

    @Test
    public void testDecrementDay31DayMonth() {
        DateUtil date = new DateUtil(1, 8, 2021);
        date.decrementDay();
        assertEquals(31, date.getDay());
        assertEquals(7, date.getMonth());
        assertEquals(2021, date.getYear());
    }
}
