package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Renat Kaitmazov
 */

public final class MyCollectionOfStrings {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final List<String> strings = new ArrayList<>();

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final boolean add(String s) {
        return strings.add(s);
    }

    public final boolean remove(String s) {
        return strings.remove(s);
    }

    public final MyIterator iterator() {
        return new StringsCollectionIterator(this);
    }

    /*--------------------------------------------------------*/
    /* Inner classes
    /*--------------------------------------------------------*/

    private final class StringsCollectionIterator implements MyIterator {

        private final List<String> strings;
        private final int size;
        private int current = 0;

        private StringsCollectionIterator(MyCollectionOfStrings collectionOfStrings) {
            this.strings = collectionOfStrings.strings;
            size = this.strings.size();
        }

        @Override
        public final boolean hasNext() {
            return current < size;
        }

        @Override
        public final String next() {
            return strings.get(current++);
        }
    }

}
