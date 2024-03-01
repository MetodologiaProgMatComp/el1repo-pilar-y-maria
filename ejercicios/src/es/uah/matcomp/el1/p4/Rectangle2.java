package es.uah.matcomp.el1.p4;

public class Rectangle2 implements GeometricObject{
    private double width;
    private double length;

    public Rectangle2(double width, double length){
        this.width=width;
        this.length=length;
    }
    public String toString(){
        return "Rectangle[width="+width+",length="+length+"]";
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return 2*length+2*width;
    }
}
