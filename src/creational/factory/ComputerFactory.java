package creational.factory;

/**
 * @author Renat Kaitmazov
 */

public final class ComputerFactory {

    /*--------------------------------------------------------*/
    /* Static variables
    /*--------------------------------------------------------*/

    public static final int COMPUTER_TYPE_SERVER = 1;
    public static final int COMPUTER_TYPE_NOTEBOOK = 2;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    private ComputerFactory() {
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    public static Computer getComputer(int computerType, int cpuCores, int ramAmountInGb, int diskCapacityInGb) {
        switch (computerType) {
            case COMPUTER_TYPE_SERVER:
                return new Server(cpuCores, ramAmountInGb, diskCapacityInGb);
            case COMPUTER_TYPE_NOTEBOOK:
                return new Notebook(cpuCores, ramAmountInGb, diskCapacityInGb);
            default:
                throw new IllegalArgumentException("Unknown computer type: " + computerType);
        }
    }
}
