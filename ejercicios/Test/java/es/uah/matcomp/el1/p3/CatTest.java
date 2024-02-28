package es.uah.matcomp.el1.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat cat = new Cat("Cat1");
        assertEquals("Meow", cat.greets());
    }

    @Test
    void testToString() {
        Cat cat = new Cat("Cat1");
        assertEquals("Cat: Cat[Mammal[Animal[name=Cat1]]]", cat.toString());
    }
}