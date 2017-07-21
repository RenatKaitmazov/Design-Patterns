package creational.singleton;

/**
 * @author Renat Kaitmazov
 */

public final class StaticBlockSingleton {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    private static StaticBlockSingleton INSTANCE;

    /*--------------------------------------------------------*/
    /* Static block
    /*--------------------------------------------------------*/

    // A static block for exception handling.
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            System.out.println("Error while creating " + StaticBlockSingleton.class.getSimpleName());
            e.printStackTrace();
        }
    }

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    private StaticBlockSingleton() {
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
