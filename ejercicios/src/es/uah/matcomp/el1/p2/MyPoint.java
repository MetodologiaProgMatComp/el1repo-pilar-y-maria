package es.uah.matcomp.el1.p2;
public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint(){

    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){
        return new int[]{x,y};
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";}
    public double distance( int x, int y){   //Distance from this point to the given point at (x,y)
        int dx= this.x-x;
        int dy= this.y-y;
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
    }
    public double distance(MyPoint another){  //Distance from this point to the given instance of MyPoint
        int dx= this.x-another.getX();
        int dy= this.y-another.getY();
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
    }
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}
