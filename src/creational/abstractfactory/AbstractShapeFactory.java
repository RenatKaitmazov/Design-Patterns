package creational.abstractfactory;

/**
 * @author Renat Kaitmazov
 */

public abstract class AbstractShapeFactory {

    public static Shape createNewShape(ShapeFactory shapeFactory) {
        if (shapeFactory == null) {
            return null;
        }
        return shapeFactory.newShape();
    }
}
