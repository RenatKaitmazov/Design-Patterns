package behavioral.chainofresponsibility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class LoggerTest {

    @Test
    public final void loggerTest() throws Exception {
        final Logger loggerChain = LoggerFactory.getLoggerChain();

        loggerChain.logMessage(Logger.INFO, "All services has been successfully started");
        System.out.println();
        loggerChain.logMessage(Logger.DEBUG, "The value of isNegative is true");
        System.out.println();
        loggerChain.logMessage(Logger.ERROR, "404, The requested resource has not been found");
    }

}