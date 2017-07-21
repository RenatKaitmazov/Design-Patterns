package creational.singleton;

import java.io.Serializable;

/**
 * @author Renat Kaitmazov
 */

/**
 * The singleton pattern can be broken if we save an instance of the class to some
 * file and retrieve it later. In order to properly serialize the singleton
 * we need to provide a method {@link #readResolve}
 */
public final class SerializableSingleton implements Serializable {

    /*--------------------------------------------------------*/
    /* Nested classes
    /*--------------------------------------------------------*/

    private static class Nested {

        /*--------------------------------------------------------*/
        /* Static variables
        /*--------------------------------------------------------*/

        private static final SerializableSingleton INSTANCE = new SerializableSingleton();
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public static SerializableSingleton getInstance() {
        return Nested.INSTANCE;
    }

    /**
     * The key method that restores the same singleton object.
     */
    protected Object readResolve() {
        return getInstance();
    }
}
