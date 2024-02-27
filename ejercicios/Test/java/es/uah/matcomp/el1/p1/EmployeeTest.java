package es.uah.matcomp.el1.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee employee = new Employee(8, "Peter", "Tan", 999);
        assertEquals(8, employee.getId());
    }

    @Test
    void getFirstName() {
        Employee employee = new Employee(8, "Peter", "Tan", 999);
        assertEquals("Peter", employee.getFirstName());;
    }

    @Test
    void getLastName() {
        Employee employee = new Employee (8, "Peter", "Tan", 999);
        assertEquals("Tan", employee.getLastName());
    }

    @Test
    void getName() {
        Employee employee = new Employee(8, "Peter", "Tan", 999);
        assertEquals("Peter Tan", employee.getName());
    }

    @Test
    void getSalary() {
        Employee employee = new Employee(8, "Peter", "Tan", 999);
        assertEquals(999, employee.getSalary());
    }

    @Test
    void setSalary() {
        Employee employee = new Employee(8, "Peter", "Tan", 999);
        employee.setSalary(1500);
        assertEquals(1500, employee.getSalary());
    }

    @Test
    void getAnnualSalary() {
        Employee employee = new Employee(8, "Peter", "Tan", 999);
        assertEquals(11988, employee.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        Employee employee = new Employee(8, "Peter", "Tan", 1000);
        assertEquals(1100, employee.raiseSalary(10));
    }

    @Test
    void testToString() {
        Employee employee = new Employee(8, "Peter", "Tan", 999);
        assertEquals("Employee[id=8,name=Peter Tan,salary=999]", employee.toString());
    }
}