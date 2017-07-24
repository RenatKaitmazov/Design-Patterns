package structural.composite;

/**
 * @author Renat Kaitmazov
 */

/**
 * It is a base component where we define common methods
 * for both leaves and a composite. It can either an abstract class
 * or an interface.
 */
public interface Shape {
    void draw(String color);
}
