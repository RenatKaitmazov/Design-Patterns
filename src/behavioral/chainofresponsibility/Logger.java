package behavioral.chainofresponsibility;

/**
 * @author Renat Kaitmazov
 */

public abstract class Logger {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    public static final int INFO    = 1;
    public static final int DEBUG   = 2;
    public static final int ERROR   = 3;

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private Logger nextLogger;
    private final int level;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    Logger(int level) {
        this.level = level;
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public final void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /*--------------------------------------------------------*/
    /* Abstract methods
    /*--------------------------------------------------------*/

    abstract void write(String message);

    /*--------------------------------------------------------*/
    /* Helper methods
    /*--------------------------------------------------------*/

    final void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    final int getLevel() {
        return level;
    }
}
