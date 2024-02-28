package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point point = new MovablePoint(3.0f, 4.0f, 1.0f, 2.0f);
        assertEquals(3.0f, point.getX());
    }

    @Test
    void setX() {
        Point point = new MovablePoint(3.0f, 4.0f, 1.0f, 2.0f);
        point.setX(5.0f);
        assertEquals(5.0f, point.getX());
    }

    @Test
    void getY() {
        Point point = new MovablePoint(3.0f, 4.0f, 1.0f, 2.0f);
        assertEquals(4.0f, point.getY());
    }

    @Test
    void setY() {
        Point point = new MovablePoint(3.0f, 4.0f, 1.0f, 2.0f);
        point.setY(5.0f);
        assertEquals(5.0f, point.getY());
    }

    @Test
    void setXY() {
        Point point = new MovablePoint(3.0f, 4.0f, 1.0f, 2.0f);
        point.setXY(5.0f, 6.0f);
        assertEquals(5.0f, point.getX());
        assertEquals(6.0f, point.getY());
    }

    @Test
    void getXY() {
        Point point = new MovablePoint(3.0f, 4.0f, 1.0f, 2.0f);
        float[] expectedXY = {3.0f, 4.0f};
        assertArrayEquals(expectedXY, point.getXY());
    }

    @Test
    void testToString() {
        Point point = new MovablePoint(3.0f, 4.0f, 1.0f, 2.0f);
        assertEquals("(3.0, 4.0), Speed: (1.0, 2.0)", point.toString());
    }

    @Test
    void move() {
        MovablePoint point = new MovablePoint(1.0f, 2.0f, 1.0f, 2.0f); // Se instancia un MovablePoint con velocidad
        Point movedPoint = point.move();
        assertEquals("(2.0, 4.0), Speed: (1.0, 2.0)", movedPoint.toString());
    }
}

