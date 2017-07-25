package structural.bridge;

/**
 * @author Renat Kaitmazov
 */

public final class LargeShapesDrawer implements Drawer {

    @Override
    public final String draw(String shapeName) {
        return String.format("Drawing big %s", shapeName);
    }
}
