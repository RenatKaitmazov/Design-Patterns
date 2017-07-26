package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Renat Kaitmazov
 */

public final class StockGrabber implements Subject {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final List<Observer> observers = new ArrayList<>();
    private double googlePrice;
    private double applePrice;
    private double ibmPrice;

    /*--------------------------------------------------------*/
    /* Setters
    /*--------------------------------------------------------*/

    public final void setGooglePrice(double price) {
        googlePrice = price;
        notifyObservers();
    }

    public final void setApplePrice(double price) {
        applePrice = price;
        notifyObservers();
    }

    public final void setIbmPrice(double price) {
        ibmPrice = price;
        notifyObservers();
    }

    /*--------------------------------------------------------*/
    /* Subject implementation
    /*--------------------------------------------------------*/

    @Override
    public final void register(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public final void unregister(Observer observer) {
        if (observer != null) {
            observers.remove(observer);
        }
    }

    @Override
    public final void notifyObservers() {
        for (final Observer observer : observers) {
            observer.update(googlePrice, applePrice, ibmPrice);
        }
    }
}
