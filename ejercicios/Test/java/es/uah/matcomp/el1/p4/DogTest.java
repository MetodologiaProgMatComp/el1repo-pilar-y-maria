package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog a2 = new Dog( "Piñon");
        a2.greets();
    }

    @Test
    void testGreets() {
        Dog a3 = new Dog("Fuet");
        a3.greets();
    }
}