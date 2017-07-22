package creational.abstractfactory;

/**
 * @author Renat Kaitmazov
 */

public final class TriangleFactory implements ShapeFactory {

    private final double base;
    private final double height;

    public TriangleFactory(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Shape newShape() {
        return new Triangle(base, height);
    }
}
