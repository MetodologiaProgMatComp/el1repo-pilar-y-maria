package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog dog = new Dog("Dog1");
        assertEquals("Woof", dog.greets());
    }

    @Test
    void testGreets() {
        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");
        assertEquals("Woooof", dog1.greets(dog2));
    }

    @Test
    void testToString() {
        Dog dog = new Dog("Dog1");
        assertEquals("Dog: Dog[Mammal[Animal[name=Dog1]]]", dog.toString());
    }
}