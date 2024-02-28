package es.uah.matcomp.el1.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 0);
        MyPoint p3 = new MyPoint(0, 4);
        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        assertEquals("MyTriangle[v1="+p1+"v2="+p2+"v3="+p3+"]", t1.toString(),"Fallo: toString no coincide");
    }

    @Test
    void getPerimeter() {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 0);
        MyPoint p3 = new MyPoint(0, 4);
        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        MyTriangle t2= new MyTriangle(0,0,3,0,0,4);
        assertEquals(12.0, t1.getPerimeter(),"Fallo: perimeter no coincide");
        assertEquals(12.0, t2.getPerimeter(),"Fallo: perimeter no coincide");

    }

    @Test
    void getType() {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 0);
        MyPoint p3 = new MyPoint(0, 4);
        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        assertEquals("Escaleno", t1.getType(),"Fallo: el tipo no coincide");
    }
}