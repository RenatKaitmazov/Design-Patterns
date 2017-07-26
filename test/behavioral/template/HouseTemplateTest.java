package behavioral.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class HouseTemplateTest {

    @Test
    public final void templateTest() throws Exception {
        final HouseTemplate woodenHouse = new WoodenHouse();
        final HouseTemplate glassHouse = new GlassHouse();

        woodenHouse.buildHouse();
        System.out.println();
        glassHouse.buildHouse();
    }
}