package behavioral.strategy;

/**
 * @author Renat Kaitmazov
 */

public final class PaypalStrategy implements PaymentStrategy {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final String userName;
    private final String password;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public PaypalStrategy(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /*--------------------------------------------------------*/
    /* PaymentStrategy implementation
    /*--------------------------------------------------------*/

    @Override
    public final void pay(double amount) {
        System.out.printf("Paid %.2f with PayPal account %s", amount, userName);
    }
}
