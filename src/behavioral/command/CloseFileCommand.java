package behavioral.command;

/**
 * @author Renat Kaitmazov
 */

public final class CloseFileCommand implements Command {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final FileSystemReceiver fileSystemReceiver;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    /*--------------------------------------------------------*/
    /* Command implementation
    /*--------------------------------------------------------*/

    @Override
    public final void execute() {
        fileSystemReceiver.closeFile();
    }
}
