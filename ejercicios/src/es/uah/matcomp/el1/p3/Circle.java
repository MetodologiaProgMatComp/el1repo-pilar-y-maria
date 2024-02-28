package es.uah.matcomp.el1.p3;
import es.uah.matcomp.el1.p3.Shape;

public class Circle extends Shape {
    private double radius=1.0;  //ATRIBUTOS


    //CONSTRUCTORES
    public Circle(){
    }

    public Circle(double radio){
        this.radius=radio;
    }
    public Circle(double radio, String color,boolean filled){
        super(color,filled);
        this.radius=radio;
    }

    //METODOS

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI; //Potencias
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString(){
        return "Circle[Shape[color="+getColor()+",filled="+isFilled()+"],radius="+this.radius+"]";
    }

}
