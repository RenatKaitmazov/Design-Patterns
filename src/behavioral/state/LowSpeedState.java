package behavioral.state;

/**
 * @author Renat Kaitmazov
 */

public final class LowSpeedState implements State {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final CeilingFanPullChain pullChain;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public LowSpeedState(CeilingFanPullChain pullChain) {
        this.pullChain = pullChain;
    }

    /*--------------------------------------------------------*/
    /* State implementation
    /*--------------------------------------------------------*/

    @Override
    public final void pull() {
        final State nextState = pullChain.getMediumSpeedState();
        pullChain.setCurrentState(nextState);
        System.out.println("Switched from low speed to medium speed");
    }
}
