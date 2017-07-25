package structural.bridge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class BridgePatternTest {

    private final Shape[] shapes = {
            new Pentagon(new LargeShapesDrawer()),
            new Pentagon(new SmallShapesDrawer()),
            new Star(new LargeShapesDrawer()),
            new Star(new SmallShapesDrawer())
    };

    @Test
    public final void bridgeTest() throws Exception {
        final int size = shapes.length;
        final String[] expected = {
                "Drawing big Pentagon",
                "Drawing small Pentagon",
                "Drawing big Star",
                "Drawing small Star",
        };
        final String[] actual = new String[size];
        for (int i = 0; i < size; ++i) {
            final Shape shape = shapes[i];
            actual[i] = shape.draw();
        }

        assertArrayEquals(expected, actual);
    }
}