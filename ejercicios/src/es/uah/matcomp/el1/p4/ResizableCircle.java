package es.uah.matcomp.el1.p4;
import es.uah.matcomp.el1.p4.Circle2;
public class ResizableCircle extends Circle2 implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }
    public String toString(){
        return "ResizableCircle[Circle[radius="+this.radius+"]";
    }
    public void resize(int percent){
        radius*=percent/100.0;
    }
}
