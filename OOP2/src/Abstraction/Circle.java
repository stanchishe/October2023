package Abstraction;

public class Circle extends TwoDShape {
    private double radius;
    private final double pi = 3.141;

    public Circle(double radius) {
        super(0);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pi * radius * radius;
    }
}

class CircleStart {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getNumberOfDimension());
        System.out.println(circle.getVerticesCount());
        System.out.println(circle.calculateArea());
    }
}
