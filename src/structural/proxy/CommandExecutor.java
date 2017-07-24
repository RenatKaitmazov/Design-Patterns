package structural.proxy;

/**
 * @author Renat Kaitmazov
 */

/**
 * An interface with common methods
 */
public interface CommandExecutor {
    void runCommand(String command) throws Exception;
}
