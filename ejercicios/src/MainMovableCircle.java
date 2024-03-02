import es.uah.matcomp.el1.p4.MovableCircle;

public class MainMovableCircle {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(3, 4, 1, 2, 5);
        System.out.println("Estado inicial del círculo:");
        System.out.println(circle);

        circle.moveUp();
        circle.moveRight();

        System.out.println("Estado del círculo después de moverlo:");
        System.out.println(circle);
    }

}
