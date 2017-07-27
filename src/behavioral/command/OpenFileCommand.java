package behavioral.command;

/**
 * @author Renat Kaitmazov
 */

public final class OpenFileCommand implements Command {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private final FileSystemReceiver fileSystemReceiver;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    /*--------------------------------------------------------*/
    /* Command implementation
    /*--------------------------------------------------------*/

    @Override
    public final void execute() {
        fileSystemReceiver.openFile();
    }
}
