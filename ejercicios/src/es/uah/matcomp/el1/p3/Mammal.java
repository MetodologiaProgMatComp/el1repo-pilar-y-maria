package es.uah.matcomp.el1.p3;

public class Mammal extends Animal {
    public Mammal(String name){
        super(name);
    }
    @Override
    public String toString(){
        return "Mammal [Animal [name="+name+"]]";
    }

}
