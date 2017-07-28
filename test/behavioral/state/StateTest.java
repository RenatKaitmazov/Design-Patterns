package behavioral.state;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class StateTest {

    private CeilingFanPullChain chain;

    @Before
    public final void setup() {
        chain = new CeilingFanPullChain();
    }

    @Test
    public final void stateTest() throws Exception {
        final CeilingFanPullChain pullChain = new CeilingFanPullChain();

        // Initially the fan is off.
        // Switch to low speed.
        pullChain.pull();

        // Switch to medium speed.
        pullChain.pull();

        // Switch to high speed.
        pullChain.pull();

        // Turn it off.
        pullChain.pull();
    }
}