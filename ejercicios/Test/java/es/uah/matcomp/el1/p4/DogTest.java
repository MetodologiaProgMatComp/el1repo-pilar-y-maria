package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        assertDoesNotThrow(() -> {
            Dog dog = new Dog("Fido");
            dog.greets();
        });
    }

    @Test
    void testGreets() {
        assertDoesNotThrow(() -> {
            Dog dog = new Dog("Buddy");
            Animal another = new Dog("Max");
            dog.greets(another);
        });
    }
}
