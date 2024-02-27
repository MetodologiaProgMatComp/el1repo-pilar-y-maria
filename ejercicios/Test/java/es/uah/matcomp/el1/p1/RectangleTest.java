package es.uah.matcomp.el1.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle r1= new Rectangle();
        assertEquals(1.0f,r1.getLength(),"Fallo: Las longitudes no coinciden en el constructor por defecto");
        Rectangle r2= new Rectangle(2.0f,2.0f);
        assertEquals(2.0f,r2.getLength(),"Fallo: las longitudes no coinciden en el constructor especifico de longitud");
    }

    @Test
    void setLength() {
        Rectangle r1= new Rectangle(1.0f,1.0f);
        r1.setLength(2.0f);
        assertEquals(2.0f,r1.getLength(),"Fallo: las longitudes no coinciden");
    }

    @Test
    void getWidth() {
        Rectangle r2= new Rectangle(2.0f,2.0f);
        assertEquals(2.0f,r2.getWidth(),"Fallo: los anchos no coinciden en el constructor especifico de ancho");
    }

    @Test
    void setWidth() {
        Rectangle r1= new Rectangle(1.0f,1.0f);
        r1.setWidth(2.0f);
        assertEquals(2.0f,r1.getWidth(),"Fallo: los anchos no coinciden");
    }

    @Test
    void getArea() {
        Rectangle r1= new Rectangle(1.0f,1.0f);
        assertEquals(1.0f,r1.getArea(),"Fallo: las areas no coinciden");
    }

    @Test
    void getPerimeter() {
        Rectangle r1= new Rectangle(1.0f,1.0f);
        assertEquals(4.0f,r1.getPerimeter(),"Fallo: los perimetros no coinciden");
    }

    @Test
    void testToString() {
        Rectangle r1= new Rectangle(1.0f,1.0f);
        assertEquals("Rectangle[length="+1.0f+", width="+1.0f+"]",r1.toString(),"Fallo: no coincide el toString");
    }
}