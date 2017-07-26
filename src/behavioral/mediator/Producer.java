package behavioral.mediator;

import java.util.Random;

/**
 * @author Renat Kaitmazov
 */

public final class Producer implements Runnable {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    private static final Random RANDOM = new Random(System.currentTimeMillis());
    public static final int UPPER_BOUND = 1_000;
    private static int ID_COUNTER = 1;

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final Mediator mediator;
    private final int id;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public Producer(Mediator mediator) {
        this.mediator = mediator;
        id = ID_COUNTER++;
    }

    /*--------------------------------------------------------*/
    /* Runnable implementation
    /*--------------------------------------------------------*/

    @Override
    public final void run() {
        for (int i = 0; i < id; ++i) {
            final int message = RANDOM.nextInt(UPPER_BOUND);
            System.out.printf("Producer ID %d: produced %d\n", id, message);
            mediator.storeMessage(message);
        }
    }
}
