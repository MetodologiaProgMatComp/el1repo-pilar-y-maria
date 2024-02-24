package es.uah.matcomp.el1.p3;

public class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
    public String greets(){return "Woof";}
    public String greets(Dog another){return "Woooof"; }
    @Override
    public String toString(){return "Dog: Dog[Mammal[Animal[name="+name+"]]]"; }
}
