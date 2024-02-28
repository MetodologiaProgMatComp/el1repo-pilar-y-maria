package es.uah.matcomp.el1.p3;

import es.uah.matcomp.el1.p2.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D p2 = new Point2D();
        assertEquals(0.0f, p2.getX(), "Fallo: x no coincide en el constructor");
        Point2D p1 = new Point2D(1.0f,1.0f);
        assertEquals(1.0f, p1.getX(), "Fallo: x no coincide en el constructor");
    }

    @Test
    void setX() {
        Point2D p1 = new Point2D(1.0f,1.0f);
        p1.setX(2.0f);
        assertEquals(2.0f, p1.getX(), "Fallo: x no coincide en el set");
    }

    @Test
    void getY() {
        Point2D p1 = new Point2D(1.0f,1.0f);
        assertEquals(1.0f, p1.getY(), "Fallo: y no coincide");
    }

    @Test
    void setY() {
        Point2D p1 = new Point2D(1.0f,1.0f);
        p1.setY(2.0f);
        assertEquals(2.0f, p1.getY(), "Fallo: y no coincide en el set");
    }

    @Test
    void setXY() {
        Point2D p1 = new Point2D(1.0f,1.0f);
        p1.setXY(2.0f,2.0f);
        float[] esperado= new float[] {2.0f,2.0f};
        assertArrayEquals(esperado, p1.getXY(), "Fallo: xy no coincide en el set");
    }

    @Test
    void getXY() {
        Point2D p1 = new Point2D(1.0f,1.0f);
        float[] esperado= new float[] {1.0f,1.0f};
        assertArrayEquals(esperado, p1.getXY(), "Fallo: xy no coincide ");
    }

    @Test
    void testToString() {
        Point2D p1 = new Point2D(1.0f,1.0f);
        assertEquals("("+1.0f+","+1.0f+")", p1.toString(), "Fallo: toString no coincide ");
    }
}