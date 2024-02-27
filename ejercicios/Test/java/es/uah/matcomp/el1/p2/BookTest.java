package es.uah.matcomp.el1.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8d, 88);
        assertEquals("12345",b1.getIsbn(),"Fallo:isbn no coincide en el constructor");
        Book b2 = new Book("12346", "Java for dummies", a1, 8.8d);
        assertEquals("12346",b2.getIsbn(),"Fallo:isbn no coincide en el constructor");
    }

    @Test
    void getName() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8d, 88);
        assertEquals("Java for dummies",b1.getName(),"Fallo:los nombres no coinciden");
    }

    @Test
    void getAuthor() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8d, 88);
        assertEquals(a1,b1.getAuthor(),"Fallo:Author no coincide");
    }

    @Test
    void getPrice() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8d, 88);
        assertEquals(8.8d,b1.getPrice(),"Fallo:los precios no coinciden");
    }

    @Test
    void setPrice() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8d, 88);
        b1.setPrice(8.9d);
        assertEquals(8.9d,b1.getPrice(),"Fallo:los precios no coinciden en el set");
    }

    @Test
    void getQty() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8d, 88);
        assertEquals(88,b1.getQty(),"Fallo:los qty no coinciden");
    }

    @Test
    void setQty() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8d, 88);
        b1.setQty(89);
        assertEquals(89,b1.getQty(),"Fallo:los qty no coinciden en el set");
    }

    @Test
    void getAuthorName() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8d, 88);
        assertEquals("Tan Ah Teck",b1.getAuthorName(),"Fallo:el nombre del autor no coincide");
    }

    @Test
    void testToString() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8d, 88);
        String actual="Book[isbn="+"12345"+",name="+"Java for dummies"+",Author[name="+"Tan Ah Teck"+",email="+"ahteck@nowhere.com"+"],price="+8.8d+",qty="+88+"]";
        assertEquals(actual ,b1.toString(),"Fallo:toString no coincide");

    }
}