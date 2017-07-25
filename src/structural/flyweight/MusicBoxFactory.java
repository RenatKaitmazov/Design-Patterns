package structural.flyweight;

/**
 * @author Renat Kaitmazov
 */

import java.util.HashMap;
import java.util.Map;

/**
 * A factory class that creates instances of {@link MusicBox} class
 * based on its intrinsic attribute which is color is this example.
 */
public final class MusicBoxFactory {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    private static final Map<String, MusicBox> CACHE = new HashMap<>();

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    private MusicBoxFactory() {
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public static MusicBox getMusicBox(String color) {
        MusicBox musicBox = CACHE.get(color);
        if (musicBox == null) {
            musicBox = new MusicBox(color);
            CACHE.put(color, musicBox);
        }
        return musicBox;
    }
}
