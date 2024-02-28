package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle r1= new Rectangle();
        assertEquals(1.0d,r1.getLength(),"Falso:length no coincide");

    }

    @Test
    void setLength() {
        Rectangle r3= new Rectangle(1.0d,1.0d,"red",true);
        r3.setLength(2.0d);
        assertEquals(2.0d,r3.getLength(),"Fallo: length no coincide en el set");
    }

    @Test
    void getWidth() {
        Rectangle r2= new Rectangle(1.0d,1.0d);
        assertEquals(1.0d,r2.getLength(),"Falso:width no coincide");
    }

    @Test
    void setWidth() {
        Rectangle r3= new Rectangle(1.0d,1.0d,"red",true);
        r3.setWidth(2.0d);
        assertEquals(2.0d,r3.getWidth(),"Fallo: width no coincide en el set");
    }

    @Test
    void getArea() {
        Rectangle r2= new Rectangle(1.0d,1.0d);
        assertEquals(1.0d,r2.getArea(),"Falso:area no coincide");

    }

    @Test
    void getPerimeter() {
        Rectangle r2= new Rectangle(1.0d,1.0d);
        assertEquals(4.0d,r2.getPerimeter(),"Falso:perimetro no coincide");
    }

    @Test
    void testToString() {
        Rectangle r3= new Rectangle(1.0d,1.0d,"red",true);
        assertEquals("Rectangle[Shape[color="+"red"+",filled="+true+"]length="+1.0d+", width="+1.0d+"]",r3.toString(),"Falso: toString no coincide");
    }
}