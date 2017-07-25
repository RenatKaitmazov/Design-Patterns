package structural.decorator;

/**
 * @author Renat Kaitmazov
 */

public final class BasicCar implements Car {

    @Override
    public final void assemble() {
        System.out.println("Assembling a basic car.");
    }
}
