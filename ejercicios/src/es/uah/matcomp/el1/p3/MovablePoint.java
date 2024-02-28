package es.uah.matcomp.el1.p3;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;

    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(){

    }
    public float getXSpeed(){return this.xSpeed; }
    public void setXSpeed(float xSpeed){this.xSpeed=xSpeed; }
    public float getYSpeed(){return this.ySpeed; }
    public void getYSpeed(float ySpeed){this.ySpeed=ySpeed; }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){return new float[]{this.xSpeed, this.ySpeed}; }
    @Override
    public String toString(){
        return super.toString()+", Speed: (" + xSpeed + ", " + ySpeed + ")"; }
    @Override
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }




}
