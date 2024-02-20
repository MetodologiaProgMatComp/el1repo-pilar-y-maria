

import es.uah.matcomp.el1ejemplos.Circle;


public class MainEjemplo { // Save as "TestCircle.java"

    static public void main(String[] s) {
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);

        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle();
        c3.setRadius(3.0);
        System.out.println("radius is: " + c3.getRadius());
        c3.setColor("blue");
        System.out.println("color is: " + c3.getColor());
    }
}
