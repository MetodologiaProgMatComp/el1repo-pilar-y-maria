package es.uah.matcomp.el1.p1;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    //CONSTRUCTOR
    public Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    public int getId(){return this.id; }
    public String getFirstName(){return this.firstName; }
    public String getLastName(){return this.lastName; }
    public String getName(){return this.firstName+" "+this.lastName;}
    public int getSalary(){return this.salary; }
    public void setSalary(int salary){this.salary=salary; }
    public int getAnnualSalary(){return salary*12; }
    public int raiseSalary(int percent) {
        double increaseFactor = 1 + percent / 100.0;
        double increasedSalary = salary * increaseFactor;
        return (int) increasedSalary;
    }
    public String toString(){return "Employee[id="+id+",name="+firstName+" "+lastName+",salary="+salary+"]"; }

}
