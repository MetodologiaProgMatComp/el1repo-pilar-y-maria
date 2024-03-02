package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void getName() {
        Animal cat = new Cat("Pelusa");
        assertEquals("Pelusa", cat.getName());

        Animal dog = new Dog("Piñón");
        assertEquals("Piñón", dog.getName());
    }

    @Test
    void greets() {
        Animal cat = new Cat("Pelusa");
        assertEquals("Meow", cat.greets());

        Animal dog = new Dog("Piñón");
        assertEquals("Woof", dog.greets());
    }
}
