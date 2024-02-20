package es.uah.matcomp.el1.p1;

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
        return Math.pow(radius,2)*Math.PI; //Potencias
    }

    public double getCircumference(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "Circle[radius="+this.radius+"]";
    }

}
