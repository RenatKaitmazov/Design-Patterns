package creational.singleton;

/**
 * @author Renat Kaitmazov
 */

public final class SynchronizedSingleton {

    /*--------------------------------------------------------*/
    /* Static
    /*--------------------------------------------------------*/

    private static SynchronizedSingleton INSTANCE;

    /*--------------------------------------------------------*/
    /* Constructor
    /*--------------------------------------------------------*/

    private SynchronizedSingleton() {
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    /**
     * This method can be called from multiple threads.
     * Not good for performance critical applications.
     */
    public static synchronized SynchronizedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SynchronizedSingleton();
        }
        return INSTANCE;
    }
}
