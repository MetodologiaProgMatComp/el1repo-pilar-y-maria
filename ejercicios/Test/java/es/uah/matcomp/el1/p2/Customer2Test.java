package es.uah.matcomp.el1.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Customer2Test {

    @Test
    void getId() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        assertEquals(5555,c1.getId(),"Fallo, los id no coinciden en el constructor");
        Customer2 c2 = new Customer2(5556, "Alfonso", 'm');
        assertEquals(5556,c2.getId(),"Fallo: los id no coinciden");
    }

    @Test
    void getName() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        assertEquals("Alfonso",c1.getName(),"Fallo: los nombres no coinciden");
    }

    @Test
    void getGender() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        assertEquals('m',c1.getGender(),"Fallo: los gender no coinciden");
    }

    @Test
    void testToString() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        assertEquals("Alfonso"+"("+5555+")",c1.toString(),"Fallo: los toString no coinciden");
    }
}