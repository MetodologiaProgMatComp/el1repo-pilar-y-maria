import es.uah.matcomp.el1.p4.Shape;
import es.uah.matcomp.el1.p4.Circle;
import es.uah.matcomp.el1.p4.Square;
import es.uah.matcomp.el1.p4.Rectangle;
public class MainCRSS {
    public static void main(String[]args) {
        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        //System.out.println(s1.getArea()); // no es public
        //System.out.println(s1.getPerimeter()); // no es public
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); //Shape no tiene getRadius

        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); //No se puede llamar a shape es abstracto

        Rectangle s3 = new Rectangle(1.0, 2.0, "red",false); // Upcast
        System.out.println(s3);
        //System.out.println(s3.getArea()); //no es public
        //System.out.println(s3.getPerimeter()); //no es public
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); //Shape no tiene getLength

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Square s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        //System.out.println(s4.getArea()); //no es public
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); //Shape no tiene getSide

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s3;;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); //Rectangle no tiene getSide
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)s4;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
