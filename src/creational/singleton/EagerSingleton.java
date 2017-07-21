package creational.singleton;

/**
 * @author Renat Kaitmazov
 */

public final class EagerSingleton {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    private EagerSingleton() {
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}