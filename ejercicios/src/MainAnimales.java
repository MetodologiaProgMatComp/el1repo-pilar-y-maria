import es.uah.matcomp.el1.p4.Animal;
import es.uah.matcomp.el1.p4.BigDog;
import es.uah.matcomp.el1.p4.Cat;
import es.uah.matcomp.el1.p4.Dog;

public class MainAnimales {
    public static void main(String[] args){
        Animal cat = new Cat("Pelusa");
        Animal dog = new Dog("Piñón");
        Animal bigDog = new BigDog("Fuet");

        cat.greets();
        dog.greets();
        bigDog.greets();

        ((Dog) dog).greets((Dog) bigDog);
        ((BigDog) bigDog).greets();

    }
}
