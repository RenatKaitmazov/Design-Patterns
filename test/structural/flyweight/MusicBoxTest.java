package structural.flyweight;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class MusicBoxTest {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    private static final String[] COLORS = {
            "Red",
            "Orange",
            "Yellow",
            "Green",
            "Cyan",
            "Blue",
            "Violet"
    };

    private static final String[] TUNES = {
            "Moonlight Sonata",
            "Clair de Lune",
            "March Funèbre",
            "Arabeske",
            "Für Elise",
            "Rondo Alla Turca",
            "Hungarian Rhapsody No. 2",
            "Flight of the Bumblebee",
            "Rhapsody in Blue",
            "Sonata Pathétique",
            "Minute Waltz",
            "Kinderszenen",
            "Diabelli Variations Op. 120",
            "Humoresque"
    };

    private static final Random RANDOM = new Random(System.currentTimeMillis());

    @Test
    public final void flyweightPatternTest() throws Exception {
        final int colorAmount = COLORS.length;
        final int tuneAmount = TUNES.length;
        for (int i = 0; i < 1_000_000; ++i) {
            final int randomColorIndex = RANDOM.nextInt(colorAmount);
            final int randomTuneIndex = RANDOM.nextInt(tuneAmount);
            final String color = COLORS[randomColorIndex];
            final String tune = TUNES[randomTuneIndex];
            final MusicBox musicBox = MusicBoxFactory.getMusicBox(color);
            musicBox.setTuneName(tune);
            musicBox.entertain();
        }

        assertTrue(MusicBox.getCreatedInstancesAmount() <= colorAmount);
    }
}