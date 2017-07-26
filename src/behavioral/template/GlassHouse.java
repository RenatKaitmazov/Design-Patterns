package behavioral.template;

/**
 * @author Renat Kaitmazov
 */

public final class GlassHouse extends HouseTemplate {

    @Override
    protected final void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    protected final void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
}
