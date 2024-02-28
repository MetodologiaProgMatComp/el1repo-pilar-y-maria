package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square s1=new Square();
        assertEquals(0.0d,s1.getSide(),"Falso: lado no coincide");
    }

    @Test
    void setSide() {
        Square s2= new Square(1.0d);
        s2.setSide(2.0d);
        assertEquals(2.0d,s2.getSide(),"Falso: lado no coincide en el set");
    }

    @Test
    void setWidth() {
        Square s2= new Square(1.0d);
        s2.setWidth(2.0d);
        assertEquals(2.0d,s2.getWidth(),"Falso: width no coincide en el set");

    }

    @Test
    void setLength() {
        Square s2= new Square(1.0d);
        s2.setLength(2.0d);
        assertEquals(2.0d,s2.getLength(),"Falso: length no coincide en el set");
    }

    @Test
    void testToString() {
        Square s3= new Square(1.0d,"red",false);
        assertEquals("Square[Rectangle[Shape[color="+"red"+",filled="+false+"]length="+1.0d+", width="+1.0d+"]",s3.toString(),"Fallo: toString no coincide");
    }
}