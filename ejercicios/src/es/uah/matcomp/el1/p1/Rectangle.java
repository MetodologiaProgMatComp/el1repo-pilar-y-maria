package es.uah.matcomp.el1.p1;

public class Rectangle {
    private float length=1.0f;
    private float width=1.0f;

    //CONSTRUCTORES
    public Rectangle(){
    }
    public Rectangle(float length, float width){
        this.length= length;
        this.width= width;
    }
    //METODOS
    public float getLength() {
        return this.length;
    }
    public void setLength (float length) {
        this.length = length;
    }
    public float getWidth() {
        return this.width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
    public String toString(){
        return "Rectangle[length="+this.length+", width="+this.width+"]";
    }

}
