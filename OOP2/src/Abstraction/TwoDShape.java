package Abstraction;

public abstract class TwoDShape {
    private int verticesCount;

    public TwoDShape(int verticesCount) {
        this.verticesCount = verticesCount;
    }

    public int getVerticesCount() {
        return verticesCount;
    }

    public int getNumberOfDimension() {
        return 2;
    }

    public abstract double calculateArea();
}
