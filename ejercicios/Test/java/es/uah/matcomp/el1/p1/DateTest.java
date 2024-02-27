package es.uah.matcomp.el1.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date d1 = new Date(1, 2, 2014);
        assertEquals(1,d1.getDay(),"Fallo:los días no coinciden en el constructor");
        Date d2 = new Date(2, 2, 2014);
        assertEquals(2,d2.getDay(),"Fallo: los dias no coinciden");
    }

    @Test
    void getMonth() {
        Date d1 = new Date(1, 2, 2014);
        assertEquals(2,d1.getMonth(),"Fallo: los meses no coinciden");
    }

    @Test
    void getYear() {
        Date d1 = new Date(1, 2, 2014);
        assertEquals(2014,d1.getYear(),"Fallo: los años no coinciden");
    }

    @Test
    void setDay() {
        Date d1= new Date(1, 2, 2014);
        d1.setDay(2);
        assertEquals(2,d1.getDay(),"Fallo: los dias no coinciden en el set");
    }

    @Test
    void setMonth() {
        Date d1 = new Date(1, 2, 2014);
        d1.setMonth(3);
        assertEquals(3,d1.getMonth(),"Fallo: los meses no coinciden en el set");
    }

    @Test
    void setYear() {
        Date d1 = new Date(1, 2, 2014);
        d1.setYear(2015);
        assertEquals(2015,d1.getYear(),"Fallo: los años no coinciden en el set");
    }

    @Test
    void setDate() {
        Date d1 = new Date(1, 2, 2014);
        d1.setDate(2,3,2015);
        assertEquals(2,d1.getDay(),"Fallo: las fechas no coinciden");
        assertEquals(3,d1.getMonth(),"Fallo: las fechas no coinciden");
        assertEquals(2015,d1.getYear(),"Fallo: las fechas no coinciden");
    }

    @Test
    void testToString() {
        Date d1 = new Date(1, 2, 2014);
        assertEquals("01/02/2014",d1.toString(),"Fallo:los toString no coinciden");
    }
}