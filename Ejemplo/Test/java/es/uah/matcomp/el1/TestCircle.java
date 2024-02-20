package es.uah.matcomp.el1;

import static org.junit.jupiter.api.Assertions.*;

import es.uah.matcomp.el1ejemplos.Circle;
import org.junit.jupiter.api.Test;

/**
 * A Test class for the Circle class
 */
public class TestCircle { // Save as "TestCircle.java"

    @Test
    public void testCircle() {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        assertEquals(1.0, c1.getRadius());
        assertEquals("red", c1.getColor());
        assertEquals(Math.PI, c1.getArea(), 0.0001);

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        assertEquals(2.0, c2.getRadius());
        assertEquals("red", c2.getColor());
        assertEquals(12.566370614359172, c2.getArea(), 0.0001);

        // Test setting radius and color
        Circle c3 = new Circle();
        c3.setRadius(3.0);
        assertEquals(3.0, c3.getRadius());
        c3.setColor("blue");
        assertEquals("blue", c3.getColor());

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString()); // explicit call

        Circle c6 = new Circle(6.6);
        System.out.println(c6.toString()); // explicit call
        System.out.println(c6); // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + c6); // '+' invokes toString() too
    }
}
