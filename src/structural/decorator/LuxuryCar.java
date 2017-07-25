package structural.decorator;

/**
 * @author Renat Kaitmazov
 */

public final class LuxuryCar extends CarDecorator {

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public LuxuryCar(Car car) {
        super(car);
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    @Override
    public final void assemble() {
        super.assemble();
        System.out.println("Adding capabilities of a luxury car.");
    }
}
