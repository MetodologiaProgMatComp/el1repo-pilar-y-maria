package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void getProgram() {
        Student student = new Student ("Alice Smith", "333 Oxford st", "Mathematics", 2023, 2500.0);
        assertEquals("Mathematics", student.getProgram());
    }

    @Test
    void setProgram() {
        Student student = new Student ("Alice Smith", "333 Oxford st", "Mathematics", 2023, 2500.0);
        student.setProgram("Physics");
        assertEquals("Physics", student.getProgram());
    }

    @Test
    void getYear() {
        Student student = new Student ("Alice Smith", "333 Oxford st", "Mathematics", 2023, 2500.0);
        assertEquals(2023, student.getYear());
    }

    @Test
    void setYear() {
        Student student = new Student ("Alice Smith", "333 Oxford st", "Mathematics", 2023, 2500.0);
        student.setYear(2019);
        assertEquals(2019, student.getYear());
    }

    @Test
    void getFee() {
        Student student = new Student ("Alice Smith", "333 Oxford st", "Mathematics", 2023, 2500.0);
        assertEquals(2500.0, student.getFee());
    }

    @Test
    void setFee() {
        Student student = new Student ("Alice Smith", "333 Oxford st", "Mathematics", 2023, 2500.0);
        student.setFee(2700.0);
        assertEquals(2700.0, student.getFee());
    }

    @Test
    void testToString() {
        Student student = new Student ("Alice Smith", "333 Oxford Street", "Mathematics", 2023, 2500.0);
        assertEquals("Student[Person[name=Alice Smith,address=333 Oxford Street], program=Mathematics,year=2023,fee=2500.0]", student.toString());

    }
}