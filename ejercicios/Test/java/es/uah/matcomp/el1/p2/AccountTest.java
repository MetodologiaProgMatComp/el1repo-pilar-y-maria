package es.uah.matcomp.el1.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        Account a1 = new Account(2222, c1, 8.8d);
        assertEquals(2222,a1.getId(),"Fallo: los id no coinciden en el constructor");
        Account a2 = new Account(2223, c1);
        assertEquals(2223,a2.getId(),"Fallo: los id no coinciden en el constructor");
    }

    @Test
    void getCustomer2() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        Account a1 = new Account(2222, c1, 8.8d);
        assertEquals(c1,a1.getCustomer2(),"Fallo: Customer2 no coincide");
    }

    @Test
    void getBalance() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        Account a1 = new Account(2222, c1, 8.8d);
        assertEquals(8.8d,a1.getBalance(),"Fallo: los balance no coinciden");
    }

    @Test
    void setBalance() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        Account a1 = new Account(2222, c1, 8.8d);
        a1.setBalance(8.9d);
        assertEquals(8.9d,a1.getBalance(),"Fallo: los balance no coinciden");
    }

    @Test
    void testToString() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        Account a1 = new Account(2222, c1, 8.8d);
        assertEquals("Alfonso"+"("+5555+") balance= $"+8.8d,a1.toString(),"Fallo: los toStringno coinciden");
    }

    @Test
    void getCustomerName() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        Account a1 = new Account(2222, c1, 8.8d);
        assertEquals("Alfonso",a1.getCustomerName(),"Fallo: los customer name no coinciden");

    }

    @Test
    void deposit() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        Account a1 = new Account(2222, c1, 8.8d);
        assertEquals(8.9d,a1.deposit(0.1d),"Fallo: los deposit no coinciden");
    }

    @Test
    void withdraw() {
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        Account a1 = new Account(2222, c1, 8.8d);
        assertEquals(8.7d,a1.withdraw(0.1d),0.1d,"Fallo: los withdraw no coinciden");

        Account a2 = new Account(2222, c1, 0.1d);
        assertEquals(0.1d,a2.withdraw(8.0d),0.1d,"Fallo: los withdraw no coinciden");
    }
}