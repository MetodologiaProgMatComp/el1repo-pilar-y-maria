package es.uah.matcomp.el1.p4;

public class MainMovableCircle {
    public static void main(String[] args) {
        MovablePoints point = new MovablePoints(1, 1, 2, 2);
        System.out.println("Punto móvil:");
        System.out.println(point.toString());

        point.moveUp();
        point.moveRight();
        System.out.println("Después de mover hacia arriba y derecha:");
        System.out.println(point.toString());

        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println("Círculo móvil:");
        System.out.println(circle.toString());

        circle.moveDown();
        circle.moveLeft();
        System.out.println("Después de mover hacia abajo y izquierda:");
        System.out.println(circle.toString());
    }
}
