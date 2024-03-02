package es.uah.matcomp.el1.p4;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String greets();
}
