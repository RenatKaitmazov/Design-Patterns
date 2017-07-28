package behavioral.iterator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

public final class IteratorTest {

    private MyCollectionOfStrings collectionOfStrings;

    @Before
    public final void setup() {
        collectionOfStrings = new MyCollectionOfStrings();
    }

    @Test
    public final void iteratorTest() throws Exception {
        collectionOfStrings.add("One");
        collectionOfStrings.add("Two");
        collectionOfStrings.add("Three");
        collectionOfStrings.add("Four");

        final MyIterator iterator = collectionOfStrings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}