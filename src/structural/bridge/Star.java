package structural.bridge;

/**
 * @author Renat Kaitmazov
 */

public final class Star extends Shape {

    public Star(Drawer drawer) {
        super(drawer);
    }

    @Override
    public final String draw() {
        return this.drawer.draw("Star");
    }
}
