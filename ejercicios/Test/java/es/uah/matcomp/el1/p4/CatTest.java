package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat cat = new Cat("Pelusa");
        assertDoesNotThrow(cat::greets);
    }
}