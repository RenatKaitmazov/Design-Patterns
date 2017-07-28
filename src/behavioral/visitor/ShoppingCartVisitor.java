package behavioral.visitor;

/**
 * @author Renat Kaitmazov
 */

public final class ShoppingCartVisitor implements Visitor {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private double totalPrice;

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final double totalPrice() {
        return totalPrice;
    }

    /*--------------------------------------------------------*/
    /* Visitor implementation
    /*--------------------------------------------------------*/

    @Override
    public final void visit(Book book) {
        totalPrice += book.getPrice();
    }

    @Override
    public void visit(Phone phone) {
        totalPrice += phone.getPrice();
    }
}
