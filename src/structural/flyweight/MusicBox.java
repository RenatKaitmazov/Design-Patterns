package structural.flyweight;

/**
 * @author Renat Kaitmazov
 */

/**
 * A class whose instances need to be created in a huge amount.
 * Such a class must have intrinsic attributes which are shared amongst
 * other instances, and extrinsic attributes which are unique to each
 * instance. The intrinsic attributes are used by a factory class that creates
 * new instances only if such an instance with that intrinsic attribute
 * has not been created before.
 * The extrinsic attributes are set by the client.
 */
public final class MusicBox implements Toy {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    // For testing purposes
    private static int INSTANCES_CREATED = 0;

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    // Intrinsic attributes
    private final String color;

    // Extrinsic attributes
    private String tuneName;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public MusicBox(String color) {
        this.color = color;
        System.out.println("MusicBox instance is created.");
        ++INSTANCES_CREATED;
    }

    /*--------------------------------------------------------*/
    /* Setters
    /*--------------------------------------------------------*/

    public final void setTuneName(String tuneName) {
        this.tuneName = tuneName;
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public static int getCreatedInstancesAmount() {
        return INSTANCES_CREATED;
    }

    @Override
    public final void entertain() {
        // Doing some stuff.
//        System.out.format("Playing %s\n", tuneName);
    }
}
