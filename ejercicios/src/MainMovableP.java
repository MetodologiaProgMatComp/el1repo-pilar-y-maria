import es.uah.matcomp.el1.p4.Movable;
import es.uah.matcomp.el1.p4.MovablePoints;

public class MainMovableP {
    public static void main(String[]args){
        Movable s1 = new MovablePoints(1,2,3,4);
        System.out.println("Posicion antes:" +s1.toString());
        s1.moveUp();
        s1.moveRight();
        System.out.println("Posicion despues:"+ s1.toString());

    }
}
