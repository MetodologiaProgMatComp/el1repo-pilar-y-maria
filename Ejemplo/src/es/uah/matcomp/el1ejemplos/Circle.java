package es.uah.matcomp.el1ejemplos;

public class Circle { // Save as "Circle.java"
    // private instance variables, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default values for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and color */
    public Circle(double r, String c) { // 3rd constructor
        radius = r;
        color = c;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Getter for instance variable color
    public String getColor() {
        return color;
    }

    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    // Setter for instance variable color
    public void setColor(String newColor) {
        color = newColor;
    }

    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
