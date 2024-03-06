package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s1= new Circle();
        assertEquals("red",s1.getColor(),"Fallo los colores no coinciden");
    }

    @Test
    void setColor() {
        Shape s1= new Circle(1.0d,"red",false);
        s1.setColor("green");
        assertEquals("green",s1.getColor(),"Fallo los colores no coinciden en el set");
    }

    @Test
    void isFilled() {
        Shape s1= new Circle(1.0d,"red",false);
        assertEquals(false ,s1.isFilled(),"Fallo filled no coincide");
    }

    @Test
    void setFilled() {
        Shape s1= new Circle(1.0d,"red",false);
        s1.setFilled(true);
        assertEquals(true,s1.isFilled(),"Fallo filled no coinciden en el set");
    }

    @Test
    void getArea() {
        Shape c2=new Circle(1.0d);
        assertEquals(Math.PI,c2.getArea(),"Fallo:las areas no coinciden");
    }

    @Test
    void getPerimeter() {
        Shape c2=new Circle(1.0d);
        assertEquals(2*Math.PI,c2.getPerimeter(),"Fallo:los perimetros no coinciden");
    }

    @Test
    void testToString() {
        Shape s1= new Circle(1.0d,"red",false);
        assertEquals("Circle[Shape[color=red,filled="+false+",radius="+1.0+"]",s1.toString(),"Fallo: toString no coincide");
    }
}