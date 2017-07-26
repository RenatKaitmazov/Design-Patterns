package behavioral.chainofresponsibility;

/**
 * @author Renat Kaitmazov
 */

public final class FileLogger extends Logger {

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    FileLogger(int level) {
        super(level);
    }

    /*--------------------------------------------------------*/
    /* Logger implementation
    /*--------------------------------------------------------*/

    @Override
    public final void write(String message) {
        System.out.printf("File Logger: %s\n", message);
    }
}
