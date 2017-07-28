package behavioral.visitor;

/**
 * @author Renat Kaitmazov
 */

public final class Book implements Visitable {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private double price;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public Book(double price) {
        this.price = price;
    }

    /*--------------------------------------------------------*/
    /* Getters and setters
    /*--------------------------------------------------------*/

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    /*--------------------------------------------------------*/
    /* Visitable implementation
    /*--------------------------------------------------------*/

    @Override
    public final void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
