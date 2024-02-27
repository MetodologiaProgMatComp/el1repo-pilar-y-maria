package es.uah.matcomp.el1.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Invoice invoice = new Invoice(101, customer, 888.8);
        assertEquals(101, invoice.getId());
    }

    @Test
    void getCustomer() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Invoice invoice = new Invoice(101, customer, 888.8);
        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    void setCustomer() {
        Customer customer1 = new Customer(88, "Tan Ah Teck", 10);
        Customer customer2 = new Customer(89, "Kumar", 15);
        Invoice invoice = new Invoice(101, customer1, 888.8);
        invoice.setCustomer(customer2);
        assertEquals(customer2, invoice.getCustomer());
    }

    @Test
    void getAmount() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Invoice invoice = new Invoice(101, customer, 888.8);
        assertEquals(888.8, invoice.getAmount());
    }

    @Test
    void setAmount() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Invoice invoice = new Invoice(101, customer, 888.8);
        invoice.setAmount(999.9);
        assertEquals(999.9, invoice.getAmount());
    }

    @Test
    void getCustomerId() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Invoice invoice = new Invoice(101, customer, 888.8);
        assertEquals(88, invoice.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Invoice invoice = new Invoice(101, customer, 888.8);
        assertEquals("Tan Ah Teck", invoice.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Invoice invoice = new Invoice(101, customer, 888.8);
        assertEquals(10, invoice.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Customer customer = new Customer(88, "Tan Ah Teck", 8);
        Invoice invoice = new Invoice(101, customer, 999.9);
        assertEquals(919.908, invoice.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        Invoice invoice = new Invoice(101, customer, 888.8);
        assertEquals("Invoice [id=101,customer=Tan Ah Teck(88)(10%),amount=888.8", invoice.toString());
    }
}