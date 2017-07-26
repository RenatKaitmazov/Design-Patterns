package behavioral.observer;

/**
 * @author Renat Kaitmazov
 */

public final class StockObserver implements Observer {

    /*--------------------------------------------------------*/
    /* Observer implementation
    /*--------------------------------------------------------*/

    @Override
    public final void update(double googlePrice, double applePrice, double ibmPrice) {
        System.out.println("GOOG stocks: " + googlePrice);
        System.out.println("AAPL stocks: " + applePrice);
        System.out.println("IBM stocks: " + ibmPrice);
    }
}
