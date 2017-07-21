package creational.singleton;

/**
 * @author Renat Kaitmazov
 */

/**
 * This technique does not allow to create a second instance
 * of a singleton class via reflection, since Java ensures
 * that an enum value is instantiated only once.
 * The drawback is that the technique does not allow lazy
 * instantiation.
 */
public enum EnumSingleton {
    INSTANCE;

    public static void doSomething() {
    }
}
