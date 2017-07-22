package creational.abstractfactory;

/**
 * @author Renat Kaitmazov
 */

public final class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getShapeType() {
        return StringConstants.LABEL_RECTANGLE;
    }
}
