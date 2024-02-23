import es.uah.matcomp.el1.p4.Circle2;
import es.uah.matcomp.el1.p4.Rectangle2;
import es.uah.matcomp.el1.p4.GeometricObject;
public class MainGeoCR {
    public static void main(String[]args){
        GeometricObject s1 = new Circle2(5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        GeometricObject s2 = new Rectangle2(5.5, 4);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
    }
}
