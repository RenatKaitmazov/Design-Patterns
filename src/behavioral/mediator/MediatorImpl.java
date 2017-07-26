package behavioral.mediator;

/**
 * @author Renat Kaitmazov
 */

public final class MediatorImpl implements Mediator {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private int message;
    private boolean isMessageStored;

    /*--------------------------------------------------------*/
    /* Mediator implementation
    /*--------------------------------------------------------*/

    @Override
    public final synchronized void storeMessage(int message) {
        while (isMessageStored) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        this.message = message;
        isMessageStored = true;
        notifyAll();
    }

    @Override
    public final synchronized int retrieveMessage() {
        while (!isMessageStored) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        isMessageStored = false;
        notifyAll();
        return message;
    }
}
