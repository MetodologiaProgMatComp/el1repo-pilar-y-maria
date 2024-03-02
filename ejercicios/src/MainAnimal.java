
import es.uah.matcomp.el1.p4.Animal;
import es.uah.matcomp.el1.p4.BigDog;
import es.uah.matcomp.el1.p4.Cat;
import es.uah.matcomp.el1.p4.Dog;

public class MainAnimal {
    public static void main(String[] args){
        Animal a1 = new Cat("Gato");
        System.out.println(a1.getName() + " says: " + a1.greets());

        Animal a2 = new Dog("Piñon");
        System.out.println(a2.getName() + " says: " + a2.greets());

        Animal a3 = new Dog("Fuet");
        System.out.println(a3.getName() + " says: " + ((Dog) a3).greets(new Dog("another dog")));

        Dog d1 = new BigDog("Coco");
        System.out.println(d1.getName() + " says: " + d1.greets());

        Dog d3 = new BigDog("Lita");
        System.out.println(d3.getName() + " says: " + ((BigDog) d3).greets(new Dog("another dog")));

        Dog d2 = new BigDog( "Pomelo");
        System.out.println(d2.getName() + " says: " + ((BigDog) d2).greets(new BigDog("another dog")));
    }
}

