package es.uah.matcomp.el1;

public class Circle {
    private double radius=1.0;  //ATRIBUTOS


    //CONSTRUCTORES
    public Circle(){

    }

    public Circle(double radio){
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
        return radius*2*Math.PI;

    }

    public double getCircumference(){
        return radius*3;
    }

    public String toString(){
        return "Circle[radius="+this.radius+"]";
    }

}
