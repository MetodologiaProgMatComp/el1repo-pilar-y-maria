package es.uah.matcomp.el1.p4;

public class Circle2 implements GeometricObject{
    protected double radius;
    public Circle2 (double radius){
        this.radius=radius;
    }
    public String toString(){
        return "Circle[radius="+radius+"]";
    }
    @Override
    public double getArea(){
        return Math.pow(radius,2)*Math.PI; //Potencias
    }

    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }



}
