package es.uah.matcomp.el1.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1 = new Circle();

        assertEquals(1.0d,c1.getRadius(),"Fallo: Los radios no coinciden en el constructor por defecto");


        Circle c2 = new Circle(7.0d);

        assertEquals(7.0d,c2.getRadius(),"Fallo: los radios no coinciden en el constructor especifico de radio");
    }

    @Test
    void setRadius() {
    }

    @Test
    void getArea() {
    }

    @Test
    void getCircumference() {
    }

    @Test
    void testToString() {
    }
}