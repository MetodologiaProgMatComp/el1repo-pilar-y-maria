package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle r1 = new ResizableCircle(1.0d);
        assertEquals("ResizableCircle[Circle[radius="+1.0d+"]",r1.toString(),"Fallo toString no coincide");
    }

    @Test
    void resize() {
        ResizableCircle r1 = new ResizableCircle(1.0d);
        r1.resize(10);
        assertEquals(0.1d,r1.radius,"Fallo los radios al redimensionar no coinciden");
    }
}