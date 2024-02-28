package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c1= new Cylinder();
        assertEquals(1.0d,c1.getHeight(),"Fallo: height no coincide en el constructor");
        Cylinder c2= new Cylinder(2.0d);
        assertEquals(2.0d,c2.getHeight(),"Fallo: height no coincide en el constructor");
        Cylinder c3= new Cylinder(1.0d,3.0d);
        assertEquals(3.0d,c3.getHeight(),"Fallo: height no coincide en el constructor");
    }

    @Test
    void getVolume() {
        Circle ci1= new Circle();
        Cylinder c1= new Cylinder();
        assertEquals(Math.PI,c1.getVolume(),"Fallo: volume no coincide");
    }
}