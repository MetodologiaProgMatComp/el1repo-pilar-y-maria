package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Mammal mammal = new Mammal("Mammal1");
        assertEquals("Mammal [Animal [name=Mammal1]]", mammal.toString());
    }
}