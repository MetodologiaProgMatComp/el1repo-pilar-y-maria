import es.uah.matcomp.el1.p2.MyPoint;
import es.uah.matcomp.el1.p2.MyCircle;
public class MainMyCircleMyPoint {
    public static void main(String[] args){
        //Establecer el centro y el radio del círculo
        MyPoint center = new MyPoint(0 , 0);
        int radius=1;

        //Crear un objeto MyCircle
        MyCircle circle1 = new MyCircle(center, radius);
        MyCircle circle2 = new MyCircle(center, radius);

        //Mostrar información sobre los círculos creados
        System.out.println("Cículo 1: "+ circle1);
        System.out.println("Cículo 2: "+ circle2);

        //Calcular y mostrar la distancia entre los centros de los círculos
        double distanceBetweenCenters = circle1.distance(circle2);
        System.out.println("Distancia entre los centros de los circulos: "+ distanceBetweenCenters);

    }
}
