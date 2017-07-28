package behavioral.memento;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

public final class MementoTest {

    private Originator originator;
    private Caretaker caretaker;

    @Before
    public final void setup() {
        originator = new Originator("A very simple article");
        caretaker = new Caretaker();
    }

    @Test
    public final void mementoTest() throws Exception {
        caretaker.addMemento(originator.saveState());
        originator.setArticle("Another simple article");
        caretaker.addMemento(originator.saveState());
        originator.setArticle("A little bit harder article");
        caretaker.addMemento(originator.saveState());

        originator.restoreState(caretaker.getMemento(0));
        originator.restoreState(caretaker.getMemento(2));
        originator.restoreState(caretaker.getMemento(1));
    }

}