package es.uah.matcomp.el1.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyLineTest {

    @Test
    void getBegin() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(2, 2);
        MyLine l1= new MyLine(p1,p2);
        assertEquals(p1,l1.getBegin(),"Fallo: begin no coincide en el constructor");
    }

    @Test
    void setBegin() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(2, 2);
        MyPoint p3 = new MyPoint(3, 3);
        MyLine l1= new MyLine(p1,p2);
        l1.setBegin(p3);

        assertEquals(p3,l1.getBegin(),"Fallo: begin no coincide en el set");

    }

    @Test
    void getEnd() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(2, 2);
        MyLine l1= new MyLine(p1,p2);
        assertEquals(p2,l1.getEnd(),"Fallo: end no coincide en el constructor");
    }

    @Test
    void setEnd() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(2, 2);
        MyPoint p3 = new MyPoint(3, 3);
        MyLine l1= new MyLine(p1,p2);
        l1.setEnd(p3);

        assertEquals(p3,l1.getEnd(),"Fallo: end no coincide en el set");
    }

    @Test
    void getBeginX() {
        MyLine l1= new MyLine(1,1,2,2);

        assertEquals(1,l1.getBeginX(),"Fallo: beginx no coincide ");
    }

    @Test
    void setBeginX() {
        MyPoint p1= new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyLine l1= new MyLine(p1,p2);
        l1.setBeginX(4);
        assertEquals(4,l1.getBeginX(),"Fallo: beginx no coincide en el set ");
    }

    @Test
    void getBeginY() {
        MyLine l1= new MyLine(1,1,2,2);

        assertEquals(2,l1.getBeginY(),"Fallo: beginy no coincide ");
    }

    @Test
    void setBeginY() {
        MyPoint p1= new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyLine l1= new MyLine(p1,p2);
        l1.setBeginY(4);
        assertEquals(4,l1.getBeginY(),"Fallo: beginy no coincide en el set ");
    }

    @Test
    void getEndX() {
        MyLine l1= new MyLine(1,1,2,2);

        assertEquals(1,l1.getEndX(),"Fallo: endx no coincide ");
    }

    @Test
    void setEndX() {
        MyPoint p1= new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyLine l1= new MyLine(p1,p2);
        l1.setEndX(4);
        assertEquals(4,l1.getEndX(),"Fallo: endx no coincide en el set ");
    }

    @Test
    void getEndY() {
        MyLine l1= new MyLine(1,1,2,2);

        assertEquals(2,l1.getEndY(),"Fallo: endy no coincide ");
    }

    @Test
    void setEndY() {
        MyPoint p1= new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyLine l1= new MyLine(p1,p2);
        l1.setEndY(4);
        assertEquals(4,l1.getEndY(),"Fallo: endy no coincide en el set ");
    }

    @Test
    void getBeginXY() {
        MyPoint p1= new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyLine l1= new MyLine(p1,p2);
        int[] esperado= new int[] {1,1};

        assertArrayEquals(esperado,l1.getBeginXY(),"Fallo: beginxy no coincide ");
    }

    @Test
    void setBeginXY() {
        MyPoint p1= new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyLine l1= new MyLine(p1,p2);
        l1.setBeginXY(3,3);
        int[] esperado= new int[] {3,3};

        assertArrayEquals(esperado,l1.getBeginXY(),"Fallo: beginxy no coincide en el set");
    }

    @Test
    void getEndXY() {
        MyPoint p1= new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyLine l1= new MyLine(p1,p2);
        int[] esperado= new int[] {2,2};

        assertArrayEquals(esperado,l1.getEndXY(),"Fallo: endxy no coincide ");
    }

    @Test
    void setEndXY() {
        MyPoint p1= new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyLine l1= new MyLine(p1,p2);
        l1.setEndXY(3,3);
        int[] esperado= new int[] {3,3};

        assertArrayEquals(esperado,l1.getEndXY(),"Fallo: endxy no coincide en el set");
    }

    @Test
    void getLenght() {
        MyPoint p1= new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyLine l1= new MyLine(p1,p2);

        assertEquals(Math.sqrt(2d),l1.getLenght(),"Fallo: lenght no coincide");
    }

    @Test
    void getGradient() {
        MyPoint p1= new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyLine l1= new MyLine(p1,p2);

        assertEquals(Math.atan2(1d,1d),l1.getGradient(),"Fallo: gradient no coincide");
    }

    @Test
    void testToString() {
        MyPoint p1= new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyLine l1= new MyLine(p1,p2);

        assertEquals("MyLine[begin=" + p1+ ","+p2+"]",l1.toString(),"Fallo: toString no coincide");
    }
}
