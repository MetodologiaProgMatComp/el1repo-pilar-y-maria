package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person("John Doe", "123 Main Street");
        assertEquals("John Doe", person.getName());
    }

    @Test
    void getAdress() {
        Person person = new Person("John Doe", "123 Main Street");
        assertEquals("123 Main Street", person.getAdress());
    }

    @Test
    void setAdress() {
        Person person = new Person("John Doe", "123 Main Street");
        person.setAdress("333 Oxford st");
        assertEquals("333 Oxford st", person.getAdress());
    }

    @Test
    void testToString() {
        Person person = new Person("John Doe", "123 Main Street");
        assertEquals("Person[name=John Doe,adress=123 Main Street]", person.toString());
    }
}