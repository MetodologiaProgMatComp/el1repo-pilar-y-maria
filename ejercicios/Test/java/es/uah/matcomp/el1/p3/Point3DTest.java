package es.uah.matcomp.el1.p3;

import es.uah.matcomp.el1.p2.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D p1= new Point3D(1.0f,1.0f,1.0f);
        assertEquals(1.0f,p1.getZ(),"Fallo: z no coincide en el constructor");
    }

    @Test
    void setZ() {
        Point3D p1= new Point3D(1.0f,1.0f,1.0f);
        p1.setZ(2.0f);
        assertEquals(2.0f,p1.getZ(),"Fallo: z no coincide en el set");
    }

    @Test
    void setXYZ() {
        Point3D p1= new Point3D(1.0f,1.0f,1.0f);
        p1.setXYZ(2.0f,2.0f,2.0f);
        float[] esperado= new float[]{2.0f,2.0f,2.0f};
        assertArrayEquals(esperado,p1.getXYZ(),"Fallo: xyz no coincide en el set");
    }

    @Test
    void getXYZ() {
        Point3D p1= new Point3D(1.0f,1.0f,1.0f);
        float[] esperado= new float[]{1.0f,1.0f,1.0f};
        assertArrayEquals(esperado,p1.getXYZ(),"Fallo: xyz no coincide en el constructor");
    }

    @Test
    void testToString() {
        Point3D p1= new Point3D(1.0f,1.0f,1.0f);
        assertEquals("("+1.0f+","+1.0f+","+1.0f+")",p1.toString(),"Fallo: los toString no coinciden");
    }
}