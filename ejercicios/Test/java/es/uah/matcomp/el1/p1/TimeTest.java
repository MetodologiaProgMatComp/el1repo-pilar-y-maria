package es.uah.matcomp.el1.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time time = new Time(1, 2, 3);
        assertEquals(1, time.getHour());
    }

    @Test
    void getMinute() {
        Time time = new Time(1, 2, 3);
        assertEquals(2, time.getMinute());
    }

    @Test
    void getSecond() {
        Time time = new Time(1, 2, 3);
        assertEquals(3, time.getSecond());
    }

    @Test
    void setHour() {
        Time time = new Time(1, 2, 3);
        time.setHour(4);
        assertEquals(4, time.getHour());
    }

    @Test
    void setMinute() {
        Time time = new Time(1, 2, 3);
        time.setMinute(5);
        assertEquals(5, time.getMinute());
    }

    @Test
    void setSecond() {
        Time time = new Time(1, 2, 3);
        time.setSecond(6);
        assertEquals(6, time.getSecond());
    }

    @Test
    void setTime() {
        Time time = new Time(1, 2, 3);
        time.setTime(23, 59, 58);
        assertEquals("23:59:58", time.toString());
    }

    @Test
    void testToString() {
        Time time = new Time(1, 2, 3);
        assertEquals("01:02:03", time.toString());
    }

    @Test
    void nextSecond() {
        Time time= new Time(1, 2, 3);
        Time time2= new Time(1, 2, 59);
        Time time3= new Time(1, 59, 59);
        Time time4= new Time(24, 61, 61);
        assertEquals("01:02:04", time.nextSecond().toString());
        assertEquals("01:03:00", time2.nextSecond().toString());
        assertEquals("02:00:00", time3.nextSecond().toString());
        assertEquals("00:00:00", time4.nextSecond().toString());
    }

    @Test
    void previousSecond() {
        Time time = new Time (1, 2, 3);
        Time time2 = new Time (1, 2, 0);
        Time time3 = new Time (2, 0, 0);
        Time time4 = new Time (-1, -1, -1);
        assertEquals("01:02:02", time.previousSecond().toString());
        assertEquals("01:01:59", time2.previousSecond().toString());
        assertEquals("01:59:59", time3.previousSecond().toString());
        assertEquals("23:59:59", time4.previousSecond().toString());
    }
}