package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {

    @Test
    void testToString() {
        Circle2 c2 = new Circle2(1.0d);
        assertEquals("Circle[radius=1.0]", c2.toString(), "Fallo: toString no coincide");
    }


    @Test
    void getArea() {
        GeometricObject c2 = new Circle2(1.0d);
        assertEquals(Math.PI, c2.getArea(), 0.0001, "Fallo: las áreas no coinciden");
    }

    @Test
    void getPerimeter() {
        GeometricObject c2 = new Circle2(3.0d); // Radio de 3
        assertEquals(2 * 3.0d * Math.PI, c2.getPerimeter(), 0.0001);
    }
}