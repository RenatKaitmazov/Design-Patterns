package behavioral.chainofresponsibility;

/**
 * @author Renat Kaitmazov
 */

public final class LoggerFactory {

    /*--------------------------------------------------------*/
    /* Nested classes
    /*--------------------------------------------------------*/

    private static final class Nested {

        /*--------------------------------------------------------*/
        /* Static variables
        /*--------------------------------------------------------*/

        private static final Logger HEAD = new ErrorLogger(Logger.ERROR);

        static {
            final Logger debug = new FileLogger(Logger.DEBUG);
            final Logger console = new ConsoleLogger(Logger.INFO);

            HEAD.setNextLogger(debug);
            debug.setNextLogger(console);
        }
    }

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    private LoggerFactory() {
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public static Logger getLoggerChain() {
        return Nested.HEAD;
    }
}
