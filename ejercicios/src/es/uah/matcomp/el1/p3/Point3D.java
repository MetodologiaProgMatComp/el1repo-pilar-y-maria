package es.uah.matcomp.el1.p3;
import es.uah.matcomp.el1.p3.Point2D;

public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ (float z){
        this.z=z;
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+","+z+")";
    }

}
