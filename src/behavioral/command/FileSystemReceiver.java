package behavioral.command;

/**
 * @author Renat Kaitmazov
 */

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
