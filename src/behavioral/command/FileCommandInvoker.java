package behavioral.command;

/**
 * @author Renat Kaitmazov
 */

public final class FileCommandInvoker {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final Command command;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public FileCommandInvoker(Command command) {
        this.command = command;
    }

    /*--------------------------------------------------------*/
    /* Command implementation
    /*--------------------------------------------------------*/

    public final void execute() {
        command.execute();
    }
}
