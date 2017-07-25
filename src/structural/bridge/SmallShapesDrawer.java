package structural.bridge;

/**
 * @author Renat Kaitmazov
 */

public final class SmallShapesDrawer implements Drawer {

    @Override
    public final String draw(String shapeName) {
        return String.format("Drawing small %s", shapeName);
    }
}
