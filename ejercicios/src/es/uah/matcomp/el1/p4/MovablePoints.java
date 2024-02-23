package es.uah.matcomp.el1.p4;
import es.uah.matcomp.el1.p4.Movable;

public class MovablePoints implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoints (int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "("+x+","+y+") speed=("+xSpeed+","+ySpeed+")";
    }
    public void moveUp(){
        y-=ySpeed;
    }
    public void moveDown(){
        y+=ySpeed;
    }
    public void moveLeft(){
        x-=xSpeed;
    }
    public void moveRight(){
        x+=xSpeed;
    }
}
