package shapes;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
        this.calculatePerimeter();
        this.calculateArea();
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(this.height * 2 + this.width * 2);
    }

    @Override
    public void calculateArea() {
        setArea(this.height * this.width);

    }
}
