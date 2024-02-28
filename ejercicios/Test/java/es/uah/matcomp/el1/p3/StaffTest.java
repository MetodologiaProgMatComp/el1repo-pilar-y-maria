package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff staff = new Staff("Bob Johnson",  "789 Oak Street", "High School", 3000.0);
        assertEquals("High School", staff.getSchool());

    }

    @Test
    void setSchool() {
        Staff staff = new Staff("Bob Johnson",  "789 Oak Street", "High School", 3000.0);
        staff.setSchool("University");
        assertEquals("University", staff.getSchool());
    }

    @Test
    void getPay() {
        Staff staff = new Staff("Bob Johnson",  "789 Oak Street", "High School", 3000.0);
        assertEquals(3000.0, staff.getPay());
    }

    @Test
    void setPay() {
        Staff staff = new Staff("Bob Johnson",  "789 Oak Street", "High School", 3000.0);
        staff.setPay(6000.0);
        assertEquals(6000.0, staff.getPay());
    }

    @Test
    void testToString() {
        Staff staff = new Staff("Bob Johnson",  "789 Oak Street", "High School", 3000.0);
        assertEquals("Staff[Person[name=Bob Johnson,adress=789 Oak Street], school=High School,pay=3000.0]", staff.toString());
    }
}