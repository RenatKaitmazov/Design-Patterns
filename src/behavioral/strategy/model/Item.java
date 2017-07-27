package behavioral.strategy.model;

/**
 * @author Renat Kaitmazov
 */

public final class Item {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final String upcCode;
    private final double price;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public Item(String upcCode, double price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    /*--------------------------------------------------------*/
    /* Getters
    /*--------------------------------------------------------*/

    public String getUpcCode() {
        return upcCode;
    }

    public double getPrice() {
        return price;
    }
}
