package es.uah.matcomp.el1.p3;

public abstract class Animal {
    protected String name;
    public Animal (String name){
        this.name=name;
    }
    public String toString() {
        return "Animal: animal [name=" + name + "]";
    }

}
