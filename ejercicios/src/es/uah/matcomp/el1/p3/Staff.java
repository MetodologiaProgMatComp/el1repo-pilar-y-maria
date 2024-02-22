package es.uah.matcomp.el1.p3;
import es.uah.matcomp.el1.p3.Person;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String adress, String school, double pay){
        super(name,adress);
        this.school=school;
        this.pay=pay;
    }
    public String getSchool(){
        return this.school;
    }
    public void setSchool(String school){
        this.school=school;
    }
    public double getPay(){
        return this.pay;
    }
    public void setPay(double pay){
        this.pay=pay;
    }
    @Override
    public String toString(){
        return "Staff[Person[name="+getName()+"adress"+getAdress()+"], school="+school+",pay="+pay+"]";
    }
}
