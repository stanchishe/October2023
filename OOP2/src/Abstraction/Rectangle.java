package Abstraction;

public class Rectangle extends TwoDShape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        super(4);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}

class RectangleStart {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getNumberOfDimension());
        System.out.println(rectangle.getVerticesCount());
        System.out.println(rectangle.calculateArea());
    }
}