import es.uah.matcomp.el1.p2.MyPoint;
import es.uah.matcomp.el1.p2.MyLine;
public class MainMyLineMyPoint {
    public static void main(String[] args) {
        // Crear dos puntos
        MyPoint punto1 = new MyPoint(1, 2);
        MyPoint punto2 = new MyPoint(4, 6);

        // Mostrar los puntos
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());

        // Calcular y mostrar la distancia entre los puntos
        System.out.println("La distancia entre punto uno y punto dos es : " + punto1.distance(punto2));

        // Crear una línea usando los dos puntos
        MyLine line = new MyLine(punto1, punto2);

        // Mostrar la línea
        System.out.println(line.toString());

        // Obtener la longitud de la línea
        System.out.println("Longitud: " + line.getLenght());

        // Obtener el ángulo de la línea
        System.out.println("Grosor: " + line.getGradient());
    }

    }
