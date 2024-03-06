package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        BigDog bigDog = new BigDog("Fuet");
        assertEquals("Wooow",bigDog.greets());
    }

    @Test
    void testGreets() {
        Dog Dog3 = new Dog("Fuet");
        BigDog bigDog2 = new BigDog("Rex");
        assertEquals("Woooooow", bigDog2.greets(Dog3));
    }

    @Test
    void testGreets1() {
        BigDog bigDog1 = new BigDog("Fuet");
        BigDog bigDog4 = new BigDog("Rex");
        assertEquals("Woooooooow", bigDog4.greets(bigDog1));
    }
}