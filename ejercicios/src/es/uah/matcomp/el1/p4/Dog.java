package es.uah.matcomp.el1.p4;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Animal another){
        System.out.println("Woooof");
    }
    public void greets(Dog antoher){
        System.out.println("Woooof");
    }
}
