package es.uah.matcomp.el1.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {
        Account account = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("A101", account.getID());
    }

    @Test
    void getName() {
        Account account = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("Tan Ah Teck", account.getName());
    }

    @Test
    void getBalance() {
        Account account = new Account("A101", "Tan Ah Teck", 88);
        assertEquals(88, account.getBalance());
    }

    @Test
    void credit() {
        Account account = new Account("A101", "Tan Ah Teck", 88);
        account.credit(100);
        assertEquals(188, account.getBalance());
    }

    @Test
    void debit() {
        Account account = new Account("A101", "Tan Ah Teck", 88);
        account.debit(50);
        assertEquals(38, account.getBalance());
    }

    @Test
    void transferTo() {
        Account sourceAccount = new Account("A101", "Tan Ah Teck", 200);
        Account destinationAccount = new Account("A102", "Kumar");
        sourceAccount.transferTo(destinationAccount, 100);
        assertEquals(100, sourceAccount.getBalance());
        assertEquals(100, destinationAccount.getBalance());

    }

    @Test
    void testToString() {
        Account account = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("Account[id=A101,name=Tan Ah Teck,balance=88]", account.toString());
    }
}