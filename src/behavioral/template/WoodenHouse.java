package behavioral.template;

/**
 * @author Renat Kaitmazov
 */

public final class WoodenHouse extends HouseTemplate {

    @Override
    protected final void buildWalls() {
        System.out.println("Building Pillars with Wood coating");
    }

    @Override
    protected final void buildPillars() {
        System.out.println("Building Wooden Walls");
    }
}
