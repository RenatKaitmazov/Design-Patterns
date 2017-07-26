package behavioral.chainofresponsibility;

/**
 * @author Renat Kaitmazov
 */

public final class ErrorLogger extends Logger {

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    ErrorLogger(int level) {
        super(level);
    }

    /*--------------------------------------------------------*/
    /* Logger implementation
    /*--------------------------------------------------------*/

    @Override
    public final void write(String message) {
        System.out.printf("Error Console Logger: %s\n", message);
    }
}
