package behavioral.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class VisitorTest {

    @Test
    public final void visitorTest() throws Exception {
        final ShoppingCartVisitor shoppingCardVisitor = new ShoppingCartVisitor();
        for (final Visitable item : getItemList()) {
            item.accept(shoppingCardVisitor);
        }
        assertEquals(780.0, shoppingCardVisitor.totalPrice(), 0.0);
    }

    private List<Visitable> getItemList() {
        final List<Visitable> items = new ArrayList<>();
        items.add(new Book(10.0));
        items.add(new Book(20.0));
        items.add(new Phone(750.0));
        return items;
    }
}