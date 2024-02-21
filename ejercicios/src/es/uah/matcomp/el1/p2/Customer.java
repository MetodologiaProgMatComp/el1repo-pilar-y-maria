package es.uah.matcomp.el1.p2;

public class Customer {
    private int id;
    private String name;
    private int discount;

    //CONSTRUCTORES
    public Customer(int id, String name, int discount){
        this.id=id;
        this.name=name;
        this.discount=discount;
    }

    //MÉTODOS
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getDiscount(){
        return this.discount;
    }
    public void setDiscount(int discount){
        this.discount=discount;
    }
    public String toString(){
        return name+"("+id+")("+discount+"%)";
    }

}
