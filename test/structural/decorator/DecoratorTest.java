package structural.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

public class DecoratorTest {


    @Test
    public final void decoratorTest() throws Exception {
        final Car basicCar = new BasicCar();
        final Car sportsCar = new SportsCar(basicCar);
        final Car luxuryCar = new LuxuryCar(basicCar);

        basicCar.assemble();
        System.out.println();
        sportsCar.assemble();
        System.out.println();
        luxuryCar.assemble();
    }
}