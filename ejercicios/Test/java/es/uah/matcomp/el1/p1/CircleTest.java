package es.uah.matcomp.el1.p1;

import es.uah.matcomp.el1.p1.Circle;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @org.junit.jupiter.api.Test
    void getRadius(){
        Circle c1= new Circle();
        assertEquals(1.0d,c1.getRadius(),"Fallo: Los radios no coinciden en el constructor por defecto");
        Circle c2= new Circle(2.0d);
        assertEquals(2.0d,c2.getRadius(),"Fallo: los radios no coinciden en el constructor especifico de radio");
    }
    @org.junit.jupiter.api.Test
    void setRadius(){
        Circle c1= new Circle(1.0d);
        c1.setRadius(2.0d);
        assertEquals(2.0d,c1.getRadius(), "Fallo: los radios no coinciden");
    }
    @org.junit.jupiter.api.Test
    void getArea(){
        Circle c1= new Circle(1.0d);
        assertEquals(Math.PI,c1.getArea(), "Fallo: el area no coincide");
    }
    @org.junit.jupiter.api.Test
    void getCircumference(){
        Circle c1= new Circle(1.0d);
        assertEquals(2*Math.PI,c1.getCircumference(), "Fallo: el perimetro no coincide");
    }
    @org.junit.jupiter.api.Test
    void testToString(){
        Circle c1= new Circle(1.0d);
        assertEquals("Circle[radius="+1.0d+"]",c1.toString(), "Fallo: no coincide el toString");
    }


}