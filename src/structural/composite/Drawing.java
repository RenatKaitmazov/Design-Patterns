package structural.composite;

/**
 * @author Renat Kaitmazov
 */

import java.util.ArrayList;
import java.util.List;

/**
 * This is a composite class. It must also implement the component
 * which is {@link Shape}. The class contains a list of leaves
 * of the component type.
 */
public final class Drawing implements Shape {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final List<Shape> shapes = new ArrayList<>();

    @Override
    public final void draw(String color) {
        // Just delegate the method to the concrete
        // Shape implementations.
        // If the leaves did not implement the component interface,
        // then we would have to check the type of leaves in the
        // list of shape (which would be a list of objects), cast it
        // to the correct type and only after that call the draw() method.
        for (final Shape shape : shapes) {
            shape.draw(color);
        }
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final void addShape(Shape shape) {
        shapes.add(shape);
    }

    public final void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public final void removeAllShapes() {
        shapes.clear();
    }
}
