package creational.singleton;

/**
 * @author Renat Kaitmazov
 */

public final class EfficientSynchronizedSingleton {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    private static EfficientSynchronizedSingleton INSTANCE;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public EfficientSynchronizedSingleton() {
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    /**
     * The concept is known as double check lock.
     * It is a thread-safe and efficient way of creating a singleton.
     */
    public static EfficientSynchronizedSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (EfficientSynchronizedSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new EfficientSynchronizedSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
