package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle r1 = new Rectangle(1.0d, 2.0d, "red",false);
        assertEquals(1.0d,r1.getLength(),"Fallo: length no coincide");
        Rectangle r2 = new Rectangle(3.0d, 2.0d);
        assertEquals(3.0d,r2.getLength(),"Fallo: length no coincide");
    }

    @Test
    void setLength() {
        Rectangle r1 = new Rectangle(1.0d, 2.0d, "red",false);
        r1.setLength(2.0d);
        assertEquals(2.0d,r1.getLength(),"Fallo: length no coincide");
    }

    @Test
    void getWidth() {
        Rectangle r1 = new Rectangle();
        assertEquals(1.0d,r1.getWidth(),"Fallo: width no coincide");
    }

    @Test
    void setWidth() {
        Rectangle r1 = new Rectangle(1.0d, 2.0d, "red",false);
        r1.setWidth(3.0d);
        assertEquals(3.0d,r1.getWidth(),"Fallo: width no coincide");
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle(1.0d, 2.0d, "red",false);
        assertEquals(2.0d,r1.getArea(),"Fallo: area no coincide");
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(1.0d, 2.0d, "red",false);
        assertEquals(6.0d,r1.getPerimeter(),"Fallo: perimetro no coincide");
    }

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle(1.0d, 2.0d, "red",false);
        assertEquals("Rectangle[Shape[color="+"red"+",filled="+false+"]length="+1.0d+", width="+2.0d+"]",r1.toString(),"Fallo: toString no coincide");
    }
}