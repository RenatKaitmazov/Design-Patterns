package behavioral.state;

/**
 * @author Renat Kaitmazov
 */

public final class HighSpeedState implements State {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final CeilingFanPullChain pullChain;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public HighSpeedState(CeilingFanPullChain pullChain) {
        this.pullChain = pullChain;
    }

    /*--------------------------------------------------------*/
    /* State implementation
    /*--------------------------------------------------------*/

    @Override
    public final void pull() {
        final State nextState = pullChain.getOffState();
        pullChain.setCurrentState(nextState);
        System.out.println("Turned off");
    }
}
