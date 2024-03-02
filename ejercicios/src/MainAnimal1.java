import es.uah.matcomp.el1.p3.Cat;
import es.uah.matcomp.el1.p3.Dog;
import es.uah.matcomp.el1.p3.Mammal;

public class MainAnimal1 {
    public static void main(String[] args) {
        //Crear las instancias de cada clase
        Mammal mammal = new Mammal ("Mamífero");
        Cat cat = new Cat ("Gato");
        Dog dog = new Dog ("Perro");

        //Mostrar información de cada instancia
        System.out.println(mammal.toString());
        System.out.println(cat.toString());
        System.out.println(dog.toString());

        //Ejemplo
        System.out.println("El gato hace: "+ cat.greets());
        System.out.println("El perro hace: "+ dog.greets());
        System.out.println("Otro perro le contesta: "+ dog.greets(dog));

    }
}
//No se puede hacer una llamada directa al método greets() en un tipo de objeto
// Animal porque esta clase no tiene el método greets() definido en su interfaz