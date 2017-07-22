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
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 3; ++i) {
            turkey.fly();
        }
    }
}
