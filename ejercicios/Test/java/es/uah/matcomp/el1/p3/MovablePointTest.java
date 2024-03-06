package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getXSpeed() {
        MovablePoint movablePoint = new MovablePoint(3.0f, 4.0f);
        assertEquals(3.0f, movablePoint.getXSpeed());
    }

    @Test
    void setXSpeed() {
        MovablePoint movablePoint = new MovablePoint(3.0f, 4.0f);
        movablePoint.setXSpeed(5.0f);
        assertEquals(5.0f, movablePoint.getXSpeed());
    }

    @Test
    void getYSpeed() {
        MovablePoint movablePoint = new MovablePoint(3.0f, 4.0f);
        assertEquals(4.0f, movablePoint.getYSpeed());

        MovablePoint movablePoint = new MovablePoint(3.0f, 4.0f);
        assertEquals(4.0f, movablePoint.getYSpeed());
    }

    @Test
    void testGetYSpeed() {
        MovablePoint movablePoint = new MovablePoint(1.0f,1.0f,1.0f,1.0f);
        assertEquals(1.0f, movablePoint.getYSpeed());
    }

    @Test
    void setSpeed() {
        MovablePoint movablePoint = new MovablePoint(3.0f, 4.0f);
        movablePoint.setSpeed(5.0f, 6.0f);
        assertEquals(5.0f, movablePoint.getXSpeed());
        assertEquals(6.0f, movablePoint.getYSpeed());
    }

    @Test
    void getSpeed() {
        MovablePoint movablePoint = new MovablePoint(3.0f, 4.0f);
        float[] expectedSpeed = {3.0f, 4.0f};
        assertArrayEquals(expectedSpeed, movablePoint.getSpeed());
    }

    @Test
    void testToString() {
        MovablePoint movablePoint = new MovablePoint(3.0f, 4.0f);
        assertEquals("(0.0, 0.0), Speed: (3.0, 4.0)", movablePoint.toString());
    }

    @Test
    void move() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f);
        movablePoint.move();
        assertEquals("(1.0, 2.0), Speed: (1.0, 2.0)", movablePoint.toString());
    }

}
