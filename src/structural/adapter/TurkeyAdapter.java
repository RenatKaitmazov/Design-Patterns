package structural.adapter;

/**
 * @author Renat Kaitmazov
 */

public final class TurkeyAdapter implements Duck {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final Turkey turkey;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /*--------------------------------------------------------*/
    /* Duck implementation
    /*--------------------------------------------------------*/

    @Override
    public final void quack() {
        turkey.gobble();
    }

    @Override
    public final void fly() {
        for (int i = 0; i < 3; ++i) {
            turkey.fly();
        }
    }
}
