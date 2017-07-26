package behavioral.template;

/**
 * @author Renat Kaitmazov
 */

public abstract class HouseTemplate {

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
    }

    /*--------------------------------------------------------*/
    /* Abstract methods
    /*--------------------------------------------------------*/

    protected abstract void buildWalls();
    protected abstract void buildPillars();

    /*--------------------------------------------------------*/
    /* Helper methods
    /*--------------------------------------------------------*/

    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }

    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }
}
