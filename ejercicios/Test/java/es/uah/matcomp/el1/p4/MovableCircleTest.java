package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);
        String expected = "(x,y)=1,2, speed=(3,4), radius=5";
        String actual = circle.toString();
        assertEquals(expected, actual, "Fallo en toString(): la representación del círculo móvil no es la esperada");
    }
}