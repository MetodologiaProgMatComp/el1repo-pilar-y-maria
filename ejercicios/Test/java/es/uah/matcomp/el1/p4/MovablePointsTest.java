package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointsTest {

    @Test
    void testToString() {
        MovablePoints m1 = new MovablePoints(1,1,2,2);
        assertEquals("("+1+","+1+") speed=("+2+","+2+")",m1.toString(),"Fallo los toString no coinciden");
    }

    @Test
    void moveUp() {
        MovablePoints m1 = new MovablePoints(1,1,2,2);
        m1.moveUp();
        assertEquals(1,m1.x,"Fallo moveUp no coincide");
        assertEquals(-1,m1.y,"Fallo moveUp no coincide");
    }

    @Test
    void moveDown() {
        MovablePoints m1 = new MovablePoints(1,1,2,2);
        m1.moveDown();
        assertEquals(1,m1.x,"Fallo moveDown no coincide");
        assertEquals(3,m1.y,"Fallo moveDown no coincide");
    }

    @Test
    void moveLeft() {
        MovablePoints m1 = new MovablePoints(1,1,2,2);
        m1.moveLeft();
        assertEquals(-1,m1.x,"Fallo moveLeft no coincide");
        assertEquals(1,m1.y,"Fallo moveLeft no coincide");
    }

    @Test
    void moveRight() {
        MovablePoints m1 = new MovablePoints(1,1,2,2);
        m1.moveRight();
        assertEquals(3,m1.x,"Fallo moveRight no coincide");
        assertEquals(1,m1.y,"Fallo moveRight no coincide");
    }
}