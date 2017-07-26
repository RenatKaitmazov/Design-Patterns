package behavioral.mediator;

/**
 * @author Renat Kaitmazov
 */

public final class Consumer implements Runnable {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    private static int ID_COUNTER = 1;

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final Mediator mediator;
    private final int id;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public Consumer(Mediator mediator) {
        this.mediator = mediator;
        id = ID_COUNTER++;
    }

    /*--------------------------------------------------------*/
    /* Runnable implementation
    /*--------------------------------------------------------*/

    @Override
    public final void run() {
        for (int i = 0; i < id; ++i) {
            final int message = mediator.retrieveMessage();
            System.out.printf("Consumer ID %d: consumed %d\n", id, message);
        }
    }
}
