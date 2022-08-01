package shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
        this.calculateArea();
        this.calculatePerimeter();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public final double getRadius() {
        return radius;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * Math.PI * radius);
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI * Math.pow(this.radius, 2));
    }
}
