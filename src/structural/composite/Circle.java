package structural.composite;

/**
 * @author Renat Kaitmazov
 */

/**
 * This is a leaf. Each leaf must implement common
 * methods defined in the component interface or abstract class
 * which is {@link Shape}.
 */
public final class Circle implements Shape {

    @Override
    public final void draw(String color) {
        System.out.format("Drawing a circle with %s color\n", color);
    }
}
