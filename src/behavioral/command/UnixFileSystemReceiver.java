package behavioral.command;

/**
 * @author Renat Kaitmazov
 */

public final class UnixFileSystemReceiver implements FileSystemReceiver {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    private static final String SYSTEM_NAME = "UNIX system";

    /*--------------------------------------------------------*/
    /* FileSystemReceiver implementation
    /*--------------------------------------------------------*/

    @Override
    public final void openFile() {
        System.out.println("Opening file in " + SYSTEM_NAME);
    }

    @Override
    public final void writeFile() {
        System.out.println("Writing file in " + SYSTEM_NAME);
    }

    @Override
    public final void closeFile() {
        System.out.println("Closing file in " + SYSTEM_NAME);
    }
}
