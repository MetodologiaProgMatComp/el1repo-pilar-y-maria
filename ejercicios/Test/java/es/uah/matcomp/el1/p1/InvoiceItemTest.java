package es.uah.matcomp.el1.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08d);
        assertEquals("A101",i1.getId(),"Fallo: los id no coinciden en el constructor");
        InvoiceItem i2 = new InvoiceItem("A102", "Pen Red", 888, 0.08d);
        assertEquals("A102",i2.getId(),"Fallo: los id no coinciden");
    }

    @Test
    void getDesc() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08d);
        assertEquals("Pen Red",i1.getDesc(),"Fallo: los desc no coinciden");
    }

    @Test
    void getQty() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08d);
        assertEquals(888,i1.getQty(),"Fallo: los qty no coinciden");
    }

    @Test
    void setQty() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08d);
        i1.setQty(889);
        assertEquals(889,i1.getQty(),"Fallo: los qty no coinciden en el set");
    }

    @Test
    void getUnitPrice() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08d);
        assertEquals(0.08d,i1.getUnitPrice(),"Fallo: los unitprice no coinciden");
    }

    @Test
    void setUnitPrice() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08d);
        i1.setUnitPrice(0.09d);
        assertEquals(0.09d,i1.getUnitPrice(),"Fallo: los unitprice no coinciden en el set");
    }

    @Test
    void getTotal() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 10, 0.01d);
        assertEquals(0.10d,i1.getTotal(),"Fallo: los totales no coinciden en el set");
    }

    @Test
    void testToString() {
        InvoiceItem i1 = new InvoiceItem("A101", "Pen Red", 888, 0.08d);
        assertEquals("InvoiceItem[id="+"A101"+",desc="+"Pen Red"+",qty="+888+",unitPrice="+0.08d+"]",i1.toString(),"Fallo: los toString no coinciden");
    }
}