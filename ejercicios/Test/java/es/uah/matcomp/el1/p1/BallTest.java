package es.uah.matcomp.el1.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(1.1f,b1.getX(),"Fallo: x no coincide en el constructor");
        Ball b2 = new Ball(1.2f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(1.2f,b2.getX(),"Fallo: x no coinciden");
    }

    @Test
    void setX() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.setX(1.2f);
        assertEquals(1.2f,b1.getX(),"Fallo: x no coincide en el set");
    }

    @Test
    void getY() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(2.2f,b1.getY(),"Fallo: y no coincide");
    }

    @Test
    void setY() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.setY(2.3f);
        assertEquals(2.3f,b1.getY(),"Fallo: y no coincide en el set");
    }

    @Test
    void getRadius() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(10,b1.getRadius(),"Fallo: los radios no coinciden");
    }

    @Test
    void setRadius() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.setRadius(11);
        assertEquals(11,b1.getRadius(),"Fallo: los radios no coinciden en el set");
    }

    @Test
    void getXDelta() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(3.3f,b1.getXDelta(),"Fallo: xDelta no coincide");
    }

    @Test
    void setXDelta() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.setXDelta(3.4f);
        assertEquals(3.4f,b1.getXDelta(),"Fallo: xDelta no coincide en el set");
    }

    @Test
    void getYDelta() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(4.4f,b1.getYDelta(),"Fallo: yDelta no coincide");
    }

    @Test
    void setYDelta() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.setYDelta(3.4f);
        assertEquals(3.4f,b1.getYDelta(),"Fallo: yDelta no coincide en el set");
    }

    @Test
    void move() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.move();
        assertEquals(4.4f,b1.getX(),0.01f,"Fallo: x no coincide en el move");  //0.01 es el margen de error
        assertEquals(6.6f,b1.getY(),0.01, "Fallo: y no coincide en el move");
    }

    @Test
    void reflectHorizontal() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.reflectHorizontal();
        assertEquals(-3.3,b1.getXDelta(),0.01d,"Fallo:xDelta no se refleja horizontalmente");
    }

    @Test
    void reflectVertical() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        b1.reflectVertical();
        assertEquals(-4.4,b1.getYDelta(),0.01d,"Fallo:yDelta no se refleja verticalmente");
    }

    @Test
    void testToString() {
        Ball b1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals("Ball[("+1.1+","+2.2+"), speed=("+3.3+","+4.4+")]",b1.toString(),"Fallo:no coincide el toString");
    }
}