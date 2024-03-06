package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1=new Circle();
        assertEquals(1.0d,c1.getRadius(),"Fallo: los radios no coinciden en el constructor ");
        Circle c2=new Circle(2.0d,"red",true);
        assertEquals(2.0d,c2.getRadius(),"Fallo: los radios no coinciden en el constructor");
        Circle c3=new Circle(2.0d);
        assertEquals(2.0d,c3.getRadius(),"Fallo: los radios no coinciden en el constructor");

    }

    @Test
    void setRadius() {
        Circle c1=new Circle();
        c1.setRadius(2.0d);
        assertEquals(2.0d,c1.getRadius(),"Fallo: los radios no coinciden ");
    }

    @Test
    void getArea() {
        Circle c1=new Circle();
        assertEquals(Math.PI,c1.getArea(),"Fallo: las areas no coinciden ");
    }

    @Test
    void getPerimeter() {
        Circle c1=new Circle();
        assertEquals(2*Math.PI,c1.getPerimeter(),"Fallo: los perimetros no coinciden ");
    }

    @Test
    void testToString() {
        Circle c1=new Circle(2.0d,"red",true);
        assertEquals("Circle[Shape[color="+"red"+",filled="+true+"],radius="+2.0d+"]",c1.toString(),"Fallo: los toString no coinciden ");
    }
}