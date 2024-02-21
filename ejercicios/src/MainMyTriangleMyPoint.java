import es.uah.matcomp.el1.p2.MyPoint;
import es.uah.matcomp.el1.p2.MyTriangle;
public class MainMyTriangleMyPoint {
    public static void main(String[] args) {
        // Crear puntos para formar un triángulo
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(3, 0);
        MyPoint point3 = new MyPoint(0, 4);

        // Crear un triángulo utilizando los puntos creados
        MyTriangle triangle = new MyTriangle(point1, point2, point3);

        // Imprimir el triángulo
        System.out.println("Triángulo: " + triangle.toString());

        // Calcular y mostrar el perímetro del triángulo
        System.out.println("Perímetro: " + triangle.getPerimeter());

        // Determinar y mostrar el tipo de triángulo
        System.out.println("Tipo: " + triangle.getType());
    }
}

