package structural.proxy;

/**
 * @author Renat Kaitmazov
 */

public final class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String command) throws Exception {
        Runtime.getRuntime().exec(command);
        System.out.printf("\'%s\' command executed.\n", command);
    }
}
