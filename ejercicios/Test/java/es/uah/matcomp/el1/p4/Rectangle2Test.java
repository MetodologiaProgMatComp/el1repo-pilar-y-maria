package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle2Test {

    @Test
    void testToString() {
        Rectangle2 rectangle = new Rectangle2(2.0, 4.0);
        assertEquals("Rectangle[width=2.0,length=4.0]", rectangle.toString(), "Fallo: toString no coincide");
    }


    @Test
    void getArea() {
        GeometricObject r2 = new Rectangle2(2.0, 4.0);
        assertEquals(8.0, r2.getArea(), 0.0001, "Fallo: las áreas no coinciden");
    }

    @Test
    void getPerimeter() {
        GeometricObject r2 = new Rectangle2(2.0, 4.0);
        assertEquals(12.0, r2.getPerimeter(), 0.0001);
    }
}