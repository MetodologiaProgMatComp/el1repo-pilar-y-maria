package es.uah.matcomp.el1.p2;
import es.uah.matcomp.el1.p2.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1= new MyPoint(x1,y1);
        this.v2= new MyPoint(x2,y2);
        this.v3= new MyPoint(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    public String toString(){
        return "MyTriangle[v1="+v1.toString()+"v2="+v2.toString()+"v3="+v3.toString()+"]";
    }
    public double getPerimeter(){
        double lado1=v1.distance(v2);
        double lado2=v1.distance(v3);
        double lado3=v2.distance(v3);
        return lado1+lado2+lado3;
    }
    public String getType(){
        double lado1=v1.distance(v2);
        double lado2=v1.distance(v3);
        double lado3=v2.distance(v3);
        if (lado1==lado2 && lado2==lado3){
            return "Equilatero";
        }
        if (lado1==lado2 || lado2==lado3 || lado1==lado3){
            return "Isososceles";
        }
        else{
            return "Escaleno";
        }

    }
}
