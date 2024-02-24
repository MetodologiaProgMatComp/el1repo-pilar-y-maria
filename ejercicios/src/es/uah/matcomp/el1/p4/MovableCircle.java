package es.uah.matcomp.el1.p4;

public class MovableCircle extends MovablePoints implements Movable {
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "(x,y)=" + x + "," + y + ", speed=(" + xSpeed + "," + ySpeed + "), radius=" + radius;
    }
}