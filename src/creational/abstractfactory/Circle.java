package creational.abstractfactory;

/**
 * @author Renat Kaitmazov
 */

public final class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getShapeType() {
        return StringConstants.LABEL_CIRCLE;
    }
}
