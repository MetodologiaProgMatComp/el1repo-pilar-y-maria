package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s1= new Rectangle();
        assertEquals("red",s1.getColor(),"Fallo los colores no coinciden");
    }

    @Test
    void setColor() {
        Shape s1= new Rectangle();
        s1.setColor("green");
        assertEquals("green",s1.getColor(),"Fallo los colores no coinciden en el set");
    }

    @Test
    void isFilled() {
        Shape s1= new Rectangle(1.0d, 2.0d, "red",false );
        assertEquals(false,s1.isFilled(),"Fallo filled no coincide");
    }

    @Test
    void setFilled() {
        Shape s1= new Rectangle(1.0d, 2.0d, "red",false);
        s1.setFilled(true);
        assertEquals(true,s1.isFilled(),"Fallo filled no coincide en el set");
    }

    @Test
    void getArea() {
        Shape s1= new Rectangle();
        assertEquals(1.0d,s1.getArea(),"Fallo area no coincide");
    }

    @Test
    void getPerimeter() {
        Shape s1= new Rectangle();
        assertEquals(4.0d,s1.getPerimeter(),"Fallo perimetro no coincide");
    }

    @Test
    void testToString() {
        Shape s1= new Rectangle(1.0d, 2.0d, "red",false);
        assertEquals("Shape[color="+"red"+",filled="+false+"]",s1.toString(),"Fallo toString no coincide");
    }

}