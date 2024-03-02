package es.uah.matcomp.el1.p4;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public String greets(){
        return "Meow";
    }
}
