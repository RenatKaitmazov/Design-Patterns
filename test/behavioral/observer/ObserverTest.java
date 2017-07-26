package behavioral.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class ObserverTest {


    @Test
    public final void observerTest() throws Exception {
        final StockGrabber stockGrabber = new StockGrabber();
        final Observer observer = new StockObserver();

        stockGrabber.register(observer);

        stockGrabber.setGooglePrice(676.40);
        System.out.println();
        stockGrabber.setApplePrice(677.60);
        System.out.println();
        stockGrabber.setIbmPrice(197.00);
    }
}