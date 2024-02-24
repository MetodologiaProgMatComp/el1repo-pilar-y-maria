package es.uah.matcomp.el1.p4;

public abstract class Animal {
    String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void greets();
}
