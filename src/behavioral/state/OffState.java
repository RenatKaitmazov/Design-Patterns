package behavioral.state;

/**
 * @author Renat Kaitmazov
 */

public final class OffState implements State {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final CeilingFanPullChain pullChain;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public OffState(CeilingFanPullChain pullChain) {
        this.pullChain = pullChain;
    }

    /*--------------------------------------------------------*/
    /* State implementation
    /*--------------------------------------------------------*/

    @Override
    public final void pull() {
        final State nextState = pullChain.getLowSpeedState();
        pullChain.setCurrentState(nextState);
        System.out.println("Switched to low speed");
    }
}
