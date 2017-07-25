package structural.bridge;

/**
 * @author Renat Kaitmazov
 */

public abstract class Shape {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    protected Drawer drawer;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    protected Shape(Drawer drawer) {
        this.drawer = drawer;
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public abstract String draw();
}
