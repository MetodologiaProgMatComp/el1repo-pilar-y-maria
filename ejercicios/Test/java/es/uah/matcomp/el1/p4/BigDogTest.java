package es.uah.matcomp.el1.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        BigDog bigDog = new BigDog("Fuet");
        assertDoesNotThrow(bigDog::greets);
    }

    @Test
    void testGreets() {
        BigDog bigDog1 = new BigDog("Fuet");
        BigDog bigDog2 = new BigDog("Rex");
        assertDoesNotThrow(() -> bigDog1.greets(bigDog2));
    }

    @Test
    void testGreets1() {
        BigDog bigDog1 = new BigDog("Fuet");
        BigDog bigDog2 = new BigDog("Rex");
        assertDoesNotThrow(() -> bigDog1.greets(bigDog2));
    }
}