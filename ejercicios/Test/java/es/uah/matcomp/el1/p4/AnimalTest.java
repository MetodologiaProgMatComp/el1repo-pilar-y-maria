package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void getName(){
        Animal d1 = new Dog( "Coco");
        assertEquals("Coco",d1.getName());
    }
    @Test
    void greets() {
        Animal cat = new Cat("Pelusa");
        Animal dog = new Dog("Piñón");
        Animal bigDog = new BigDog("Fuet");

        assertEquals("Meow", cat.greets());
        assertEquals("Woof", dog.greets());
        assertEquals("Wooow", bigDog.greets());
    }
}