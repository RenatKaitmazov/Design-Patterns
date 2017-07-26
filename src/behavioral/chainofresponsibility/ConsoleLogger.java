package behavioral.chainofresponsibility;

/**
 * @author Renat Kaitmazov
 */

public final class ConsoleLogger extends Logger {

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    ConsoleLogger(int level) {
        super(level);
    }

    /*--------------------------------------------------------*/
    /* Logger implementation
    /*--------------------------------------------------------*/

    @Override
    public final void write(String message) {
        System.out.printf("Standard Console Logger: %s\n", message);
    }
}
