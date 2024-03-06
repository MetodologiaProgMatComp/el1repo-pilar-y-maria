package es.uah.matcomp.el1.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint point = new MyPoint(3,4);
        assertEquals(3, point.getX());
    }

    @Test
    void setX() {
        MyPoint point = new MyPoint();
        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    void getY() {
        MyPoint point = new MyPoint(3, 4);
        assertEquals(4, point.getY());
    }

    @Test
    void setY() {
        MyPoint point = new MyPoint();
        point.setY(6);
        assertEquals(6, point.getY());

    }

    @Test
    void getXY() {
        MyPoint point = new MyPoint(3, 4);
        assertArrayEquals(new int[]{3, 4}, point.getXY());
    }

    @Test
    void setXY() {
        MyPoint point = new MyPoint();
        point.setXY(7, 8);
        assertArrayEquals(new int[]{7, 8}, point.getXY());
    }

    @Test
    void testToString() {
        MyPoint point = new MyPoint(3, 4);
        assertEquals("(3,4)", point.toString());
    }

    @Test
    void distance() {
        MyPoint point1 = new MyPoint(3, 4);
        assertEquals(5.0, point1.distance(0,0));
    }

    @Test
    void testDistance() {
        MyPoint point1 = new MyPoint(3, 4);
        assertEquals(5.0, point1.distance());
    }

    @Test
    void testDistance1() {
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint(0,0);
        assertEquals(5.0, point2.distance(point1));
    }
}