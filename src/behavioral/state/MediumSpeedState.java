package behavioral.state;

/**
 * @author Renat Kaitmazov
 */

public final class MediumSpeedState implements State {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final CeilingFanPullChain pullChain;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public MediumSpeedState(CeilingFanPullChain pullChain) {
        this.pullChain = pullChain;
    }

    /*--------------------------------------------------------*/
    /* State implementation
    /*--------------------------------------------------------*/

    @Override
    public final void pull() {
        final State nextState = pullChain.getHighSpeedState();
        pullChain.setCurrentState(nextState);
        System.out.println("Switched from medium speed to high speed");
    }
}
