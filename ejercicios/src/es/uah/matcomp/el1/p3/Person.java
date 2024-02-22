package es.uah.matcomp.el1.p3;

public class Person {
    private String name;
    private String adress;
    public Person(String name, String adress){
        this.name=name;
        this.adress=adress;
    }
    public String getName(){
        return this.name;
    }
    public String getAdress(){
        return this.adress;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    public String toString(){
        return "Person[name="+name+",adress="+adress+"]";
    }
}
