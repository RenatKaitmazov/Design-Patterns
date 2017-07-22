package creational.abstractfactory;

/**
 * @author Renat Kaitmazov
 */

public final class RectangleFactory implements ShapeFactory {

    private final double width;
    private final double height;

    public RectangleFactory(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape newShape() {
        return new Rectangle(width, height);
    }
}
