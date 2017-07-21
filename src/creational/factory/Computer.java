package creational.factory;

/**
 * @author Renat Kaitmazov
 */

public abstract class Computer {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    protected int ramAmountInGb;
    protected int diskCapacityInGb;
    protected int cpuCoreAmount;

    /*--------------------------------------------------------*/
    /* Getters and Setters
    /*--------------------------------------------------------*/

    public int getRamAmount() {
        return ramAmountInGb;
    }

    public void setRamAmount(int ramAmountInGb) {
        this.ramAmountInGb = ramAmountInGb;
    }

    public int getDiskCapacity() {
        return diskCapacityInGb;
    }

    public void setDiskCapacity(int diskCapacityInGb) {
        this.diskCapacityInGb = diskCapacityInGb;
    }

    public int getCpuCores() {
        return cpuCoreAmount;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCoreAmount = cpuCores;
    }

    /*--------------------------------------------------------*/
    /* Abstract methods
    /*--------------------------------------------------------*/

    public abstract String getType();

    /*--------------------------------------------------------*/
    /* Object class methods
    /*--------------------------------------------------------*/

    @Override
    public final String toString() {
        return String.format("%s\n Has %d core CPU, %dGb of RAM, and %dGb of disk capacity.",
                getType(),
                cpuCoreAmount,
                ramAmountInGb,
                diskCapacityInGb
        );
    }
}
