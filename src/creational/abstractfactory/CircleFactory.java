package creational.abstractfactory;

/**
 * @author Renat Kaitmazov
 */

public final class CircleFactory implements ShapeFactory {

    private final double radius;

    public CircleFactory(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape newShape() {
        return new Circle(radius);
    }
}
