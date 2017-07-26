package behavioral.mediator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class MediatorTest {


    @Test
    public final void mediatorTest() throws Exception {
        final Mediator mediator = new MediatorImpl();

        Runnable producer = null;
        Runnable consumer = null;
        for (int i = 0; i < 5; ++i) {
            producer = new Producer(mediator);
            consumer = new Consumer(mediator);
        }

        final Thread producerThread = new Thread(producer);
        final Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}