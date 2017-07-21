package creational.singleton;

/**
 * @author Renat Kaitmazov
 */

public final class BillPughSingleton {

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public BillPughSingleton() {
    }

    /*--------------------------------------------------------*/
    /* Nested classes
    /*--------------------------------------------------------*/

    /**
     * Prior Java 5 there are some issues when too much threads
     * try to get access to the singleton. This nested class helps
     * to solve that issues.
     */
    private static class Nested {

        /*--------------------------------------------------------*/
        /* Static variables
        /*--------------------------------------------------------*/

        /**
         * The instance will only be created when a client calls {@link #getInstance()} method.
         */
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public static BillPughSingleton getInstance() {
        return Nested.INSTANCE;
    }
}
