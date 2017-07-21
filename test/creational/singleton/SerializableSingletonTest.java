package creational.singleton;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.*;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class SerializableSingletonTest {

    private SerializableSingleton singleton;

    @Before
    public final void setup() {
        singleton = SerializableSingleton.getInstance();
    }

    @Test
    public final void receiveTheSameObjectAfterSerializationTest() throws Exception {
        final File file = new File("test/creational/singleton/singleton.bin");
        final FileOutputStream fileOutput = new FileOutputStream(file);
        final ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
        objectOutput.writeObject(singleton);

        final FileInputStream fileInput = new FileInputStream(file);
        final ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        final SerializableSingleton restoredSingleton = (SerializableSingleton) objectInput.readObject();

        final int expectedHashCode = singleton.hashCode();
        final int actualHashCode = restoredSingleton.hashCode();
        assertEquals(expectedHashCode, actualHashCode);
    }
}
