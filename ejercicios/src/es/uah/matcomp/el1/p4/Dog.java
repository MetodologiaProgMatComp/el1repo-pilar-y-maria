package es.uah.matcomp.el1.p4;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String greets() {
        return "Woof";
    }

    public String greets(Dog another) {
        return "Woooof";
    }
}
