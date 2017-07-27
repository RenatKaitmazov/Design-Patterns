package behavioral.command;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class CommandTest {


    @Test
    public final void commandTest() throws Exception {
        final String currentOsName = System.getProperty("os.name");
        System.out.println("The underlying OS is " + currentOsName);

        final FileSystemReceiver fileSystemReceiver;
        if (currentOsName.contains("Windows")) {
            fileSystemReceiver = new WindowsFileSystemReceiver();
        } else {
            fileSystemReceiver = new UnixFileSystemReceiver();
        }

        final Command openFileCommand = new OpenFileCommand(fileSystemReceiver);
        FileCommandInvoker fileCommandInvoker = new FileCommandInvoker(openFileCommand);
        fileCommandInvoker.execute();
        System.out.println();

        final Command writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        fileCommandInvoker = new FileCommandInvoker(writeFileCommand);
        fileCommandInvoker.execute();
        System.out.println();

        final Command closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        fileCommandInvoker = new FileCommandInvoker(closeFileCommand);
        fileCommandInvoker.execute();
    }
}