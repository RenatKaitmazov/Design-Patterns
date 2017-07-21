package creational.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class ComputerFactoryTest {

    @Test
    public final void computerFactoryReturnsCorrectComputerTypeTest() throws Exception {
        final Computer server = ComputerFactory.getComputer(ComputerFactory.COMPUTER_TYPE_SERVER, 32, 128, 4096);
        final Computer notebook = ComputerFactory.getComputer(ComputerFactory.COMPUTER_TYPE_NOTEBOOK, 4, 8, 256);

        assertTrue(server.getClass() == Server.class);
        assertTrue(notebook.getClass() == Notebook.class);
        assertEquals(server.getType(), "Server");
        assertEquals(server.getType(), "Notebook");
    }
}