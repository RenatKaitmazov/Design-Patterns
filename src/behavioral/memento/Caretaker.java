package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Renat Kaitmazov
 */

public final class Caretaker {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final List<Memento> mementos = new ArrayList<>();

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final boolean addMemento(Memento memento) {
        return mementos.add(memento);
    }

    public final Memento getMemento(int index) {
        return mementos.get(index);
    }

    public final void clearAll() {
        mementos.clear();
    }
}
