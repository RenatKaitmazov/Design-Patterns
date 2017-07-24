package structural.proxy;

/**
 * @author Renat Kaitmazov
 */

public final class CommandExecutorProxy implements CommandExecutor {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    private CommandExecutor realExecutor;
    private boolean isAdmin;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public CommandExecutorProxy(String userName, String password) {
        isAdmin = "renatkaitmazov".equals(userName) && "29.09.1990".equals(password);
    }

    @Override
    public void runCommand(String command) throws Exception {
        if (command == null || command.isEmpty()) {
            throw new IllegalArgumentException("Null or empty command.");
        }

        final boolean isRemoveCommand = command.trim().startsWith("rm");
        if (isRemoveCommand && !isAdmin) {
            throw new IllegalAccessException("rm command can only be performed in admin mode.");
        }

        if (realExecutor == null) {
            realExecutor = new CommandExecutorImpl();
        }
        realExecutor.runCommand(command);
    }
}
