package structural.decorator;

/**
 * @author Renat Kaitmazov
 */

public class SportsCar extends CarDecorator {

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public SportsCar(Car car) {
        super(car);
    }

    /*--------------------------------------------------------*/
    /* API
    /*--------------------------------------------------------*/

    @Override
    public final void assemble() {
        super.assemble();
        System.out.println("Adding capabilities of a sports car.");
    }
}
