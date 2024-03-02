package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);
        assertEquals("(x,y)=1,2, speed=(3,4), radius=5", circle.toString(), "Los toString no coinciden");
    }

    @Test
    void moveUp() {
        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);
        circle.moveUp();
        assertEquals(1, circle.x, "Fallo moveUp en X");
        assertEquals(-2, circle.y, "Fallo moveUp en Y");
    }

    @Test
    void moveDown() {
        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);
        circle.moveDown();
        assertEquals(1, circle.x, "Fallo moveDown en X");
        assertEquals(6, circle.y, "Fallo moveDown en Y");
    }

    @Test
    void moveLeft() {
        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);
        circle.moveLeft();
        assertEquals(-2, circle.x, "Fallo moveLeft en X");
        assertEquals(2, circle.y, "Fallo moveLeft en Y");
    }

    @Test
    void moveRight() {
        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);
        circle.moveRight();
        assertEquals(4, circle.x, "Fallo moveRight en X");
        assertEquals(2, circle.y, "Fallo moveRight en Y");
    }

    public static void main(String[] args) {
        // Crear un círculo móvil
        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);

        // Imprimir el estado inicial del círculo
        System.out.println("Estado inicial del círculo:");
        System.out.println(circle);

        // Mover el círculo
        circle.moveUp();
        circle.moveRight();

        // Imprimir el estado del círculo después de moverlo
        System.out.println("Estado del círculo después de moverlo:");
        System.out.println(circle);
    }
}
