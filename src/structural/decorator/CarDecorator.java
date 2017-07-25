package structural.decorator;

/**
 * @author Renat Kaitmazov
 */

public abstract class CarDecorator implements Car {

    /*--------------------------------------------------------*/
    /* Instance variables
    /*--------------------------------------------------------*/

    protected Car car;

    /*--------------------------------------------------------*/
    /* Constructors
    /*--------------------------------------------------------*/

    public CarDecorator(Car car) {
        this.car = car;
    }

    /*--------------------------------------------------------*/
    /* Car implementation
    /*--------------------------------------------------------*/

    @Override
    public void assemble() {
        car.assemble();
    }
}
