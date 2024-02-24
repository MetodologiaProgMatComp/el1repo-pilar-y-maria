package es.uah.matcomp.el1.p3;

public class Cat extends Mammal {
    public Cat(String name){
        super(name);
    }
    public String greets(){return "Meow"; }
    @Override
    public String toString(){return "Cat: Cat[Mammal[Animal[name="+name+"]]]"; }
}
