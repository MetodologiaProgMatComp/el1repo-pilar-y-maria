package es.uah.matcomp.el1.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadius() {
        MyPoint center = new MyPoint(0,0);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(5, circle.getRadius());
    }

    @Test
    void setRadius() {
        MyPoint center = new MyPoint(0,0);
        MyCircle circle = new MyCircle(center, 5);
        circle.setRadius(10);
        assertEquals(10, circle.getRadius());
    }

    @Test
    void getCenter() {
        MyPoint center = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(center, circle.getCenter());
    }

    @Test
    void setCenter() {
        MyPoint center = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center, 5);
        MyPoint newCenter = new MyPoint(2,2);
        circle.setCenter(newCenter);
        assertEquals(newCenter, circle.getCenter());
    }

    @Test
    void getCenterX() {
        MyPoint center = new MyPoint(1,1);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(1, circle.getCenterX());
    }

    @Test
    void setCenterX() {
        MyPoint center = new MyPoint(1, 1);
        MyCircle circle = new MyCircle(center, 5);
        circle.setCenterX(2);
        assertEquals(2, circle.getCenterX());
    }

    @Test
    void getCenterY() {
        MyPoint center = new MyPoint(1, 1);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(1, circle.getCenterY());
    }

    @Test
    void setCenterY() {
        MyPoint center = new MyPoint(1, 1);
        MyCircle circle = new MyCircle(center, 5);
        circle.setCenterY(2);
        assertEquals(2, circle.getCenterY());
    }

    @Test
    void getCenterXY() {
        MyPoint center = new MyPoint(1, 1);
        MyCircle circle = new MyCircle(center, 5);
        assertArrayEquals(new int[]{1, 1}, circle.getCenterXY());
    }

    @Test
    void setCenterXY() {
        MyPoint center = new MyPoint(1, 1);
        MyCircle circle = new MyCircle(center, 5);
        circle.setCenterXY(2, 2);
        assertArrayEquals(new int[]{2, 2}, circle.getCenterXY());
    }

    @Test
    void testToString() {
        MyPoint center = new MyPoint(1, 1);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals("MyCircle[radius=5,center=(1,1)]", circle.toString());
    }

    @Test
    void getArea() {
        MyPoint center = new MyPoint(1, 1);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(Math.PI*25, circle.getArea());
    }

    @Test
    void getCircumference() {
        MyPoint center = new MyPoint(1, 1);
        MyCircle circle = new MyCircle(center, 5);
        assertEquals(2*Math.PI*5, circle.getCircumference());
    }

    @Test
    void distance() {
        MyPoint center1 = new MyPoint(1, 1);
        MyPoint center2 = new MyPoint(4, 5);
        MyCircle circle1 = new MyCircle(center1, 5);
        MyCircle circle2 = new MyCircle(center2, 3);
        assertEquals(Math.sqrt(3*3+4*4), circle1.distance(circle2));
    }
}