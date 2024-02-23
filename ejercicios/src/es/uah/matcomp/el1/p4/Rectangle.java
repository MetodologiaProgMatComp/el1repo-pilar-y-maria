package es.uah.matcomp.el1.p4;

import es.uah.matcomp.el1.p3.Shape;

public class Rectangle extends Shape {
    private double length=1.0d;
    private double width=1.0d;

    //CONSTRUCTORES
    public Rectangle(){
    }
    public Rectangle(double length, double width){
        this.length= length;
        this.width= width;
    }
    public Rectangle(double length, double width, String color, boolean filled){
        super(color,filled);
        this.length= length;
        this.width= width;
    }
    //METODOS
    public double getLength() {
        return this.length;
    }
    public void setLength (double length) {
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return 2*length+2*width;
    }
    @Override
    public String toString(){
        return "Rectangle[Shape[color="+getColor()+",filled="+isFilled()+"]length="+this.length+", width="+this.width+"]";
    }

}

