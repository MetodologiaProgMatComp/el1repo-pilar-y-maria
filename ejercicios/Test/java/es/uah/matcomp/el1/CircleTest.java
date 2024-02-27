package es.uah.matcomp.el1;

import es.uah.matcomp.el1.p1.Circle;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @org.junit.jupiter.api.Test
    void getRadius(){
        Circle c1= new Circle();
        assertEquals(1.0d,c1.getRadius());
        Circle c2= new Circle(2.0d);
        assertEquals(2.0d,c2.getRadius());
    }
    @org.junit.jupiter.api.Test
    void setRadius(){
        Circle c1= new Circle(1.0d);
        c1.setRadius(2.0d);
        assertEquals(2.0d,c1.getRadius());
    }
    @org.junit.jupiter.api.Test
    void getArea(){
        Circle c1= new Circle(1.0d);
        assertEquals(Math.PI,c1.getArea());
    }
    @org.junit.jupiter.api.Test
    void getCircumference(){
        Circle c1= new Circle(1.0d);
        assertEquals(2*Math.PI,c1.getCircumference());
    }
    @org.junit.jupiter.api.Test
    void testtoString(){
        Circle c1= new Circle(1.0d);
        assertEquals("Circle[radius="+1.0d+"]",c1.toString());
    }


}