package creational.factory;

/**
 * @author Renat Kaitmazov
 */

public final class Notebook extends Computer {

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public Notebook(int cpuCoreAmount, int ramAmountInGb, int diskCapacityInGb) {
        this.cpuCoreAmount = cpuCoreAmount;
        this.ramAmountInGb = ramAmountInGb;
        this.diskCapacityInGb = diskCapacityInGb;
    }

    /*--------------------------------------------------------*/
    /* Abstract method implementation
    /*--------------------------------------------------------*/

    @Override
    public final String getType() {
        return "Notebook";
    }
}
