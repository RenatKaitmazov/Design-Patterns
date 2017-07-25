package structural.bridge;

/**
 * @author Renat Kaitmazov
 */

public final class Pentagon extends Shape {

    public Pentagon(Drawer drawer) {
        super(drawer);
    }

    @Override
    public final String draw() {
        return this.drawer.draw("Pentagon");
    }
}
