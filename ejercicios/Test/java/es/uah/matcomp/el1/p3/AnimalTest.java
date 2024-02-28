package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Mammal mammal = new Mammal("Animal1");
        assertEquals("Mammal [Animal [name=Animal1]]", mammal.toString());
    }
}
