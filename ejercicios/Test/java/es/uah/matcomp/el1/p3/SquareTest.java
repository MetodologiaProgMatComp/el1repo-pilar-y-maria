package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square s1= new Square();
        assertEquals(0.0d,s1.getSide(),"Fallo: no coincide el lado en el constructor");
        Square s2= new Square(2.0d);
        assertEquals(2.0d,s2.getSide(),"Fallo: no coincide el lado en el constructor");
        Square s3= new Square(3.0d,"green",false);
        assertEquals(3.0d,s3.getSide(),"Fallo: no coincide el lado en el constructor");
    }

    @Test
    void setSide() {
        Square s2= new Square(1.0d);
        s2.setSide(2.0d);
        assertEquals(2.0d,s2.getSide(),"Fallo: no coincide el lado en el set");
    }

    @Test
    void setWidth() {
        Square s2= new Square(1.0d);
        s2.setWidth(2.0d);
        assertEquals(2.0d,s2.getWidth(),"Fallo: no coincide width en el set");
    }

    @Test
    void setLength() {
        Square s2= new Square(1.0d);
        s2.setLength(2.0d);
        assertEquals(2.0d,s2.getLength(),"Fallo: no coincide length en el set");
    }

    @Test
    void testToString() {
        Square s3= new Square(3.0d,"green",false);
        assertEquals("Square[Rectangle[Shape[color="+"green"+",filled="+false+"]length="+3.0d+", width="+3.0d+"]]",s3.toString(),"Fallo: no coincide toString");
    }
}