package behavioral.strategy.model;

import behavioral.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Renat Kaitmazov
 */

public final class ShoppingCart {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final List<Item> items = new ArrayList<>();
    private double totalPrice;

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final void addItem(Item item) {
        if (item != null && items.add(item)) {
            totalPrice += item.getPrice();
        }
    }

    public final void removeItem(Item item) {
        if (item != null && items.remove(item)) {
            totalPrice -= item.getPrice();
        }
    }

    public final double getTotalPrice() {
        return totalPrice;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        if (paymentStrategy != null && totalPrice > 0) {
            paymentStrategy.pay(totalPrice);
        }
    }
}
