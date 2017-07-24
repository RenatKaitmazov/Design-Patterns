package structural.proxy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class CommandExecutorProxyTest {

    private CommandExecutor adminExecutor;
    private CommandExecutor nonAdminExecutor;

    @Before
    public final void setup() {
        adminExecutor = new CommandExecutorProxy("renatkaitmazov", "29.09.1990");
        nonAdminExecutor = new CommandExecutorProxy("admin", "admin");
    }

    @Test
    public final void runCommandAdminModeTest() throws Exception {
        String actual = "correct";
        try {
            adminExecutor.runCommand("rm -rf /RenatKaitmazov/Documents");
        } catch (Exception e) {
            actual = "failed";
        }
        assertEquals("correct", actual);
    }

    @Test
    public final void runCommandNonAdminModeTest() throws Exception {
        String actual = "actual";
        try {
            nonAdminExecutor.runCommand("rm -rf /");
        } catch (Exception e) {
            actual = "failed";
        }
        assertEquals("failed", actual);

        try {
            nonAdminExecutor.runCommand("pwd");
            actual = "correct";
        } catch (Exception e) {
            actual = "failed";
        }
        assertEquals("correct", actual);
    }
}