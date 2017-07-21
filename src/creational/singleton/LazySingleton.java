package creational.singleton;

/**
 * @author Renat Kaitmazov
 */

public final class LazySingleton {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    private static LazySingleton INSTANCE;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    private LazySingleton() {
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    /**
     * Create an instance only when accessed.
     * Can be used in a single-thread environment only.
     */
    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
