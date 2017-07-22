package creational.abstractfactory;

/**
 * @author Renat Kaitmazov
 */

public final class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String getShapeType() {
        return StringConstants.LABEL_TRIANGLE;
    }
}
