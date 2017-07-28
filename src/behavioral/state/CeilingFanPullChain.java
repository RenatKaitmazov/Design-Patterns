package behavioral.state;

/**
 * @author Renat Kaitmazov
 */

public final class CeilingFanPullChain {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final State offState;
    private final State lowSpeedState;
    private final State mediumSpeedState;
    private final State highSpeedState;
    private State currentState;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public CeilingFanPullChain() {
        offState = new OffState(this);
        lowSpeedState = new LowSpeedState(this);
        mediumSpeedState = new MediumSpeedState(this);
        highSpeedState = new HighSpeedState(this);
        currentState = offState;
    }

    /*--------------------------------------------------------*/
    /* Getters and setters
    /*--------------------------------------------------------*/

    public final State getCurrentState() {
        return currentState;
    }

    public final void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public final State getOffState() {
        return offState;
    }

    public final State getLowSpeedState() {
        return lowSpeedState;
    }

    public final State getMediumSpeedState() {
        return mediumSpeedState;
    }

    public final State getHighSpeedState() {
        return highSpeedState;
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final void pull() {
        currentState.pull();
    }
}
