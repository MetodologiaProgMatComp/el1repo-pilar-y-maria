package es.uah.matcomp.el1.p3;
public class MainAnimal {
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
