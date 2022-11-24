package lab6.problema1;

import java.util.PrimitiveIterator;

import static java.lang.Math.PI;

public class Circle extends Shape{
    double radius;
    public Circle(){
        this(1);
    }
    public Circle(double radius){
        super();
        this.radius = 5;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * PI * radius;
    }
    public String toString(){
        return "Cerc: " + radius + " " + getColor() + " " + isFilled();
    }
}
