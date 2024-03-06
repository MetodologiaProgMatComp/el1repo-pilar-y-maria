package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog a2 = new Dog( "Piñón");
        assertEquals("Piñón", a2.getName());
    }
    @Test
    void greets1() {
        Dog Dog1 = new Dog("Fuet");
        assertEquals("Woof", Dog1.greets());
    }
    @Test
    void testGreets() {
        Dog Dog2 = new Dog("Fuet");
        Dog Dog3 = new Dog("Rex");
        assertEquals("Woooof", Dog3.greets(Dog2));
    }
}