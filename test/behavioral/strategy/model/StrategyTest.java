package behavioral.strategy.model;

import behavioral.strategy.CreditCardStrategy;
import behavioral.strategy.PaymentStrategy;
import behavioral.strategy.PaypalStrategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class StrategyTest {


    @Test
    public final void strategyTest() throws Exception {
        final ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1431", 414.12));
        cart.addItem(new Item("6731", 213.10));

        final PaymentStrategy visa = new CreditCardStrategy("Visa", "1234-4567-8901-2345", "991", "12/21");
        final PaymentStrategy paypal = new PaypalStrategy("renat@example.com", "admin12345");

        cart.pay(visa);
        System.out.println();
        cart.pay(paypal);
    }
}