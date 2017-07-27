package behavioral.command;

/**
 * @author Renat Kaitmazov
 */

public final class WriteFileCommand implements Command {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final FileSystemReceiver fileSystemReceiver;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    /*--------------------------------------------------------*/
    /* Command implementation
    /*--------------------------------------------------------*/

    @Override
    public final void execute() {
        fileSystemReceiver.writeFile();
    }
}
