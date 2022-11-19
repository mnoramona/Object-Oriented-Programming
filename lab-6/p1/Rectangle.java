package lab6.problema1;

public class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(){
        this(0,0);
    }
    public Rectangle(double width, double length){
        super();
        this.length = 5;
        this.width = 6;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    public String toString(){
        return "Rectangle: " + length + " " + width + " " + getColor() + " " + isFilled();
    }
}
