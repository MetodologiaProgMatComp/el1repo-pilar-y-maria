package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1=new Circle();
        assertEquals(1.0d,c1.getRadius(),"Fallo: los radios no coinciden");
        Circle c2=new Circle(2.0d);
        assertEquals(2.0d,c2.getRadius(),"Fallo:los radios no coinciden");
        Circle c3=new Circle(3.0d,"green",true);
        assertEquals(3.0d,c3.getRadius(),"Fallo:los radios no coinciden");
    }

    @Test
    void setRadius() {
        Circle c2=new Circle(1.0d);
        c2.setRadius(2.0d);
        assertEquals(2.0d,c2.getRadius(),"Fallo:los radios no coinciden en el set");
    }

    @Test
    void getArea() {
        Circle c2=new Circle(1.0d);
        assertEquals(Math.PI,c2.getArea(),"Fallo:las areas no coinciden");
    }

    @Test
    void getPerimeter() {
        Circle c2=new Circle(1.0d);
        assertEquals(2*Math.PI,c2.getPerimeter(),"Fallo:los perimetros no coinciden");
    }

    @Test
    void testToString() {
        Circle c2=new Circle(2.0d, "green",true );
        assertEquals("Circle[Shape[color="+"green"+",filled="+true+"radius="+2.0d+"]",c2.toString(),"Fallo:los toString no coinciden");
    }
}