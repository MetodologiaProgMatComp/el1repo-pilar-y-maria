package es.uah.matcomp.el1.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("Tan Ah Teck",a1.getName(),"Fallo: no coinciden los nombres en el constructor");
        Author a2 = new Author("Manolo", "manolo@nowhere.com");
        assertEquals("Manolo",a2.getName(),"Fallo: no coinciden los nombres ");
    }

    @Test
    void getEmail() {
        Author a2 = new Author("Manolo", "manolo@nowhere.com");
        assertEquals("manolo@nowhere.com",a2.getEmail(),"Fallo: no coinciden los email ");
    }

    @Test
    void setEmail() {
        Author a2 = new Author("Manolo", "manolo@nowhere.com");
        a2.setEmail("manolo@gmail.com");
        assertEquals("manolo@gmail.com",a2.getEmail(),"Fallo: no coinciden los email en el set ");
    }

    @Test
    void testToString() {
        Author a2 = new Author("Manolo", "manolo@nowhere.com");
        assertEquals("Author[name="+"Manolo"+",email="+"manolo@nowhere.com"+"]",a2.toString(),"Fallo: no coinciden los email ");
    }
}