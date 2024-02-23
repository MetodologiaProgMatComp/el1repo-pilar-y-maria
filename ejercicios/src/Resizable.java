import es.uah.matcomp.el1.p4.ResizableCircle;
public class Resizable {
    public static void main(String[]args){
        ResizableCircle circle = new ResizableCircle(5);

        // Mostrar el círculo antes
        System.out.println("Círculo antes:");
        System.out.println(circle);
        System.out.println("Área: " + circle.getArea());
        System.out.println("Perímetro: " + circle.getPerimeter());

        // Redimensionar el círculo al 50%
        circle.resize(50);

        // Mostrar el círculo después de la redimension
        System.out.println("Círculo después:");
        System.out.println(circle);
        System.out.println("Área: " + circle.getArea());
        System.out.println("Perímetro: " + circle.getPerimeter());
    }

}
