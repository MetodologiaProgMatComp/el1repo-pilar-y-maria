import es.uah.matcomp.el1.p1.Account;
import es.uah.matcomp.el1.p4.MovableCircle;
import es.uah.matcomp.el1.p4.MovablePoints;

public class MainAccount {
    public static void main(String[] args) {
        // Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1); // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);
        // Test Getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());
        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500); // debit() error
        System.out.println(a1);
        // Test transfer()
        a1.transferTo(a2, 100); // toString()
        System.out.println(a1);
        System.out.println(a2);
    }

    public static class MainMovableCircle {
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
}
