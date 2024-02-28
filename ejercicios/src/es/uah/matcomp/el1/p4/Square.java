package es.uah.matcomp.el1.p4;
import es.uah.matcomp.el1.p3.Shape;
import es.uah.matcomp.el1.p3.Rectangle;

public class Square extends Rectangle{
    private double side;
    public Square(){}
    public Square(double side){
        this.side=side;
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled); //side equivalae a length y width pq es cuadrado
        this.side=side;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side=side;
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "Square[Rectangle[Shape[color="+getColor()+",filled="+isFilled()+"]length="+getLength()+", width="+getWidth()+"]";
    }
}
