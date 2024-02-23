import es.uah.matcomp.el1.p4.Movable;
import es.uah.matcomp.el1.p4.MovablePoints;

public class MainMovableP {
    public static void main(String[]args){
        Movable s1 = new MovablePoints(1,2,3,4);
        System.out.println(s1);
        s1.moveUp();     //No devuelven
        s1.moveDown();
        s1.moveRight();
        s1.moveLeft();
        System.out.println(s1);  //No calcula bien las coordenadas
    }
}
