package behavioral.mediator;

/**
 * @author Renat Kaitmazov
 */

public interface Mediator {
    void storeMessage(int message);
    int retrieveMessage();
}
